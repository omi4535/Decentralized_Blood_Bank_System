/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.71
 * Generated at: 2023-07-22 16:16:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005fpage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1688497413780L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1688376111741L));
    _jspx_dependants.put("/NavBar.jsp", Long.valueOf(1690042563423L));
    _jspx_dependants.put("jar:file:/D:/java%20advance/blood%20bank/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/blood%20bank%20system/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("      \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Blood Inventory Admin</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        body {\r\n");
      out.write("            font-family: Arial, sans-serif;\r\n");
      out.write("            background-color: #f5f5f5;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        h1 {\r\n");
      out.write("            color: #b9132f;\r\n");
      out.write("            margin-bottom: 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        table {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            border-collapse: collapse;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        th, td {\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            border: 1px solid #ccc;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        th {\r\n");
      out.write("            background-color: #f2f2f2;\r\n");
      out.write("            text-align: left;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .button {\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("            padding: 8px 12px;\r\n");
      out.write("            background-color: #b9132f;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            border: none;\r\n");
      out.write("            border-radius: 4px;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .button:hover {\r\n");
      out.write("            background-color: #870f25;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .button-red {\r\n");
      out.write("            background-color: #e74c3c;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .button-red:hover {\r\n");
      out.write("            background-color: #c0392b;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .button-blue {\r\n");
      out.write("            background-color: #3498db;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .button-blue:hover {\r\n");
      out.write("            background-color: #2980b9;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .container1 {\r\n");
      out.write("            max-width: 1000px;\r\n");
      out.write("            margin: 30px auto;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            background-color: #fff;\r\n");
      out.write("            border: 1px solid #ccc;\r\n");
      out.write("            border-radius: 4px;\r\n");
      out.write("            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .blood-bank {\r\n");
      out.write("            margin-top: 30px;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            background-color: #eee;\r\n");
      out.write("            border: 1px solid #ccc;\r\n");
      out.write("            border-radius: 4px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .blood-bank h2 {\r\n");
      out.write("            color: #b9132f;\r\n");
      out.write("            margin-bottom: 10px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .blood-bank p {\r\n");
      out.write("            color: #555;\r\n");
      out.write("            margin-bottom: 10px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .blood-bank .button {\r\n");
      out.write("            margin-top: 10px;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-color:#82bbed\">\r\n");
      out.write("    ");
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
      out.write("    ");
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
    response.setHeader("Pragma", "no-cache");
    response.setHeader("Expires", "0");
    	if(session.getAttribute("admin_id")==null){
    		response.sendRedirect("login.jsp");
    	}
    	int i=0;
    	
    
      out.write("\r\n");
      out.write("    <div class=\"container1\">\r\n");
      out.write("        <h1>Blood Inventory Admin</h1>\r\n");
      out.write("        <table>\r\n");
      out.write("            <tr>\r\n");
      out.write("            	<th>Inventory Id</th>\r\n");
      out.write("                <th>Bank ID</th>\r\n");
      out.write("                <th>Blood Group </th>\r\n");
      out.write("                <th>Available Units</th>\r\n");
      out.write("                <th>Last Updated Date</th>\r\n");
      out.write("                <th>Storage Location</th>\r\n");
      out.write("                <th>Editor id</th>\r\n");
      out.write("                <th>Actions</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      boolean _jspx_th_c_005fforEach_005f0_reused = false;
      try {
        _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
        _jspx_th_c_005fforEach_005f0.setParent(null);
        // /admin_page.jsp(124,12) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/admin_page.jsp(124,12) '${inventories}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${inventories}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
        // /admin_page.jsp(124,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f0.setVar("bloodInventory");
        int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
        try {
          int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
          if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("                ");
i++; 
              out.write("\r\n");
              out.write("                <tr>\r\n");
              out.write("                	<td>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bloodInventory.inventoryId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</td>\r\n");
              out.write("                    <td>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bloodInventory.bloodBankId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</td>\r\n");
              out.write("                    <td>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bloodInventory.bloodGroup}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</td>\r\n");
              out.write("                    <td>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bloodInventory.availableUnits}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</td>\r\n");
              out.write("                    <td>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bloodInventory.lastUpdatedDate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</td>\r\n");
              out.write("                    <td>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bloodInventory.storageLocation}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</td>\r\n");
              out.write("                    <td>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bloodInventory.editor}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</td>\r\n");
              out.write("                    <td class=\"button_col\" style=\"text-align: center;\">\r\n");
              out.write("                        <div class=\"button-container\">\r\n");
              out.write("                            <form action=\"edit_set_id\" method=\"post\">\r\n");
              out.write("                                <input hidden name=\"in_id1\" value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bloodInventory.inventoryId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("\" />\r\n");
              out.write("                                <button class=\"button button-blue\">Edit</button>\r\n");
              out.write("                            </form>\r\n");
              out.write("                            <form action=\"delete_inventory\" method=\"post\">\r\n");
              out.write("                                <input hidden name=\"in_id\" value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bloodInventory.inventoryId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("\" />\r\n");
              out.write("                                <button class=\"button button-red\">Delete</button>\r\n");
              out.write("                            </form>\r\n");
              out.write("                        </div>\r\n");
              out.write("                    </td>\r\n");
              out.write("                </tr>\r\n");
              out.write("            ");
              int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            return;
          }
        } catch (java.lang.Throwable _jspx_exception) {
          while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
            out = _jspx_page_context.popBody();
          _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
        } finally {
          _jspx_th_c_005fforEach_005f0.doFinally();
        }
        _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
        _jspx_th_c_005fforEach_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
      }
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("        <br>\r\n");
      out.write("        <form action=\"add_new_inventory.jsp\" method=\"post\">\r\n");
      out.write("            <button class=\"button\" style=\"display: block; margin: 0 auto;\">Add New Blood Inventory</button>\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"blood-bank\">\r\n");
      out.write("            <h2>Blood Bank Information</h2>\r\n");
      out.write("            <p>Name: ABC Blood Bank</p>\r\n");
      out.write("            <p>Address: 123 Main Street, City</p>\r\n");
      out.write("            <p>Contact: +1 123 456 7890</p>\r\n");
      out.write("            <button class=\"button\">Visit Blood Bank Website</button>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
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
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /admin_page.jsp(148,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i}==0", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            	<h2>\r\n");
          out.write("            		no data avaliable\r\n");
          out.write("            	</h2>\r\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }
}
