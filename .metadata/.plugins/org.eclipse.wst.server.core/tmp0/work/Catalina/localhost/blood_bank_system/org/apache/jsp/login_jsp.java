/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.71
 * Generated at: 2023-07-22 16:16:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1688497413780L));
    _jspx_dependants.put("/NavBar.jsp", Long.valueOf(1690042563423L));
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Login</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n");
      out.write("    <style>\r\n");
      out.write("       \r\n");
      out.write("        .login-container {\r\n");
      out.write("            margin-top: 100px;\r\n");
      out.write("            max-width: 400px;\r\n");
      out.write("            background-color: #fff;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("        }\r\n");
      out.write("        .login-container h2 {\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            margin-bottom: 20px;\r\n");
      out.write("        }\r\n");
      out.write("        .form-group {\r\n");
      out.write("            margin-bottom: 20px;\r\n");
      out.write("        }\r\n");
      out.write("        .form-group label {\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("        }\r\n");
      out.write("        .btn-login {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("        }\r\n");
      out.write("        .text-center {\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-color:#82bbed\">\r\n");
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
response.setHeader("Pragma", "no-cache");
response.setHeader("Expires", "0");
 
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Blood Bank Portal</title>\r\n");
      out.write("    \r\n");
      out.write(" <style>\r\n");
      out.write("  #nav {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    color: black;\r\n");
      out.write("    position: relative;\r\n");
      out.write("    top: 10%;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    font-family: \"Neuton\", serif;\r\n");
      out.write("    line-height: 50px;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  header {\r\n");
      out.write("    overflow: hidden;\r\n");
      out.write("    height: 100vh;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    background-size: cover;\r\n");
      out.write("    position: relative;\r\n");
      out.write("    background-attachment: fixed;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  #nav .header-list {\r\n");
      out.write("    display: flex; /* Added */\r\n");
      out.write("    justify-content: flex-end; /* Changed */\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  .header-list ul {\r\n");
      out.write("    margin: 0; /* Added */\r\n");
      out.write("    padding: 0; /* Added */\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  .header-list ul li {\r\n");
      out.write("    list-style: none;\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    padding: 8px 15px;\r\n");
      out.write("    position: relative;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  .header-list ul li a {\r\n");
      out.write("    color: black;\r\n");
      out.write("    font-size: 24px;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    font-family: \"Fredoka One\", cursive;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  .header-list ul li::after {\r\n");
      out.write("    content: \"\";\r\n");
      out.write("    height: 2px;\r\n");
      out.write("    background: #cd5c5c;\r\n");
      out.write("    display: block;\r\n");
      out.write("    margin: auto;\r\n");
      out.write("    transition: 0.5s;\r\n");
      out.write("    width: 0%;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  .header-list ul li:hover::after {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  #nav .fa {\r\n");
      out.write("    display: none;\r\n");
      out.write("  }\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("  <!--    <style>\r\n");
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
      out.write("    </style>-->\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\" background-color:#5899f5;\">\r\n");
      out.write("    <!--  <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\r\n");
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
      out.write("    </nav>-->\r\n");
      out.write("    \r\n");
      out.write("     <div id=\"nav\">\r\n");
      out.write("        <div class=\"header-list\" id=\"headerl\">\r\n");
      out.write("         \r\n");
      out.write("          <ul>\r\n");
      out.write("            <li>\r\n");
      out.write("              <a href=\"index.jsp\">Home</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li><a class=\"scroll\" href=\"registration.jsp\">Register</a></li>\r\n");
      out.write("            <li><a href=\"blood_groups_info.jsp\">Blood Related Info</a></li>\r\n");
      out.write("            <li><a href=\"login.jsp\" target=\"_blank\">Admin Login</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row justify-content-center\">\r\n");
      out.write("            <div class=\"col-md-6\">\r\n");
      out.write("                <div class=\"login-container\">\r\n");
      out.write("                    <h2>Login</h2>\r\n");
      out.write("                    <form action=\"login_servlet\" method=\"POST\">\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"username\">Username:</label>\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"username\" name=\"username\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"password\">Password:</label>\r\n");
      out.write("                            <input type=\"password\" class=\"form-control\" id=\"password\" name=\"password\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary btn-login\">Login</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    <p class=\"text-center\">Don't have an account? <a href=\"registration.jsp\">Register</a></p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <br>\r\n");
      out.write("    ");
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
