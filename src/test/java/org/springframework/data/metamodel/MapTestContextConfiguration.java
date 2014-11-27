package org.springframework.data.metamodel;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.envers.repository.support.EnversRevisionRepositoryFactoryBean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaDialect;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(value = {"org.springframework.data.metamodel"}, repositoryFactoryBeanClass = EnversRevisionRepositoryFactoryBean.class)
public class MapTestContextConfiguration extends DataSourceConfigurer {
	private static final String HIBERNATE_ENVERS_AUDIT_STRATEGY = "org.hibernate.envers.audit_strategy";

	private static final Object HIBERNATE_ENVERS_VALIDITY_AUDIT_STRATEGY = "org.hibernate.envers.strategy.ValidityAuditStrategy";

	private static final String HIBERNATE_EMBEDDED_DB_DIALECT = "org.hibernate.dialect.HSQLDialect";

	@Bean
	public DataSource dataSource() throws DataSourceConfigurationException {
		return getDataSourceBuilder()
				.build();
	}

	@Bean
	public JpaVendorAdapter jpaVendorAdapter() {
		HibernateJpaVendorAdapter hibernateJpaVendorAdapter = new HibernateJpaVendorAdapter();
		hibernateJpaVendorAdapter.setDatabasePlatform(HIBERNATE_EMBEDDED_DB_DIALECT);
		hibernateJpaVendorAdapter.setShowSql(true);
		hibernateJpaVendorAdapter.setGenerateDdl(true);
		return hibernateJpaVendorAdapter;
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() throws DataSourceConfigurationException {
		LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
		localContainerEntityManagerFactoryBean.setDataSource(dataSource());
		localContainerEntityManagerFactoryBean.setJpaVendorAdapter(jpaVendorAdapter());
		localContainerEntityManagerFactoryBean.setPackagesToScan("org.springframework.data.metamodel");
		localContainerEntityManagerFactoryBean.setMappingResources("orm.xml");
		localContainerEntityManagerFactoryBean.setJpaProperties(jpaProperties());
		return localContainerEntityManagerFactoryBean;
	}

	@Bean
	public Properties jpaProperties() {
		Properties jpaProperties = new Properties();
		jpaProperties.put(HIBERNATE_ENVERS_AUDIT_STRATEGY, HIBERNATE_ENVERS_VALIDITY_AUDIT_STRATEGY);
		jpaProperties.put(org.hibernate.cfg.Environment.HBM2DDL_AUTO, "create");
		return jpaProperties;
	}

	@Bean
	public PlatformTransactionManager transactionManager() throws DataSourceConfigurationException {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
		transactionManager.setJpaDialect(new HibernateJpaDialect());
		return transactionManager;
	}
}