package com.krowd.controller;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import java.security.Key;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.krowd.service.AuthenticationServiceImpl;

@Controller
public class LoginController {
	
	//Setting the signing key for the algorithm we will use
	//for the authentication
	Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
	
	
	
	public LoginController(LoginService) {
		
	}
	
	private AuthenticationServiceImpl authServiceImpl;

	// deliver static resources from an endpoint "/login"
	@GetMapping(value = "/login")
	public String getStaticLoginPage() {
		return "forward:/static/staticLogin.html";
	}

	// handle form data sent to "/login"
	@PostMapping(value = "/login", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public RedirectView handleFormRequest(@RequestBody MultiValueMap<String, String> formParams, RedirectAttributes attributes) {
		//System.out.println("form params received: " + formParams);
		// process form data
		User u = loginService.validateUser(formParams.getFirst("username"), formParams.getFirst("password"));
		if (u == null) {
			// redirect to error page
			return new RedirectView("error");
		} else {
			// redirect to profile
			attributes.addFlashAttribute("user",u);
			return new RedirectView("profile");
		}
	}
	
	@GetMapping(value="/error")
	public String getErrorPage() {
		return "error";
	}
	
	

}
