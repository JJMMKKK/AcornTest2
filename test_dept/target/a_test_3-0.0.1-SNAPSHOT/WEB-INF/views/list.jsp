<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>

	<table border="1">
	  <tr>
	    <td>부서번호</td>
	    <td>부서이름</td>
	    <td>지역이름</td>
	  </tr>
	  
	<c:forEach var="dept" items="${selectAll}">
		<tr>
			<td>${dept.deptno} </td>
			<td>${dept.dname} </td>
			<td>${dept.loc} </td>
		</tr>
	</c:forEach>
	
</table>

</body>

</html>