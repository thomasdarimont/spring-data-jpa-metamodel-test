package org.springframework.data.metamodel;

import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseFactoryBean;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

public abstract class DataSourceConfigurer {
	private DataSourceBuilder dataSourceBuilder;

	protected final DataSourceBuilder getDataSourceBuilder() {
		if (dataSourceBuilder == null) {
			dataSourceBuilder = new DataSourceBuilder();
		}
		return dataSourceBuilder;
	}

	public final class DataSourceBuilder {
		private DataSourceBuilder() {
		}

		public DataSource build() throws DataSourceConfigurationException {
			return createDataSource();
		}

		private DataSource createDataSource() throws DataSourceConfigurationException {
			EmbeddedDatabaseFactoryBean embeddedDatabaseFactoryBean = new EmbeddedDatabaseFactoryBean();
			embeddedDatabaseFactoryBean.setDatabaseType(EmbeddedDatabaseType.HSQL);
			embeddedDatabaseFactoryBean.afterPropertiesSet();
			return embeddedDatabaseFactoryBean.getObject();
		}
	}
}
