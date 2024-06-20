package Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class QuestionFilter1 implements Filter {

	@Override
	public void destroy() {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("フィルタの処理①");
		chain.doFilter(request, response);
		System.out.println("フィルタの処理②");

	}

	@Override
	public void init(FilterConfig filterConfig){
		// TODO 自動生成されたメソッド・スタブ

	}

}
