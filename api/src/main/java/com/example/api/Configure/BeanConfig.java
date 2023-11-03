package com.example.api.Configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

/**
 * @author : HCM23_FRF_FJB_04_TriNM
 * @since : 11/3/2023, Fri
 **/

@Configuration
public class BeanConfig {
//
//    @Bean
//    public EntityManagerFactory entityManagerFactory(DataSource dataSource) {
//        LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
//        emf.setDataSource(dataSource);
//        emf.setPackagesToScan("package.where.are.your.entities");
//        emf.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
//        emf.setPersistenceUnitName("yourPersistenceUnit"); // Match the name used in RepositoryConfiguration
//
//        emf.afterPropertiesSet(); // Initialize the EntityManagerFactory
//
//        return emf.getObject();
//    }

    @Bean
    public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }

}
