<%--教科書P113 LIST 07-07 --%>

<%@page contentType="text/html; charset=UTF-8" %>

<%--カレントディレクトリはJSPのフォルダ(URL)になる --%>
<%@include file="../header.html" %>


<%--メッセージ出力--%>
<p>Hello</p>
<p>includeを利用しています。</p>

<%--Javaプログラムを記野システム日付を表示 --%>
<%--<%--=でJavaプログラムの式の結果を表示することができる--%>

<p><%out.print(new java.util.Date()); %></p>
<%@include file="../footer.html"%>