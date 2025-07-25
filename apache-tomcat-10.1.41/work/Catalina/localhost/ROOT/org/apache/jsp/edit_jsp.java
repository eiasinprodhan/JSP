/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.41
 * Generated at: 2025-07-03 09:53:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import model.Employee;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(2);
    _jspx_imports_classes.add("model.Employee");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write('\n');

    Employee e = (Employee) request.getAttribute("employee");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Edit Employee</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body class=\"bg-light\">\n");
      out.write("        <div class=\"container mt-5\">\n");
      out.write("            <div class=\"row justify-content-center\">\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"card shadow-sm\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <h3 class=\"card-title text-center mb-4\">Edit Employee</h3>\n");
      out.write("                            <form action=\"employeeservlet\" method=\"post\">\n");
      out.write("                                <input name=\"id\" type=\"hidden\" value=\"");
      out.print( e.getId() );
      out.write("\">\n");
      out.write("                                <input name=\"action\" type=\"hidden\" value=\"update\">\n");
      out.write("\n");
      out.write("                                <div class=\"mb-3\">\n");
      out.write("                                    <label for=\"name\" class=\"form-label\">Name</label>\n");
      out.write("                                    <input name=\"name\" type=\"text\" id=\"name\" class=\"form-control\" \n");
      out.write("                                           value=\"");
      out.print( e.getName() );
      out.write("\" placeholder=\"Enter name\" required>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"mb-3\">\n");
      out.write("                                    <label for=\"designation\" class=\"form-label\">Designation</label>\n");
      out.write("                                    <select name=\"designation\" class=\"form-select\" id=\"designation\">\n");
      out.write("                                        <option value=\"CEO\" ");
      out.print( "CEO".equals(e.getDesignation()) ? "selected" : "" );
      out.write(">CEO</option>\n");
      out.write("                                        <option value=\"Project Manager\" ");
      out.print( "Project Manager".equals(e.getDesignation()) ? "selected" : "" );
      out.write(">Project Manager</option>\n");
      out.write("                                        <option value=\"Senior Software Developer\" ");
      out.print( "Senior Software Developer".equals(e.getDesignation()) ? "selected" : "" );
      out.write(">Senior Software Developer</option>\n");
      out.write("                                        <option value=\"Junior Software Developer\" ");
      out.print( "Junior Software Developer".equals(e.getDesignation()) ? "selected" : "" );
      out.write(">Junior Software Developer</option>\n");
      out.write("                                        <option value=\"Intern Software Developer\" ");
      out.print( "Intern Software Developer".equals(e.getDesignation()) ? "selected" : "" );
      out.write(">Intern Software Developer</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"mb-3\">\n");
      out.write("                                    <label for=\"salary\" class=\"form-label\">Salary</label>\n");
      out.write("                                    <input name=\"salary\" type=\"number\" id=\"salary\" class=\"form-control\" \n");
      out.write("                                           value=\"");
      out.print( e.getSalary() );
      out.write("\" placeholder=\"Enter salary\" required>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary w-100\">Update Employee</button>\n");
      out.write("                            </form>\n");
      out.write("                            <div class=\"text-center mt-3\">\n");
      out.write("                                <a href=\"index.jsp\" class=\"text-decoration-none\">← Back to Employee List</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
