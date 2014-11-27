package org.springframework.data.metamodel.types;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Value_Amount")
@Audited
public class DefaultAmount extends DefaultValue implements Amount {
	@Column
	private Double value;

	@Column
	private String currencyCode;

	public DefaultAmount() {
	}

	public DefaultAmount(Double value, String currencyCode) {
		this.value = value;
		this.currencyCode = currencyCode;
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
	public String getCurrencyCode() {
		return currencyCode;
	}

	@Override
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
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
		DefaultAmount rhs = (DefaultAmount) obj;
		return new EqualsBuilder()
				.appendSuper(super.equals(obj))
				.append(this.value, rhs.value)
				.append(this.currencyCode, rhs.currencyCode)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.appendSuper(super.hashCode())
				.append(value)
				.append(currencyCode)
				.toHashCode();
	}
}
