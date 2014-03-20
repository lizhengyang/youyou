package org.apache.jsp.WEB_002dINF.views.account;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>登录悠悠旅游网管理平台</title>\n");
      out.write("\n");
      out.write("\t<!-- The styles -->\n");
      out.write("\t<link id=\"bs-css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/css/bootstrap-cerulean.css\" rel=\"stylesheet\">\n");
      out.write("\t<style type=\"text/css\">\n");
      out.write("\t  body {\n");
      out.write("\t\tpadding-bottom: 40px;\n");
      out.write("\t  }\n");
      out.write("\t  .sidebar-nav {\n");
      out.write("\t\tpadding: 9px 0;\n");
      out.write("\t  }\n");
      out.write("\t</style>\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/css/charisma.css\" rel=\"stylesheet\">\n");
      out.write("\t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/jquery-validation/1.11.1/validate.css\" type=\"text/css\" rel=\"stylesheet\" />\n");
      out.write("\t<!-- The fav icon -->\n");
      out.write("\t<link rel=\"shortcut icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/img/favicon.ico\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("\t\t<div class=\"row-fluid\">\n");
      out.write("\t\t\n");
      out.write("\t\t\t<div class=\"row-fluid\">\n");
      out.write("\t\t\t\t<div class=\"span12 center login-header\">\n");
      out.write("\t\t\t\t\t<h2>欢迎登录悠悠旅游网管理平台</h2>\n");
      out.write("\t\t\t\t</div><!--/span-->\n");
      out.write("\t\t\t</div><!--/row-->\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"row-fluid\">\n");
      out.write("\t\t\t\t<div class=\"well span5 center login-box\">\n");
      out.write("\t\t\t\t");

				String error = (String) request.getAttribute(FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);
				if(error != null){
				
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"alert alert-info\">\n");
      out.write("\t\t\t\t\t\t\t\t\t登录信息有误，请检查后重新输入\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t");

				}
				
      out.write("\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<form class=\"form-horizontal\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/admin/login\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t<fieldset>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"input-prepend\" title=\"用户名\" data-rel=\"tooltip\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"add-on\"><i class=\"icon-user\"></i></span><input autofocus class=\"input-large span10 required\" name=\"username\" id=\"username\" type=\"text\" value=\"\" />\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"input-prepend\" title=\"密码\" data-rel=\"tooltip\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"add-on\"><i class=\"icon-lock\"></i></span><input class=\"input-large span10 required\" name=\"password\" id=\"password\" type=\"password\" value=\"\" />\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"input-prepend\">\n");
      out.write("\t\t\t\t\t\t\t<label class=\"remember\" for=\"remember\"><input type=\"checkbox\" id=\"rememberMe\" style=\"width:1.5em;\" /> 记住登录状态 </label>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<p class=\"center span5\">\n");
      out.write("\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\">登录</button>\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t</fieldset>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div><!--/span-->\n");
      out.write("\t\t\t</div><!--/row-->\n");
      out.write("\t\t\t\t</div><!--/fluid-row-->\n");
      out.write("\t\t\n");
      out.write("\t</div><!--/.fluid-container-->\n");
      out.write("\t\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/js/jquery-1.7.2.min.js\"></script>\n");
      out.write("\t<!-- jQuery UI -->\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/js/jquery-ui-1.8.21.custom.min.js\"></script>\n");
      out.write("\t<!-- transition / effect library -->\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- library for cookie management -->\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/js/jquery.cookie.js\"></script>\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/jquery-validation/1.11.1/jquery.validate.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/static/jquery-validation/1.11.1/messages_bs_zh.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("\t<script>\n");
      out.write("\t\t$(document).ready(function() {\n");
      out.write("\t\t\t$(\"#loginForm\").validate();\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /WEB-INF/views/account/login.jsp(6,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("ctx");
    // /WEB-INF/views/account/login.jsp(6,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/account/login.jsp(6,0) '${pageContext.request.contextPath}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }
}
