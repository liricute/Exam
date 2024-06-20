<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../header.html" %>
<%@include file="menu.jsp" %>

<%--"choose" を使って条件分割で表示内容を変える--%>
<c:choose>

	<%--セッション属性のcartにデータがある場合 --%>
	<c:when  test="${cart.size()>0}">
	<%--"${when test="${session_cart.size()}"を使って --%>
	<%--Item型のlistに登録されている件数を表示 --%>
		<p>${cart.size()}種類の商品があります。</p>
		<hr>
	</c:when>
	<%--上記 --%>
	<c:otherwise>
		<p>カートに商品がありません。</p>
	</c:otherwise>
</c:choose>

<%--tableタグを使ってcartの中身を表示 --%>
<table style="border-collapse:separate;border-spacing:10px;">
<%-- "${session_cart}" の中身を1件ずつ抜き出して処理--%>
<c:forEach var="item" items="${session_cart}">
	<tr>
	<%--item(bean)のproductのidフィールドを表示 --%>
	<td>商品${item.product.id}</td>
	<%--item(bean)のproductのimageフィールドを表示 --%>
	<td><img src="image/${item.product.id}.jpg" height="96"></td>
	<%--item(bean)のproductのnameフィールドを表示 --%>
	<td>${item.product.name}</td>
	<%--item(bean)のproductのpriceフィールドを表示 --%>
	<td>${item.product.price}円</td>
	<%--item(bean)のcountフィールドを表示 --%>
	<td>${item.count}個</td>
	<%--item(bean)のproductのidフィールドが引数 --%>
	<td><a href="CartRemove.action?id=${item.product.id}">カートから削除</a></td>
	</tr>
</c:forEach>
</table>

<%@include file="../footer.html" %>
