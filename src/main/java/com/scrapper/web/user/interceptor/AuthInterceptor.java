package com.scrapper.web.user.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AuthInterceptor extends HandlerInterceptorAdapter{
	private static final Logger LOGGER = LoggerFactory.getLogger(AuthInterceptor.class);

	private void saveBefore(HttpServletRequest request){
		String url = request.getRequestURI();
		String queryString = request.getQueryString();
		
		if(queryString!=null){
			url = url + "?" + queryString;
		}
		
		request.getSession().setAttribute("beforeURL", url);
	}
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		if(session.getAttribute("loginVO") == null){
			// redirect �쟾 誘몃━ �씠�쟾 寃쎈줈瑜� ���옣 
			saveBefore(request);
			response.sendRedirect("/scrapper/user/login");
			// 濡쒓렇�씤 �꽦怨듭씠�썑�뿉�뒗 "beforeURL"�뿉 ���옣�빐�넃�� �뜲�씠�꽣濡� �씠�룞�븳�떎.
			// �뵲�씪�꽌 LoginInterceptor�뿉 �빐�떦 redirect 湲곗닠 
			return false;
		}
		
		return true;
	}
}
