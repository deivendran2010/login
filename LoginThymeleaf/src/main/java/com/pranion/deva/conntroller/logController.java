package com.pranion.deva.conntroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pranion.deva.form.LoginForm;

@Controller
public class logController {
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String my()
	{
		return "login";
	}
   
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String hh(@ModelAttribute(name="loginform")LoginForm loginform,Model model)
	{
		String username=loginform.getUsername();
String password=loginform.getPassword();
if("admin".contentEquals(username) && "admin".equals(password))
{
		return "home";
}
model.addAttribute("InvalidLogin",true);
return "login";

		
	}
}
