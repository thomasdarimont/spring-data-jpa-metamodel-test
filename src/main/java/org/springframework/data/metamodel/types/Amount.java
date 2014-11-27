package org.springframework.data.metamodel.types;

public interface Amount extends Value {
	Double getValue();

	void setValue(Double value);

	String getCurrencyCode();

	void setCurrencyCode(String currency);
}
