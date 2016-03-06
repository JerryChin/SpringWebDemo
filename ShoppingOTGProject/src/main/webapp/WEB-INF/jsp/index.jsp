<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style>
#itemslist {
	list-style: none;
	font-family: arial,"microsoft yahei";
}

li {
	width: 240px;
	height: 436px;
	float: left;
	margin-right: 40px;
	margin-top: 10px;
}

.price_tag {
	float: left;
	margin-right: 10px;
	color: #e4393c;
	font-size: 20px;
}

#content {
	max-width: 1200px;
	margin: 0 auto;
}
</style>
<body>
	<h2>
		<spring:message code="header.welcome" />
	</h2>
	<hr />
	<div id="content">
		<ul id="itemslist">

			<c:forEach items="${items}" var="item" varStatus="status">
				<li>
					<div>
						<a href="javascript:void(0)"> <img width="293" height="220"
							src="resources/gfds87rqkj234lj43lkn432.jpg" />
						</a>
					</div>
					<div>
						<strong class="price_tag" data-price="6388.00" data-done="1"><em>￥</em><i>${item.price}</i></strong>
					</div>
					<div>${item.title}</div>
					<div>
						<span>产地: ${item.origin} </span>
					</div>
					<div>
						<form action="cart.htm" method="POST">
							<input type="hidden" name="itemid" value="${item.itemId}" /> <input
								type="submit" value="加入购物篮" />
						</form>
					</div>
				</li>
			</c:forEach>

		</ul>
	</div>

</body>
</html>
