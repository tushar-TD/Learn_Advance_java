package controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Hello {
	
	@RequestMapping(value="/hello",method = RequestMethod.GET)
	public String sayHello()
	{
		return "hello";   //view name
	}
}
	
