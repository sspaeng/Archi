<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<header id="header-full-top" class="hidden-xs header-full">
	<div class="container">
<!-- 	<div class="header-full-title"> -->
		<div class="">
			<h1 class="text-center"><strong><a href="/home.do">Archi Group</a></strong></h1>
			<!-- <p class="animated fadeInRight"><span>GroupWare</span></p> -->
		</div>
	</div>
	<nav class="top-nav">
		<div class="dropdown animated fadeInDown animation-delay-2">
        <a href="#" class="btn btn-default btn-flat"><i class="fa fa-user"></i>Login</a>
        	<div class="dropdown-menu dropdown-menu-right dropdown-login-box animated flipCenter">
                    <form role="form">
                        <h4>Login Form</h4>
                        <div class="form-group">
                            <div class="input-group login-input">
                                <span class="input-group-addon"><i class="fa fa-user"></i></span>
                                <input type="text" class="form-control" placeholder="Username">
                            </div>
                            <br>
                            <div class="input-group login-input">
                                <span class="input-group-addon"><i class="fa fa-lock"></i></span>
                                <input type="password" class="form-control" placeholder="Password">
                            </div>
                            <div class="checkbox pull-left">
                                  <input type="checkbox" id="checkbox_remember1">
                                  <label for="checkbox_remember1">
                                     Remember me
                                  </label>
                            </div>
                            <button type="submit" class="btn btn-ar btn-primary pull-right">Login</button>
                            <div class="clearfix"></div>
                        </div>
                    </form>
        	</div>
        </div>
		<div class="dropdown animated fadeInDown animation-delay-2">
        <a href="/home.do" class="btn btn-default btn-flat"><i class="fa fa-user"></i>Archi Home</a>
        </div>
	</nav>
</header>

<nav class="navbar navbar-static-top navbar-default navbar-header-full navbar-dark yamm" role="navigation" id="header">
    <div class="container">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <i class="fa fa-bars"></i>
            </button>
            <a id="ar-brand" class="navbar-brand hidden-lg hidden-md hidden-sm" href="index.jsp">Nexus <span>Ware</span></a>
        </div> <!-- navbar-header -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
           
        </div><!-- navbar-collapse -->
    </div><!-- container -->
</nav>