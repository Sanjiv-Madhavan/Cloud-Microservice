package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class fallbackMethodController {
	
	@RequestMapping("/cardServiceFallback")
	public String cardServiceFallback()
	{
		return "Card service not available, Try again later";
	}
	
	@RequestMapping("/statementServiceFallback")
	public String statementServiceFallback()
	{
		return "Card service not available, Try again later";
	}
	
}
