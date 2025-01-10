package com.Amazon.utilities;

import org.openqa.selenium.By;

public class ElementFormatter {

	private String elementName;
	private String elementValue;
	private String elementType;
	public static final String XPATH = "XPATH";
	public static final String ID = "ID";

	public ElementFormatter(final String elmenetName, final String elementValue, final String elementType) {
		this.elementName = elmenetName;
		this.elementValue = elementValue;
		this.elementType = elementType;
	}

	public String getElementName() {
		return this.elementName;
	}

	public String getElementValue() {
		return this.elementValue;
	}

	public String getElementType() {
		return this.elementType;
	}

	public By getLocator() {
		// TODO Auto-generated method stub
		return null;
	}

}
