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
			<div class="row" style="background-color:#39D8D8">
				<div class="col-md-12">
					<div class="row">
						<div class="col-md-2">
						</div>
						<div class="col-md-8" style="background-color:#f5f5f5;margin-top:80px">
							<div class="row">
								<!-- left -->
								<div class="col-md-2" style="margin-top:80px">
									<a class="btn btn-block btn-primary" id="changepwd">修改密码</a>
									<a class="btn btn-block btn-primary" id="jointest">查看考试</a>
									<a class="btn btn-block btn-primary" id="Grade">成绩查询</a>
								</div>
								<!-- right -->
								<div class="col-md-10">
								
									<!-- joined test layer -->
									<div class="row" id="newtest" style="height:750px">
										<div class="col-md-12">
											<br>
											<h2>新的考试</h2><br>
											<table class="table">
												<tr class="success">
													<td>考试名</td>								
													<td>考试时间</td>
													<td>总分</td>

												</tr>
												${joined }
											</table>
											<br>
											<h2>已考</h2><br>
											<table class="table">
												<tr class="success">
													<td>考试名</td>																		
													<td>总分</td>
													<td>得分</td>
												</tr>
												${newjoined }
											</table>
										</div>
									</div>		
							</div>
						</div>

					</div>
				</div>
			</div>
		</div>


	</body>

</html>