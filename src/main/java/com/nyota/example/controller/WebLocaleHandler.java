package com.nyota.example.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.i18n.SessionLocaleResolver;

public class WebLocaleHandler extends SessionLocaleResolver {

	@Override
	public Locale resolveLocale(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return super.resolveLocale(request);
	}

}
