package org.springframework.data.metamodel;

import java.beans.PropertyVetoException;

public class DataSourceConfigurationException extends Throwable {
	public DataSourceConfigurationException(String message) {
		super(message);
	}

	public DataSourceConfigurationException(String message, Exception cause) {
		super(message, cause);
	}
}
