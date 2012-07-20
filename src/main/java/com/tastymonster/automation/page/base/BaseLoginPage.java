package com.tastymonster.automation.page.base;

import com.tastymonster.automation.element.base.*;
import com.tastymonster.automation.page.base.AbstractAutomationPage;

public class BaseLoginPage extends AbstractAutomationPage {
	public final TextBoxWebElement loginField = new TextBoxWebElement( "loginField", this ); // formInput
	public final DivWebElement login = new DivWebElement( "login", this ); // divStart
	public final ButtonWebElement btnLogin = new ButtonWebElement( "btnLogin", this ); // formButton
	public final TextBoxWebElement passwordField = new TextBoxWebElement( "passwordField", this ); // formPassword
	public final ButtonWebElement btnRegister = new ButtonWebElement( "btnRegister", this ); // formButton

	    BaseLoginPage() {
	}
	
	public String getPageURI() {
		return "login.vm";
	}
}