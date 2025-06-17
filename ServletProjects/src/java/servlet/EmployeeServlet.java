package servlet;

import dao.EmployeeDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import model.Employee;

@WebServlet("/employeeservlet")
public class EmployeeServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("save".equals(action)) {
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");
            String gender = request.getParameter("gender");
            String designation = request.getParameter("designation");
            float salary = Float.parseFloat(request.getParameter("salary"));

            Employee employee = new Employee(name, email, phone, gender, designation, salary);
            EmployeeDao.setEmployee(employee);

            response.sendRedirect("allemployees.jsp");
        } else if ("update".equals(action)) {
            int id = Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");
            String gender = request.getParameter("gender");
            String designation = request.getParameter("designation");
            float salary = Float.parseFloat(request.getParameter("salary"));
            Employee employee = new Employee(id, name, email, phone, gender, designation, salary);
            EmployeeDao.updateEmployee(employee);
            response.sendRedirect("allemployees.jsp");
        } else if ("search".equals(action)) {
            String keyword = request.getParameter("keyword");
            List<Employee> employee = EmployeeDao.searchEmployees(keyword);
            request.setAttribute("employee", employee);
            request.getRequestDispatcher("searchemployee.jsp").forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("delete".equals(action)) {
            int id = Integer.parseInt(request.getParameter("id"));
            EmployeeDao.deleteEmployee(id);
            response.sendRedirect("allemployees.jsp");
        } else if ("edit".equals(action)) {
            int id = Integer.parseInt(request.getParameter("id"));
            Employee employee = EmployeeDao.getEmployeeByID(id);
            request.setAttribute("employee", employee);
            request.getRequestDispatcher("editemployee.jsp").forward(request, response);
        }
    }

}
