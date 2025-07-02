package Servlet;

import dao.EmployeeDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import model.Employee;

@WebServlet("/employeeservlet")
public class employeeservlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("save".equals(action)) {
            String name = request.getParameter("name");
            String designation = request.getParameter("designation");
            float salary = Float.parseFloat(request.getParameter("salary"));

            Employee employee = new Employee(name,designation, salary);
            EmployeeDao.setEmployee(employee);

            response.sendRedirect("index.jsp");
        } else if ("update".equals(action)) {
            int id = Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("name");
            String designation = request.getParameter("designation");
            float salary = Float.parseFloat(request.getParameter("salary"));
            Employee employee = new Employee(id, name, designation, salary);
            EmployeeDao.updateEmployee(employee);
            response.sendRedirect("index.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("delete".equals(action)) {
            int id = Integer.parseInt(request.getParameter("id"));
            EmployeeDao.deleteEmployee(id);
            response.sendRedirect("index.jsp");
        } else if ("edit".equals(action)) {
            int id = Integer.parseInt(request.getParameter("id"));
            Employee employee = EmployeeDao.getEmployeeByID(id);
            request.setAttribute("employee", employee);
            request.getRequestDispatcher("edit.jsp").forward(request, response);
        }
    }

}
