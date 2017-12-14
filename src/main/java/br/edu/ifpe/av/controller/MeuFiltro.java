package br.edu.ifpe.av.controller;
import javax.servlet.Filter;
import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class MeuFiltro implements Filter{
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		
		HttpSession session = ((HttpServletRequest)request).getSession(false);
		if(session != null && !session.isNew()) {
			chain.doFilter(request, response);
		} else {
			((HttpServletResponse)response).sendRedirect(((HttpServletRequest)request)
					.getContextPath()+"/index.xhtml");
		}
	}
	@Override
	public void destroy() {
	}

}
