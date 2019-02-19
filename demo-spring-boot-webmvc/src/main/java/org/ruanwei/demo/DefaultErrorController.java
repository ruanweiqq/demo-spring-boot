package org.ruanwei.demo;

import org.springframework.boot.autoconfigure.web.ErrorProperties;
import org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController;
import org.springframework.boot.web.servlet.error.ErrorAttributes;

//@Controller
public class DefaultErrorController extends BasicErrorController {

	public DefaultErrorController(ErrorAttributes errorAttributes,
			ErrorProperties errorProperties) {
		super(errorAttributes, errorProperties);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return "abc";
	}

}
