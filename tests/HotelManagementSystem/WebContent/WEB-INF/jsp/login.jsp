<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set value="${pageContext.request.contextPath}" scope="page" var="ctx"></c:set>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <meta charset="utf-8" />
    <title>登录</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport" />
    <meta content="" name="description" />
    <meta content="Mosaddek" name="author" />

  <!--[if lt IE 9]>
    <script src='${ctx}/resources/js/html5shiv.js' type='text/javascript'></script>
    <![endif]-->
<link rel="stylesheet" href="${ctx}/resources/stylesheets/bootstrap/bootstrap-responsive.css" type="text/css"></link>
<link rel="stylesheet" href="${ctx}/resources/stylesheets/bootstrap/bootstrap.css" type="text/css"></link>

<link rel="stylesheet" href="${ctx}/resources/stylesheets/light-theme.css" type="text/css"></link>

<script type="text/javascript">

 function reloadImage() {
    document.getElementById('identity').src='${ctx}/loginController/verificationCode.do?ts=' + new Date().getTime();
 }
</script>
  </head>
  
  <body class='contrast-red sign-in contrast-background'>
<div id='wrapper'>
    <div class='application'>
        <div class='application-content'>
            <a href="sign_in.html"><div class='icon-heart'></div>
                <span>华仪酒店管理系统</span>
            </a>
        </div>
    </div>
    <div class='controls'>
        <div class='caret'></div>
        <div class='form-wrapper'>
            <h1 class='text-center'>系统登录</h1>
            <form accept-charset="UTF-8" action="${ctx}/loginController/login.do" method="post" /><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /></div>
                
                <c:if test="${not empty message}">
                 <div class='row-fluid'>
                   <label style="color: red;text-align: center;font-size: 20px;">${message}</label>
                 </div>
                </c:if>
                
                <div class='row-fluid'>
                    <div class='span12 icon-over-input'>
                        <input class="span12" id="username" name="username" placeholder="用户名" type="text" value="admin" />
                        <i class='icon-user muted'></i>
                    </div>
                </div>
                <div class='row-fluid'>
                    <div class='span12 icon-over-input'>
                        <input class="span12" id="password" name="password" placeholder="密码" type="password" value="admin" />
                        <i class='icon-lock muted'></i>
                    </div>
                </div>
                <div class='row-fluid'>
                    <div class='span8 icon-over-input'>
                        <input class="span12" id="code" name="code" placeholder="验证码" type="text"/>
                        <i class='icon-twitter muted'></i>
                    </div>
                    <div class='span4 icon-over-input'>
                        <img id="identity" src="${ctx}/loginController/verificationCode.do" onclick="reloadImage()" />
                    </div>
                </div>
                <label class="checkbox" for="remember_me"><input id="remember_me" name="remember_me" type="checkbox" value="1" />
                    记住密码
                </label>
                <button class="btn btn-block" name="button" type="submit">登 录</button>
            </form>
            <div class='text-center'>
                <hr class='hr-normal' />
                <a href="forgot_password.html">忘记密码?</a>
            </div>
        </div>
    </div>
 <!--    <div class='login-action text-center'>
        <a href="sign_up.html"><i class='icon-user'></i>
            New to Flatty?
            <strong>Sign up</strong>
        </a>
    </div> -->
</div>
  </body>
</html>
