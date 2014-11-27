package org.springframework.data.metamodel.types;

import java.io.Serializable;
import java.lang.*;
import java.lang.Number;

public interface Value extends Serializable {
	Class[] VALUE_TYPES = {
			Amount.class,
			CalendarDate.class,
			LogicalValue.class,
			Number.class,
			Percentage.class,
			Text.class
	};

	Integer getId();

	void setId(Integer id);
}
