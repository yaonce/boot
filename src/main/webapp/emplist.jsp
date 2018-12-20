<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
	request.setAttribute("path", request.getContextPath());
 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>emplist</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/style.css" />
	</head>
	<body>
		<div id="wrap">
			<div id="top_content"> 
				<div id="header">
					<div id="rightheader">
						<p>
							<a href="${pageContext.request.contextPath }/user/u_safeOut">离开</a>
						</p>
						<p>
							2009/11/20
							<br />
						</p>
					</div>
					<div id="topheader">
						<h1 id="title">
							<a href="#">main</a>
						</h1>
					</div>
					<div id="navigation">
					</div>
				</div>
				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						Welcome!!!!
					</h1>
					<table class="table">
					
						<tr class="table_header">
							<td>
								ID
							</td>
							<td>
								Name
							</td>
							<td>
								Salary
							</td>
							<td>
								Age
							</td>
							<td>
								deptName
							</td>
							<td>
								Operation
							</td>
						</tr>
					
					<c:forEach items="${list }" var="l" >
					
						<tr class="row1">
							<td>
								${l.id}
							</td>
							<td>
								${l.name}
							</td>
							<td>
								${l.salary}
							</td>
							<td>
								${l.age}
							</td>
							<td>
								${l.deptName}
							</td>
							<td>
								<a href="${pageContext.request.contextPath }/worker/delete.do?id=${l.id}">delete emp</a>&nbsp;
								<a href="${pageContext.request.contextPath }/worker/queryById.do?id=${l.id}">update emp</a>
							</td>
						</tr>
					</c:forEach>	
						
					</table>
					<p>
						<input type="button" class="button" value="Add Employee" onclick="location='${pageContext.request.contextPath}/dept/queryAll.do'"/>
					</p>
				</div>
			</div>
			<div id="footer">
				<div id="footer_bg">
				ABC@126.com
				</div>
			</div>
		</div>
	</body>
</html>
