package com.currency.conversion.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.currency.conversion.bean.CurrencyConvBean;

@FeignClient(name="forex-service", url="localhost:8000")
public interface CurrencyConvServiceProxy {
	 @GetMapping("/currency-exchange/from/{from}/to/{to}")
	  public CurrencyConvBean retrieveExchangeValue
	    (@PathVariable("from") String from, @PathVariable("to") String to);
}
