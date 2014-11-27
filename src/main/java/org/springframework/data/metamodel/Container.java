package org.springframework.data.metamodel;

import org.springframework.data.metamodel.types.Value;

import java.io.Serializable;
import java.util.Map;

public interface Container extends Serializable {
	Integer getId();

	void setId(Integer id);

	Map<String, Value> getFactSheet();

	void setFactSheet(Map<String, Value> factSheet);
}
