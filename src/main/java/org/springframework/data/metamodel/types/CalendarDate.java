package org.springframework.data.metamodel.types;

import java.util.Date;

public interface CalendarDate extends Value {
	Date getDate();

	void setDate(Date date);
}
