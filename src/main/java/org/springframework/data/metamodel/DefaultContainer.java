package org.springframework.data.metamodel;

import org.hibernate.envers.AuditJoinTable;
import org.springframework.data.metamodel.types.Value;
import org.springframework.data.metamodel.types.DefaultValue;

import javax.persistence.*;
import java.util.LinkedHashMap;
import java.util.Map;

@Entity
@Table(name = "Container")
public class DefaultContainer implements Container {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@OneToMany(cascade = CascadeType.ALL, targetEntity = DefaultValue.class)
	@MapKeyColumn(name = "name")
	@JoinTable(name = "Container_FactSheet")
	@AuditJoinTable(name = "Container_FactSheet_AUD")
	private Map<String, Value> factSheet = new LinkedHashMap<>();

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public Map<String, Value> getFactSheet() {
		return factSheet;
	}

	@Override
	public void setFactSheet(Map<String, Value> factSheet) {
		this.factSheet = factSheet;
	}
}
