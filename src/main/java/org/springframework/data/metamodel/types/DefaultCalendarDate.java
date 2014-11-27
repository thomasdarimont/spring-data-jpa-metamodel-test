package org.springframework.data.metamodel.types;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Value_CalendarDate")
@Audited
public class DefaultCalendarDate extends DefaultValue implements CalendarDate {
	@Column
	@Temporal(TemporalType.DATE)
	private Date date;

	public DefaultCalendarDate() {
	}

	public DefaultCalendarDate(Date date) {
		this.date = date;
	}

	@Override
	public Date getDate() {
		return date;
	}

	@Override
	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj == this) {
			return true;
		}
		if (obj.getClass() != getClass()) {
			return false;
		}
		DefaultCalendarDate rhs = (DefaultCalendarDate) obj;
		return new EqualsBuilder()
				.appendSuper(super.equals(obj))
				.append(this.date, rhs.date)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.appendSuper(super.hashCode())
				.append(date)
				.toHashCode();
	}
}
