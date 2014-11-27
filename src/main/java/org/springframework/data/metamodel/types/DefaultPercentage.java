package org.springframework.data.metamodel.types;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Value_Percentage")
@Audited
public class DefaultPercentage extends DefaultValue implements Percentage {
	@Column
	private Double value;

	public DefaultPercentage() {
	}

	public DefaultPercentage(Double value) {
		this.value = value;
	}

	@Override
	public Double getValue() {
		return value;
	}

	@Override
	public void setValue(Double value) {
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
		DefaultPercentage rhs = (DefaultPercentage) obj;
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
