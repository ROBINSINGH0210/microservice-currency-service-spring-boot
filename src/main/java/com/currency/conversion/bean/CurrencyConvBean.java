package com.currency.conversion.bean;

import java.math.BigDecimal;

public class CurrencyConvBean {
	private Long id;
	private String from;
	private String to;
	private BigDecimal convMul;
	private BigDecimal quantity;
	private BigDecimal totalCalculatedAmount;
	private int port;

	public CurrencyConvBean() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConvMul() {
		return convMul;
	}

	public void setConvMul(BigDecimal convMul) {
		this.convMul = convMul;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getTotalCalculatedAmount() {
		return totalCalculatedAmount;
	}

	public void setTotalCalculatedAmount(BigDecimal totalCalculatedAmount) {
		this.totalCalculatedAmount = totalCalculatedAmount;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CurrencyConvBean [id=").append(id).append(", from=").append(from).append(", to=").append(to)
				.append(", convMul=").append(convMul).append(", quantity=").append(quantity)
				.append(", totalCalculatedAmount=").append(totalCalculatedAmount).append(", port=").append(port)
				.append("]");
		return builder.toString();
	}

	public CurrencyConvBean(Long id, String from, String to, BigDecimal conversionMultiple, BigDecimal quantity,
			BigDecimal totalCalculatedAmount, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.convMul = conversionMultiple;
		this.quantity = quantity;
		this.totalCalculatedAmount = totalCalculatedAmount;
		this.port = port;
	}

}
