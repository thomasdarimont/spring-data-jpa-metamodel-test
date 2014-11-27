spring-data-jpa-metamodel-test
==============================

Test project that shows a bug in Spring Data JPA/Spring Data Commons

## Log

```
Nov 27, 2014 2:09:37 PM org.hibernate.jpa.internal.util.LogHelper logPersistenceUnitInformation
INFO: HHH000204: Processing PersistenceUnitInfo [
	name: default
	...]
Nov 27, 2014 2:09:38 PM org.hibernate.Version logVersion
INFO: HHH000412: Hibernate Core {4.3.5.Final}
Nov 27, 2014 2:09:38 PM org.hibernate.cfg.Environment <clinit>
INFO: HHH000206: hibernate.properties not found
Nov 27, 2014 2:09:38 PM org.hibernate.cfg.Environment buildBytecodeProvider
INFO: HHH000021: Bytecode provider name : javassist
Nov 27, 2014 2:09:38 PM org.hibernate.annotations.common.reflection.java.JavaReflectionManager <clinit>
INFO: HCANN000001: Hibernate Commons Annotations {4.0.4.Final}
Nov 27, 2014 2:09:39 PM org.hibernate.dialect.Dialect <init>
INFO: HHH000400: Using dialect: org.hibernate.dialect.HSQLDialect
Nov 27, 2014 2:09:39 PM org.hibernate.hql.internal.ast.ASTQueryTranslatorFactory <init>
INFO: HHH000397: Using ASTQueryTranslatorFactory
Nov 27, 2014 2:09:40 PM org.hibernate.tool.hbm2ddl.SchemaExport execute
INFO: HHH000227: Running hbm2ddl schema export
Nov 27, 2014 2:09:40 PM org.hibernate.tool.hbm2ddl.SchemaExport perform
ERROR: HHH000389: Unsuccessful: alter table Container_FactSheet drop constraint FK_fxdrl2jee44a87bu6do6d9yc3
Nov 27, 2014 2:09:40 PM org.hibernate.tool.hbm2ddl.SchemaExport perform
ERROR: user lacks privilege or object not found: PUBLIC.CONTAINER_FACTSHEET
Hibernate: alter table Container_FactSheet drop constraint FK_fxdrl2jee44a87bu6do6d9yc3
Hibernate: alter table Container_FactSheet drop constraint FK_8rfvph7gvpdb38iaxd15d0eda
Nov 27, 2014 2:09:40 PM org.hibernate.tool.hbm2ddl.SchemaExport perform
ERROR: HHH000389: Unsuccessful: alter table Container_FactSheet drop constraint FK_8rfvph7gvpdb38iaxd15d0eda
Nov 27, 2014 2:09:40 PM org.hibernate.tool.hbm2ddl.SchemaExport perform
ERROR: user lacks privilege or object not found: Hibernate: alter table Value_AUD drop constraint FK_bddft0qff51cywey3tfww5qp4
PUBLIC.CONTAINER_FACTSHEET
Nov 27, 2014 2:09:40 PM org.hibernate.tool.hbm2ddl.SchemaExport perform
ERROR: HHH000389: Unsuccessful: alter table Value_AUD drop constraint FK_bddft0qff51cywey3tfww5qp4
Hibernate: alter table Value_AUD drop constraint FK_6x9vuek03keqw6a3oos77j82m
Hibernate: alter table Value_Amount drop constraint FK_qbmmth2y5otp5cwt1utwacsmo
Nov 27, 2014 2:09:40 PM org.hibernate.tool.hbm2ddl.SchemaExport perform
ERROR: user lacks privilege or object not found: PUBLIC.VALUE_AUD
Nov 27, 2014 2:09:40 PM org.hibernate.tool.hbm2ddl.SchemaExport perform
ERROR: HHH000389: Unsuccessful: alter table Value_AUD drop constraint FK_6x9vuek03keqw6a3oos77j82m
Nov 27, 2014 2:09:40 PM org.hibernate.tool.hbm2ddl.SchemaExport perform
ERROR: user lacks privilege or object not found: PUBLIC.VALUE_AUD
Nov 27, 2014 2:09:40 PM org.hibernate.tool.hbm2ddl.SchemaExport perform
ERROR: HHH000389: Unsuccessful: alter table Value_Amount drop constraint FK_qbmmth2y5otp5cwt1utwacsmo
Nov 27, 2014 2:09:40 PM org.hibernate.tool.hbm2ddl.SchemaExport perforHibernate: alter table Value_Amount_AUD drop constraint FK_1xr147gbmc46nefsk2qdwufpj
m
ERROR: user lacks privilege or object not found: PUBLIC.VALUE_AMOUNT
Nov 27, 2014 2:09:40 PM org.hibernate.tool.hbm2ddl.Hibernate: alter table Value_CalendarDate drop constraint FK_rx36ovcgle4a0r45phplh8h6d
SchemaExport perform
ERROR: HHH000389: Unsuccessful: alter table Value_Amount_AUD drop constraint FK_1xr147gbmc46nefsk2qdwufpj
Nov 27, 2014 2:09:40 PM org.hibernate.tool.hbm2ddl.SchemaExport perform
ERROR: user lacks privilege or object not found: PUBLIC.VALUE_AMOUNT_AUD
Hibernate: alter table Value_CalendarDate_AUD drop constraint FK_keb1owcswdhkphlgddkqr8r23
Nov 27, 2014 2:09:40 PM org.hibernate.tool.hbm2ddl.SchemaExport perform
ERROR: HHH000389: Unsuccessful: alter table Value_CalendarDate drop constraint FK_rx36ovcgle4a0r45phplh8h6d
Nov 27, 2014 2:09:40 PM org.hibernate.tool.hbm2ddl.SchemaExport perform
ERROR: user lacks privilege or object not found: PUBLIC.VALUE_CALENDARDATE
Hibernate: alter table Value_LogicalValue drop constraint FK_fob8rllfd0epyl2rxklcnw3e6
Nov 27, 2014 2:09:40 PM org.hibernate.tool.hbm2ddl.SchemaExport perform
ERROR: HHH000389: Unsuccessful: alter table Value_CalendarDate_AUD drop constraint FK_keb1owcswdhkphlgddkqr8r23
Nov 27, 2014 2:09:40 PM org.hibernate.tool.hbm2ddl.SchemaExport perform
ERROR: user lacks privilege or object not found: PUBLIC.VALUE_CALENDARDATE_AUD
Nov 27, 2014 2:09:40 PM org.hibernate.tool.hbm2ddl.SchemaExport perform
ERROR: HHH000389: Unsuccessful: alter table Value_LogicalValue drop constraint FK_fob8rllfd0epyl2rxklcnw3e6
Nov 27, 2014 2:09:40 PM org.hibernate.tool.hbm2ddl.SchemaExport perform
ERROR: user lacks privilege or object not found: PUBLIC.VALUE_LOGICALVALUE
Hibernate: alter table Value_LogicalValue_AUD drop constraint FK_rtx6n431crwssymgr5qog2cfl
Hibernate: alter table Value_Number drop constraint FK_fgwfcdtt884j099ensl6ug5cr
Hibernate: alter table Value_Number_AUD drop constraint FK_9pskwh0c3ho7ja9gy7hu4symp
Hibernate: alter table Value_Percentage drop constraint FK_qpl5gqsrgq99ehq3lt2jm9dph
Nov 27, 2014 2:09:40 PM org.hibernate.tool.hbm2ddl.SchemaExport perform
ERROR: HHH000389: Unsuccessful: alter table Value_LogicalValue_AUD drop constraint FK_rtx6n431crwssymgr5qog2cfl
Nov 27, 2014 2:09:40 PM org.hibernate.tool.hbm2ddl.SchemaExport perform
ERROR: user lacks privilege or object not found: PUBLIC.VALUE_LOGICALVALUE_AUD
Nov 27, 2014 2:09:40 PM org.hibernate.tool.hbm2ddl.SchemaExport perform
ERROR: HHH000389: Unsuccessful: alter table Value_Number drop constraint FK_fgwfcdtt884j099ensl6ug5cr
Nov 27, 2014 2:09:40 PM org.hibernate.tool.hbm2ddl.SchemaExport perform
ERROR: user lacks privilege or object not found: PUBLIC.VALUE_NUMBER
Nov 27, 2014 2:09:40 PM org.hibernate.tool.hbm2ddl.SchemaExport perform
ERROR: HHH000389: Unsuccessful: alter table Value_Number_AUD drop constraint FK_9pskwh0c3ho7ja9gy7hu4symp
Nov 27, 2014 2:09:40 PM org.hibernate.tool.hbm2ddl.SchemaExport perform
ERROR: user lacks privilege or object not found: PUBLIC.VALUE_NUMBER_AUD
Nov 27, 2014 2:09:40 PM org.hibernate.tool.hbm2ddl.SchemaExport perform
ERROR: HHH000389: Unsuccessful: alter table Value_Percentage drop constraint FK_qpl5gqsrgq99ehq3lt2jm9dph
Hibernate: alter table Value_Percentage_AUD drop constraint FK_ju04d964tesgsrnh001gmsybs
Nov 27, 2014 2:09:40 PM org.hibernate.tool.hbm2ddl.SchemaExport perform
ERROR: user lacks privilege or object not found: PUBLIC.VALUE_PERCENTAGE
Nov 27, 2014 2:09:40 PM org.hibernate.tool.hbm2ddl.SchemaExport perform
ERROR: HHH000389: Unsuccessful: alter table Value_Percentage_AUD drop constraint FK_ju04d964tesgsrnh001gmsybs
Nov 27, 2014 2:09:40 PM org.hibernate.tool.hbm2ddl.SchemaExport perform
ERROR: user lacks privilege or object not found: PUBLIC.VALUE_PERCENTAGE_AUD
Hibernate: alter table Value_Text drop constraint FK_qnagda9bnk9332xvwuoi6j6hi
Nov 27, 2014 2:09:40 PM org.hibernate.tool.hbm2ddl.SchemaExport perform
ERROR: HHH000389: Unsuccessful: alter table Value_Text drop constraint FK_qnagda9bnk9332xvwuoi6j6hi
Nov 27, 2014 2:09:40 PM org.hibernate.tool.hbm2ddl.SchemaExport perform
ERROR: user lacks privilege or object not found: PUBLIC.VALUE_TEXT
Nov 27, 2014 2:09:40 PM org.hHibernate: alter table Value_Text_AUD drop constraint FK_n4h78jdiv95xsneew9wnqeatc
ibernate.tool.hbm2ddl.SchemaExport perform
ERROR: HHH000389: Unsuccessful: alter table Value_Text_AUD drop constraint FK_n4h78jdiv95xsneew9wnqeatc
Hibernate: drop tablNov 27, 2014 2:09:40 PM org.hibernate.tool.hbm2ddl.SchemaExport perform
ERROR: user lacks privilege or object not found: PUBLIC.VALUE_TEXT_AUD
e Container if exists
Hibernate: drop table Container_FactSheet if exists
Hibernate: drop table REVINFO if exists
Hibernate: drop table Value if exists
Hibernate: drop table Value_AUD if exists
Hibernate: drop table Value_Amount if exists
Hibernate: drop table Value_Amount_AUD if exists
Hibernate: drop table Value_CalendarDate if exists
Hibernate: drop table Value_CalendarDate_AUD if exists
Hibernate: drop table Value_LogicalValue if exists
Hibernate: drop table Value_LogicalValue_AUD if exists
Hibernate: drop table Value_Number if exists
Hibernate: drop table Value_Number_AUD if exists
Hibernate: drop table Value_Percentage if exists
Hibernate: drop table Value_Percentage_AUD if exists
Hibernate: drop table Value_Text if exists
Hibernate: drop table Value_Text_AUD if exists
Hibernate: create table Container (id integer generated by default as identity (start with 1), primary key (id))
Hibernate: create table Container_FactSheet (Container_id integer not null, factSheet_id integer not null, name varchar(255) not null, primary key (Container_id, name))
Hibernate: create table REVINFO (REV integer generated by default as identity (start with 1), REVTSTMP bigint, primary key (REV))
Hibernate: create table Value (id integer generated by default as identity (start with 1), primary key (id))
Hibernate: create table Value_AUD (id integer not null, REV integer not null, REVTYPE tinyint, REVEND integer, primary key (id, REV))
Hibernate: create table Value_Amount (currencyCode varchar(255), value double, id integer not null, primary key (id))
Hibernate: create table Value_Amount_AUD (id integer not null, REV integer not null, currencyCode varchar(255), value double, primary key (id, REV))
Hibernate: create table Value_CalendarDate (date date, id integer not null, primary key (id))
Hibernate: create table Value_CalendarDate_AUD (id integer not null, REV integer not null, date date, primary key (id, REV))
Hibernate: create table Value_LogicalValue (value boolean, id integer not null, primary key (id))
Hibernate: create table Value_LogicalValue_AUD (id integer not null, REV integer not null, value boolean, primary key (id, REV))
Hibernate: create table Value_Number (value double, id integer not null, primary key (id))
Hibernate: create table Value_Number_AUD (id integer not null, REV integer not null, value double, primary key (id, REV))
Hibernate: create table Value_Percentage (value double, id integer not null, primary key (id))
Hibernate: create table Value_Percentage_AUD (id integer not null, REV integer not null, value double, primary key (id, REV))
Hibernate: create table Value_Text (value varchar(255), id integer not null, primary key (id))
Hibernate: create table Value_Text_AUD (id integer not null, REV integer not null, value varchar(255), primary key (id, REV))
Hibernate: alter table Container_FactSheet add constraint UK_fxdrl2jee44a87bu6do6d9yc3  unique (factSheet_id)
Hibernate: alter table Container_FactSheet add constraint FK_fxdrl2jee44a87bu6do6d9yc3 foreign key (factSheet_id) references Value
Hibernate: alter table Container_FactSheet add constraint FK_8rfvph7gvpdb38iaxd15d0eda foreign key (Container_id) references Container
Hibernate: alter table Value_AUD add constraint FK_bddft0qff51cywey3tfww5qp4 foreign key (REV) references REVINFO
Hibernate: alter table Value_AUD add constraint FK_6x9vuek03keqw6a3oos77j82m foreign key (REVEND) references REVINFO
Hibernate: alter table Value_Amount add constraint FK_qbmmth2y5otp5cwt1utwacsmo foreign key (id) references Value
Hibernate: alter table Value_Amount_AUD add constraint FK_1xr147gbmc46nefsk2qdwufpj foreign key (id, REV) references Value_AUD
Hibernate: alter table Value_CalendarDate add constraint FK_rx36ovcgle4a0r45phplh8h6d foreign key (id) references Value
Hibernate: alter table Value_CalendarDate_AUD add constraint FK_keb1owcswdhkphlgddkqr8r23 foreign key (id, REV) references Value_AUD
Hibernate: alter table Value_LogicalValue add constraint FK_fob8rllfd0epyl2rxklcnw3e6 foreign key (id) references Value
Hibernate: alter table Value_LogicalValue_AUD add constraint FK_rtx6n431crwssymgr5qog2cfl foreign key (id, REV) references Value_AUD
Hibernate: alter table Value_Number add constraint FK_fgwfcdtt884j099ensl6ug5cr foreign key (id) references Value
Hibernate: alter table Value_Number_AUD add constraint FK_9pskwh0c3ho7ja9gy7hu4symp foreign key (id, REV) references Value_AUD
Hibernate: alter table Value_Percentage add constraint FK_qpl5gqsrgq99ehq3lt2jm9dph foreign key (id) references Value
Hibernate: alter table Value_Percentage_AUD add constraint FK_ju04d964tesgsrnh001gmsybs foreign key (id, REV) references Value_AUD
Hibernate: alter table Value_Text add constraint FK_qnagda9bnk9332xvwuoi6j6hi foreign key (id) references Value
Hibernate: alter table Value_Text_AUD add constraint FK_n4h78jdiv95xsneew9wnqeatc foreign key (id, REV) references Value_AUD
Nov 27, 2014 2:09:40 PM org.hibernate.tool.hbm2ddl.SchemaExport execute
INFO: HHH000230: Schema export complete

java.lang.IllegalStateException: Failed to load ApplicationContext
	at org.springframework.test.context.CacheAwareContextLoaderDelegate.loadContext(CacheAwareContextLoaderDelegate.java:99)
	at org.springframework.test.context.DefaultTestContext.getApplicationContext(DefaultTestContext.java:101)
	at org.springframework.test.context.support.DependencyInjectionTestExecutionListener.injectDependencies(DependencyInjectionTestExecutionListener.java:109)
	at org.springframework.test.context.support.DependencyInjectionTestExecutionListener.prepareTestInstance(DependencyInjectionTestExecutionListener.java:75)
	at org.springframework.test.context.TestContextManager.prepareTestInstance(TestContextManager.java:331)
	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.createTest(SpringJUnit4ClassRunner.java:213)
	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner$1.runReflectiveCall(SpringJUnit4ClassRunner.java:290)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.methodBlock(SpringJUnit4ClassRunner.java:292)
	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.runChild(SpringJUnit4ClassRunner.java:233)
	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.runChild(SpringJUnit4ClassRunner.java:87)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
	at org.springframework.test.context.junit4.statements.RunBeforeTestClassCallbacks.evaluate(RunBeforeTestClassCallbacks.java:61)
	at org.springframework.test.context.junit4.statements.RunAfterTestClassCallbacks.evaluate(RunAfterTestClassCallbacks.java:71)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.run(SpringJUnit4ClassRunner.java:176)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:160)
	at com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:67)
Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'jpaMapppingContext': Invocation of init method failed; nested exception is java.lang.IllegalArgumentException: Metamodel must not be null!
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1554)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:539)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:475)
	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:302)
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:228)
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:298)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:193)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:687)
	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:762)
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:482)
	at org.springframework.test.context.support.AbstractGenericContextLoader.loadContext(AbstractGenericContextLoader.java:125)
	at org.springframework.test.context.support.AbstractGenericContextLoader.loadContext(AbstractGenericContextLoader.java:60)
	at org.springframework.test.context.CacheAwareContextLoaderDelegate.loadContextInternal(CacheAwareContextLoaderDelegate.java:64)
	at org.springframework.test.context.CacheAwareContextLoaderDelegate.loadContext(CacheAwareContextLoaderDelegate.java:91)
	... 23 more
Caused by: java.lang.IllegalArgumentException: Metamodel must not be null!
	at org.springframework.util.Assert.notNull(Assert.java:112)
	at org.springframework.data.jpa.mapping.JpaPersistentPropertyImpl.<init>(JpaPersistentPropertyImpl.java:89)
	at org.springframework.data.jpa.mapping.JpaMetamodelMappingContext.createPersistentProperty(JpaMetamodelMappingContext.java:77)
	at org.springframework.data.jpa.mapping.JpaMetamodelMappingContext.createPersistentProperty(JpaMetamodelMappingContext.java:38)
	at org.springframework.data.mapping.context.AbstractMappingContext$PersistentPropertyCreator.createAndRegisterProperty(AbstractMappingContext.java:449)
	at org.springframework.data.mapping.context.AbstractMappingContext$PersistentPropertyCreator.addPropertiesForRemainingDescriptors(AbstractMappingContext.java:442)
	at org.springframework.data.mapping.context.AbstractMappingContext.addPersistentEntity(AbstractMappingContext.java:296)
	at org.springframework.data.mapping.context.AbstractMappingContext$PersistentPropertyCreator.createAndRegisterProperty(AbstractMappingContext.java:470)
	at org.springframework.data.mapping.context.AbstractMappingContext$PersistentPropertyCreator.doWith(AbstractMappingContext.java:427)
	at org.springframework.util.ReflectionUtils.doWithFields(ReflectionUtils.java:607)
	at org.springframework.data.mapping.context.AbstractMappingContext.addPersistentEntity(AbstractMappingContext.java:295)
	at org.springframework.data.mapping.context.AbstractMappingContext.addPersistentEntity(AbstractMappingContext.java:257)
	at org.springframework.data.mapping.context.AbstractMappingContext.initialize(AbstractMappingContext.java:373)
	at org.springframework.data.jpa.repository.config.JpaMetamodelMappingContextFactoryBean.createInstance(JpaMetamodelMappingContextFactoryBean.java:73)
	at org.springframework.data.jpa.repository.config.JpaMetamodelMappingContextFactoryBean.createInstance(JpaMetamodelMappingContextFactoryBean.java:26)
	at org.springframework.beans.factory.config.AbstractFactoryBean.afterPropertiesSet(AbstractFactoryBean.java:134)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1613)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1550)
	... 36 more

Disconnected from the target VM, address: '127.0.0.1:52871', transport: 'socket'

Process finished with exit code 255
```