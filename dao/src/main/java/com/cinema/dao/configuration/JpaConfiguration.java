package com.cinema.dao.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Properties;


@ComponentScan(basePackages = {"com.cinema.dao", "com.cinema.service", "com.cinema.controller"})
@EnableTransactionManagement
@Configuration
@PropertySource("classpath.application.properties")
public class JpaConfiguration {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(JpaConfiguration.class);

        for (String beanName : applicationContext.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }
    }

    @Value("${database.driverClassName}")
    private String driverClassName;
    @Value("${database.databaseUrl}")
    private String databaseUrl;
    @Value("${database.username}")
    private String username;
    @Value("${database.password}")
    private String password;
    @Value("${hibernate.hbm2ddl.auto}")
    private String hibernateHbm2ddlAuto;
    @Value("${hibernate.show_sql:false}")
    private String showSql;
    @Value("${hibernate.dialect}")
    private String hibernateDialect;
    @Value("${hibernate.enable_lazy_load_no_trans")
    private String hibernateLazyLoadNoTrans;
    @Value("${hibernate.use_jdbc_metadata_defaults}")
    private String hibernateTempUseJdbcMetadataDefault;

    //Вот ты подобавлял классы, а откуда они должны появиться тут? Ты же не сам их будешь пасить, правильно?
    // Значит надо зависимость на либу/фреймворк, корорый соддержит этот класс

    @Bean
    public DataSource dataSource() {
        return new DriverManagerDataSource(databaseUrl, username, password);
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManager(){
        LocalContainerEntityManagerFactoryBean entityManager = new LocalContainerEntityManagerFactoryBean();
        entityManager.setDataSource(dataSource());
        entityManager.setPackagesToScan("com/cinema/model");
        JpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
        entityManager.setJpaVendorAdapter(jpaVendorAdapter);
        entityManager.setJpaProperties(getJpaProperties());
        return entityManager;
    }

    @Bean
    public JpaTransactionManager transactionManager (EntityManagerFactory entityManagerFactory) {

        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory);
        return transactionManager;
    }

    private Properties getJpaProperties() {
        Properties properties = new Properties();
        properties.setProperty("hibernate.hbm2ddl.auto", hibernateHbm2ddlAuto);
        properties.setProperty("hibernate.dialect", hibernateDialect);
        properties.setProperty("hibernate.show_sql", showSql);
        properties.setProperty("hibernate.enable_lazy_load_no_trans", hibernateLazyLoadNoTrans);
        properties.setProperty("hibernate.use_jdbc_metadata_defaults", hibernateTempUseJdbcMetadataDefault);
        return properties;
    }
}
