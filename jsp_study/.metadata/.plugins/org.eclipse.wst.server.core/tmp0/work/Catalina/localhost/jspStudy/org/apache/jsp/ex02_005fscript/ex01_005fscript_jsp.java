/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.102
 * Generated at: 2025-04-03 04:13:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.ex02_005fscript;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.eclipse.jdt.internal.compiler.ast.ThisReference;

public final class ex01_005fscript_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {


			String msg = "선언문의 msg 변수";
			String getMsg(){
				return msg;
			}
		
  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(2);
    _jspx_imports_classes.add("org.eclipse.jdt.internal.compiler.ast.ThisReference");
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("	<head>\r\n");
      out.write("	<meta charset=\"UTF-8\">\r\n");
      out.write("	<title>script 예제</title>\r\n");
      out.write("	</head>\r\n");
      out.write("	<body>\r\n");
      out.write("		<h1>스크립트의 종류</h1>\r\n");
      out.write("		<p>Java 코드의 영역</p>\r\n");
      out.write("		<ol>\r\n");
      out.write("			<li>스크립트릿(scriptlet) : &lt;% ... %&gt; : 자바 소스의 영역</li>\r\n");
      out.write("			<li>표현식(expression) : &lt;%= %&lt; : 브라우저에 내용 출력</li>\r\n");
      out.write("			<li>선언문(declaration) : &lt;%! %&lt; : 서블릿의 멤버로 변환됨. 사용안함.</li>\r\n");
      out.write("		</ol>\r\n");
      out.write("		<h1>스크립트릿 : _jspService() 메서드 소스에 설정됨.</h1>\r\n");
      out.write("		");

			String msg = "스크립트 예제";
			for(int i=1; i<=10; i++){
		
      out.write("\r\n");
      out.write("		");
      out.print( i + ":" + msg /*여러줄 주석*/ );
      out.write("<br>\r\n");
      out.write("		");
 } 
      out.write("\r\n");
      out.write("		\r\n");
      out.write("		<h1>표현식 : 브라우저에 내용 출력하기</h1>\r\n");
      out.write("		<ul>\r\n");
      out.write("			<li>문자의 끝에 ; 사용 안됨</li>\r\n");
      out.write("			<li>값이 존재햐아함 : 변수,수식,리턴값이 있는 함수</li>\r\n");
      out.write("			");
      out.write(" \r\n");
      out.write("			<li>주석은 반드시 /* */만 사용가능. // 주석표현 불가</li>\r\n");
      out.write("			");
      out.print( msg );
      out.write("\r\n");
      out.write("			");
      out.print( 10 * 10 );
      out.write("\r\n");
      out.write("		</ul>\r\n");
      out.write("		\r\n");
      out.write("		<h1>선언문 : jsp 서블릿의 멤버로 설정됨</h1>\r\n");
      out.write("		");
      out.print( this.msg );
      out.write("<br/>\r\n");
      out.write("		");
      out.print( this.getMsg() );
      out.write("<br/>\r\n");
      out.write("		");
      out.write("\r\n");
      out.write("	</body>\r\n");
      out.write("</html>");
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
