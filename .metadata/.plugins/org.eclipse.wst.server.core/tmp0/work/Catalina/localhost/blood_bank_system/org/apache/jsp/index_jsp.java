/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.71
 * Generated at: 2023-07-05 17:11:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1688497413780L));
    _jspx_dependants.put("/NavBar.jsp", Long.valueOf(1688577116032L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
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

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
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

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Blood Bank Portal</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Blood Bank Portal</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n");
      out.write("    <style>\r\n");
      out.write("        .navbar {\r\n");
      out.write("    background-color: #333;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content: space-between;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  .navbar ul {\r\n");
      out.write("    list-style-type: none;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    display: flex;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  .navbar ul li {\r\n");
      out.write("    margin-right: 15px;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  .navbar ul li a {\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  .navbar ul li a:hover {\r\n");
      out.write("    text-decoration: underline;\r\n");
      out.write("  }\r\n");
      out.write("        \r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <a class=\"navbar-brand\" href=\"index.jsp\">Blood Bank Portal</a>\r\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n");
      out.write("                <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"index.jsp\">Home</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                      <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"blood_groups_info.jsp\">Blood Related Info</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"registration.jsp\">Register</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link\" href=\"banks\">Show All Banks</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container mt-4\">\r\n");
      out.write("        <h1>Welcome to the Blood Bank Portal</h1>\r\n");
      out.write("        <p>Choose an option from the navigation bar to proceed.</p>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <form method=\"post\" action=\"banks\">\r\n");
      out.write("    	<button type=\"submit\"> show all banks</button>\r\n");
      out.write("    </form>\r\n");
      out.write("    <a href=\"login.jsp\"> <button>admin login</button></a>\r\n");
      out.write("    \r\n");
      out.write("     ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>Blood Bank Portal</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("*,\r\n");
      out.write("*:before,\r\n");
      out.write("*:after {\r\n");
      out.write("  -webkit-box-sizing: border-box;\r\n");
      out.write("  -moz-box-sizing:    border-box;\r\n");
      out.write("  box-sizing:         border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("html {\r\n");
      out.write("  height: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("  position: relative;\r\n");
      out.write("  margin: 0;\r\n");
      out.write("  padding-bottom: 4rem;\r\n");
      out.write("  min-height: 100%;\r\n");
      out.write("  font-family: \"Helvetica Neue\", Arial, sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer {\r\n");
      out.write("	background-color: #f8f9fa;\r\n");
      out.write("	padding: 20px;\r\n");
      out.write("	position: relative;\r\n");
      out.write("	right: 0;\r\n");
      out.write("	bottom: 0;\r\n");
      out.write("	left: 0;\r\n");
      out.write("	padding: 1rem;\r\n");
      out.write("	background-color: #efefef;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer-links a {\r\n");
      out.write("	color: #333;\r\n");
      out.write("	margin-right: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer-info {\r\n");
      out.write("	color: #777;\r\n");
      out.write("	font-size: 14px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<footer class=\"footer\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"col-md-6\">\r\n");
      out.write("					<div class=\"footer-links\">\r\n");
      out.write("						<a href=\"index.jsp\">Home</a> \r\n");
      out.write("						<a href=\"registration.jsp\">Register</a>\r\n");
      out.write("						<a href=\"All_banks.jsp\">Show All Banks</a>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-md-6\">\r\n");
      out.write("					<div class=\"footer-info\">\r\n");
      out.write("						&copy; 2023 Blood Bank Portal. All rights reserved. <br>\r\n");
      out.write("						Designed and developed by Omkar Dhage.\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</footer>\r\n");
      out.write("\r\n");
      out.write("	<script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@1.16.0/dist/umd/popper.min.js\"></script>\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@1.16.0/dist/umd/popper.min.js\"></script>\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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
