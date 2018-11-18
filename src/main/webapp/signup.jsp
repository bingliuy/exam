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
	<style>
		.error {
			color: red;
		}
	</style>

	<body>
		
		<script type="text/javascript">
			$(document).ready(function() {
				var name_exist_tag = 0;
				name_exist_tag = $ {
					tag
				};
				if(name_exist_tag == 1) {
					alert("user name exist");
				}
			});
		</script>
		

		<div class="container-fluid">
			<div class="row" style="background-color:#39D8D8;height:768px">
				<div class="col-md-12">
					<div class="row">
						<div class="col-md-4">
						</div>
						<div class="col-md-4" style="background-color:#f5f5f5;margin-top:80px">
							<br><br>
							<h2 style="text-align:center">注册</h2>
							<br><br>
							<form role="form" id="signup" action="${pageContext.request.contextPath}/signup/adduser">
								<div class="form-group">

									<label for="username">
								用户名:
							</label>
									<input type="text" class="form-control" id="username" name="username" />
								</div>
								<div class="form-group">

									<label for="password">
								请输入密码:
							</label>
									<input type="password" class="form-control" id="password" name="password" />
								</div>
								<div class="form-group">

									<label for="rpassword">
								请在此输入密码:
							</label>
									<input type="password" class="form-control" id="rpassword" name="rpassword" />
								</div>
								
								

								<button type="submit" class="btn btn-default" id="btn1">
							确认注册
						</button>
								<br><br>
							</form>


						</div>
						<div class="col-md-4">
						</div>
					</div>
				</div>
			</div>
		</div>
		
	</body>

</html>