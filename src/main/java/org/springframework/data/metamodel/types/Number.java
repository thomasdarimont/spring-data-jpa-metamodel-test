package org.springframework.data.metamodel.types;

public interface Number extends Value {
	Double getValue();

	void setValue(Double value);
}
