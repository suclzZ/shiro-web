/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-03-23 10:21:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class success_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/pages/include.jsp", Long.valueOf(1490264215708L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"scripts/jquery-1.11.0.min.js\"></script>\r\n");
      out.write("<script src=\"scripts/knockout/knockout-3.4.2.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- <script src=\"~/scripts/jquery-1.9.1.min.js\"></script> -->\r\n");
      out.write("<script src=\"scripts/bootstrap/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"scripts/bootstrap/bootstrap-table.min.js\"></script>\r\n");
      out.write("<script src=\"scripts/bootstrap/bootstrap-table-zh-CN.js\"></script>\r\n");
      out.write("<script src=\"scripts/knockout/knockout.mapping-latest.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<link href=\"styles/css/style.css\" rel='stylesheet' type='text/css'/>\r\n");
      out.write("<link href=\"styles/css/bootstrap/bootstrap.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"styles/css/bootstrap/bootstrap-table.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>success</title>\r\n");
      out.write("<script src=\"scripts/knockout.bootstraptable.js\"></script>\r\n");
      out.write("<script src=\"scripts/Department.js\" ></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\t<div class=\"logout\" style=\"float:right;padding:0 20px;\"><a href=\"logout\">退出</a></div>\r\n");
      out.write("\r\n");
      out.write("\t\t <div id=\"toolbar\" class=\"btn-group\">\r\n");
      out.write("            <button id=\"btn_add\" type=\"button\" class=\"btn btn-default\">\r\n");
      out.write("                <span class=\"glyphicon glyphicon-plus\" aria-hidden=\"true\"></span>新增\r\n");
      out.write("            </button>\r\n");
      out.write("            <button id=\"btn_edit\" type=\"button\" class=\"btn btn-default\">\r\n");
      out.write("                <span class=\"glyphicon glyphicon-pencil\" aria-hidden=\"true\"></span>修改\r\n");
      out.write("            </button>\r\n");
      out.write("            <button id=\"btn_delete\" type=\"button\" class=\"btn btn-default\">\r\n");
      out.write("                <span class=\"glyphicon glyphicon-remove\" aria-hidden=\"true\"></span>删除\r\n");
      out.write("            </button>\r\n");
      out.write("        </div>\r\n");
      out.write("\t    <table id=\"tb_dept\" data-bind=\"myBootstrapTable:$root\">\r\n");
      out.write("            <thead>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th data-checkbox=\"true\"></th>\r\n");
      out.write("                    <th data-field=\"name\">部门名称</th>\r\n");
      out.write("                    <th data-field=\"level\">部门级别</th>\r\n");
      out.write("                    <th data-field=\"des\">描述</th>\r\n");
      out.write("                    <th data-field=\"createTime\">创建时间</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("        </table>\r\n");
      out.write("      \r\n");
      out.write("\t\t<div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\">\r\n");
      out.write("            <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                    <div class=\"modal-header\">\r\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("                        <h4 class=\"modal-title\" id=\"myModalLabel\">操作</h4>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-body\">\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"txt_departmentname\">部门名称</label>\r\n");
      out.write("                            <input type=\"text\" name=\"txt_departmentname\" data-bind=\"value:name\" class=\"form-control\" id=\"txt_departmentname\" placeholder=\"部门名称\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"txt_departmentlevel\">部门级别</label>\r\n");
      out.write("                            <input type=\"text\" name=\"txt_departmentlevel\" data-bind=\"value:level\" class=\"form-control\" id=\"txt_departmentlevel\" placeholder=\"部门级别\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"txt_des\">描述</label>\r\n");
      out.write("                            <input type=\"text\" name=\"txt_des\" data-bind=\"value:des\" class=\"form-control\" id=\"txt_des\" placeholder=\"描述\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-footer\">\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\"><span class=\"glyphicon glyphicon-remove\" aria-hidden=\"true\"></span>关闭</button>\r\n");
      out.write("                        <button type=\"button\" id=\"btn_submit\" class=\"btn btn-primary\" data-dismiss=\"modal\"><span class=\"glyphicon glyphicon-floppy-disk\" aria-hidden=\"true\"></span>保存</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>        \r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("      //初始化\r\n");
      out.write("        $(function () {\r\n");
      out.write("            //1、初始化表格\r\n");
      out.write("            tableInit.Init();\r\n");
      out.write("            //2、注册增删改事件\r\n");
      out.write("            operate.operateInit();\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        //初始化表格\r\n");
      out.write("        var tableInit = {\r\n");
      out.write("            Init: function () {\r\n");
      out.write("                //绑定table的viewmodel\r\n");
      out.write("                this.myViewModel = new ko.bootstrapTableViewModel({\r\n");
      out.write("                    url: 'Department/GetDepartment',         //请求后台的URL（*）\r\n");
      out.write("                    method: 'get',                      //请求方式（*）\r\n");
      out.write("                    toolbar: '#toolbar',                //工具按钮用哪个容器\r\n");
      out.write("                    queryParams: function (param) {\r\n");
      out.write("                        return { limit: param.limit, offset: param.offset };\r\n");
      out.write("                    },//传递参数（*）\r\n");
      out.write("                    pagination: true,                   //是否显示分页（*）\r\n");
      out.write("                    sidePagination: \"server\",           //分页方式：client客户端分页，server服务端分页（*）\r\n");
      out.write("                    pageNumber: 1,                      //初始化加载第一页，默认第一页\r\n");
      out.write("                    pageSize: 10,                       //每页的记录行数（*）\r\n");
      out.write("                    pageList: [10, 25, 50, 100],        //可供选择的每页的行数（*）\r\n");
      out.write("                    onLoadSuccess: function(){  //加载成功时执行  \r\n");
      out.write("                        console.info(\"加载成功\");  \r\n");
      out.write("                    },\r\n");
      out.write("                });\r\n");
      out.write("               \r\n");
      out.write("                ko.applyBindings(this.myViewModel, document.getElementById(\"tb_dept\"));\r\n");
      out.write("            }\r\n");
      out.write("        };       \r\n");
      out.write("        </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}