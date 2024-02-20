package kr.co.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.AbstractHandlerExceptionResolver;

public class ExceptionPage extends AbstractHandlerExceptionResolver{

	@Override
	protected ModelAndView doResolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("exception/exceptionPage");
		
		if (handler != null) {
			HandlerMethod hm = (HandlerMethod) handler;
			modelAndView.addObject("errorMethod", hm.getMethod().getName());
		}
		modelAndView.addObject("errorCause", ex.getCause());
		modelAndView.addObject("errorClass", ex.getClass().getSimpleName());
		modelAndView.addObject("errorMessage", ex.getMessage());
		
		return null;
	}
	
}
