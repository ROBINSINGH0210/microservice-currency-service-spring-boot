package com.currency.conversion.controller;

import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.currency.conversion.bean.CurrencyConvBean;
import com.currency.conversion.service.CurrencyConvServiceProxy;

@RestController
public class CurrencyConversionController {
	@Autowired
	private CurrencyConvServiceProxy proxy;

	@GetMapping("/currency-converter-feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConvBean convertCurrencyFeign(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {
		CurrencyConvBean response = proxy.retrieveExchangeValue(from, to);
		System.out.println("response " + response);
		return new CurrencyConvBean(response.getId(), from, to, response.getConversionMultiple(), quantity,
				quantity.multiply(response.getConversionMultiple()), response.getPort());
	}
}
