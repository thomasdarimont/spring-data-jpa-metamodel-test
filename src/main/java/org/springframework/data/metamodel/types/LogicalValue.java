package org.springframework.data.metamodel.types;

public interface LogicalValue extends Value {
	Boolean getValue();

	void setValue(Boolean value);
}
