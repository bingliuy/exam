<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	pageContext.setAttribute("basePath", basePath);
%>


<link href="${basePath}dist/css/bootstrap.css" rel="stylesheet" />
<script src="${basePath}jQuery/jquery-3.31.js"></script>
<script src="${basePath}dist/js/bootstrap.min.js"></script>


</head>

<body>

	<div class="container-fluid">
		<div class="row" style="background-color: #39D8D8; height: 768px">
			<div class="col-md-12">
				<div class="row">
					<div class="col-md-4"></div>
					<div class="col-md-4"
						style="background-color: #f5f5f5; margin-top: 180px">
						<h2 style="text-align: center">Log In</h2>
						<br>
						<form role="form"
							action="跳转页面需要判断是学生还是老师，学生跳转studentpage.jsp，老师跳转tescherpage.jsp">
							<div class="form-group">

								<label for="username"> 用户名: </label> <input type="text"
									class="form-control" id="username" name="username" />
							</div>
							<div class="form-group">

								<label for="password"> 密码: </label> <input type="password"
									class="form-control" id="password" name="password" />
							</div>
							<div class="form-group">
								<div class="col-md-3">
									<button type="submit" class="btn btn-default">登陆</button>
								</div>

								<div class="col-md-6"></div>
								<div class="col-md-3">
									<a href="${basePath}signup.jsp"
										class="btn btn-default">注冊</a>
								</div>
								<div class="col-md-6"></div>
							</div>
							<br> <br> <br> <br>
						</form>
					</div>
					<div class="col-md-4"></div>
				</div>
			</div>
		</div>
	</div>
</body>

</html>