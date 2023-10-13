package com.tag;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

@SuppressWarnings("serial")
public class Welcome extends TagSupport{

	@Override
	public int doStartTag() throws JspException {
		
		try {
			JspWriter out=pageContext.getOut();
			out.print("<h1>Good Morning</h1>");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SKIP_BODY;
	}
	

}
