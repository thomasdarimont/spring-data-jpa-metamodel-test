package org.springframework.data.metamodel.types;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Value_LogicalValue")
@Audited
public class DefaultLogicalValue extends DefaultValue implements LogicalValue {
	@Column
	private Boolean value = Boolean.FALSE;

	public DefaultLogicalValue() {
	}

	public DefaultLogicalValue(Boolean value) {
		if (value == null) {
			throw new NullPointerException("The supplied Boolean value must not be null.");
		}
		this.value = value;
	}

	@Override
	public Boolean getValue() {
		return value;
	}

	@Override
	public void setValue(Boolean value) {
		if (value == null) {
			throw new NullPointerException("The supplied Boolean value must not be null.");
		}
		this.value = value;
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
		DefaultLogicalValue rhs = (DefaultLogicalValue) obj;
		return new EqualsBuilder()
				.appendSuper(super.equals(obj))
				.append(this.value, rhs.value)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.appendSuper(super.hashCode())
				.append(value)
				.toHashCode();
	}
}
