package chapter3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//パス
//コンテキストパス：http;//localhost:8080
//コンテキストパスからの相対パス：chapter3/hello
//404↓エラー出た確認する
@WebServlet(urlPatterns={"/chapter3/hello"})
public class hello extends HttpServlet{
	public void doGet(
			HttpServletRequest request,HttpServletResponse response)
	throws ServletException,IOException{

		response.setContentType("text/html" //text/html);html要素を画面に表示する。
				+";charset=UTF-8");
		PrintWriter out	=response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("< html>");
		out.println("<head>");
		out.println("<meta charset='UTF-8>");
		out.println("<title>Servlet/JSP Sample Programs</title>");
		out.println("/<head>");
		out.println("<body>");


		out.println("<p>hello!</p>");
		out.println("<p>こんにちは！</p>");
		out.print("<p>"+new java.util.Date()+"</p>");
		out.println("</body>");
		out.println("</html>");

	}


}
