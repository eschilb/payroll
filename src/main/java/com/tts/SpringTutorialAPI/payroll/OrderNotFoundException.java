package com.tts.SpringTutorialAPI.payroll;

class OrderNotFoundException extends RuntimeException {

	OrderNotFoundException(Long id) {
		super("could not find order" + id);
	}
}
