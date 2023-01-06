package com.nitin.gettingstartspringbootweb.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	
	@RequestMapping("/say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello From Nitin Gaikwad";
	}
	
	
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		
		StringBuffer sb = new StringBuffer();
		sb.append("<HTML>");
		sb.append("<HEAD>");
		sb.append("<TITLE>");
		sb.append("Hello Application");
		sb.append("</TITLE>");
		sb.append("</HEAD>");
		sb.append("<BODY>");
		sb.append("Hello Nitin Gaikwad");
		sb.append("</BODY>");
		sb.append("</HTML>");
		
		return sb.toString();
		
	}
	
	@RequestMapping("hello")
	public String sayHelloJSP() {
		return "hello";
	}
	
	
}
