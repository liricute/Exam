<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>

<p>追加する商品を入力してください。</p>
<form action="insert"method="post">
<input type="text" name="name">
<input type="submit" value="追加">
</form>

<%@include file="../footer.html" %>