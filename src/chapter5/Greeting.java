package chapter5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tool.Page;

//ルーテイングURL入ってると実行される＝＝＞chapter5・Qvhieujjjj¥¥¥
@WebServlet(urlPatterns={"/chapter5/greeting"})

public class Greeting extends HttpServlet{

	public void doGet(
			HttpServletRequest request,HttpServletResponse reponse)
	throws ServletException,IOException{
		//画面にお表示するのはURL型のUFT-8で表示
		reponse.setContentType("text/html;charset=UTF-8");
		// 画面に表示する為のメソッドをインタンス
		PrintWriter out=reponse.getWriter();

		request.setCharacterEncoding("UTF-8");
		//
		String user=request.getParameter("user");

        Page.header(out);
		out.println("<p>こんにちは,"+user+"さん！</p>");
		Page.footer(out);
	}

}
