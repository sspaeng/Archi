<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<title>Login Page</title>
	<meta charset="UTF-8">
	<%@ include file="layout/include.jsp" %>
</head>
<body class="bg-color-bk" onKeyDown="onKeyDown();" oncontextmenu="return false" onselectstart="return false" ondragstart="return false">
<!-- main body -->
<section class="margin-bottom">
    <div class="container">
        <div class="row2">
	        <section class="css-section">
	       		<form role="form" action="/logon.do">
                 	<h4>Login Form</h4>
                    <div class="form-group">
                    	<div class="input-group login-input">
                        	<span class="input-group-addon"><i class="fa fa-user"></i></span>
                            	<input name="userId" type="text" class="form-control" placeholder="Username">
                         </div>
                         <br>
                         <div class="input-group login-input">
                         	<span class="input-group-addon"><i class="fa fa-lock"></i></span>
                                <input name="passWord" type="password" class="form-control" placeholder="Password">
                         </div>
                         <div class="checkbox pull-left">
                         	<label>
                            	<input type="checkbox">Remember me
                            </label>
                         </div>
                         <button type="submit" id="btnLogin" class="btn btn-ar btn-primary pull-right">Login</button>
                    	<div class="clearfix"></div>
                	</div>
            	</form>
	       	</section> 
        </div>
    </div>
</section>
</body>
</html>