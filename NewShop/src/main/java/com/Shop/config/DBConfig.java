package com.Shop.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.Shop")
@EnableTransactionManagement

public class DBConfig {

	private static final String DriverClass = "org.h2.Driver";
	private static final String DBURL = "jdbc:h2:tcp://localhost/~/Shop";
	private static final String UserName = "sa";
	private static final String Password = "1234";
	private static final String DBDialect = "org.hibernate.dialect.H2Dialect";

	@Bean("dataSource")
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(DriverClass);
		dataSource.setUrl(DBURL);
		dataSource.setUsername(UserName);
		dataSource.setPassword(Password);

		return dataSource;
	}

	@Bean("SessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource) {
	
		LocalSessionFactoryBuilder lsfb=new LocalSessionFactoryBuilder(dataSource);
		lsfb.addProperties(getHibernateProp());
        lsfb.scanPackages("com.Shop");
        return lsfb.buildSessionFactory();
	}

	private Properties getHibernateProp() {
		
		Properties prop= new Properties();
		prop.put("hibernate.dialect",DBDialect);
		//optional
		prop.put("hibernate.hbm2ddl.auto","update");//create,update,create-drop,validate
		//this property will tell hibernate to create table automatic	
	
		prop.put("hibernate.show_sql", "true");
		prop.put("hibernate.format_sql", "true");
	
		return prop;
	}
	
	@Bean
	public HibernateTransactionManager getTM(SessionFactory sessionFactory) {
	return new HibernateTransactionManager(sessionFactory);	
		
	}
}
