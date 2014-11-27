package org.springframework.data.metamodel.types;

public interface Text extends Value {
	String getValue();

	void setValue(String value);
}
