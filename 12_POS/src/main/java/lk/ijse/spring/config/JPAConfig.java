package lk.ijse.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

/**
 * @author ishanka on 6/6/21 at 8:45 PM
 * @since 0.0.1
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "lk.ijse.spring.repo")
@PropertySource("classpath:application.properties")
public class JPAConfig {

    @Autowired
    Environment env;

    @Bean // use entityManagerFactory as method name always
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource ds, JpaVendorAdapter va) {
        LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
        factoryBean.setDataSource(ds);
        factoryBean.setJpaVendorAdapter(va);
        factoryBean.setPackagesToScan(env.getRequiredProperty("entity.package"));
        return factoryBean;
    }


    @Bean // data source configuration
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getRequiredProperty("my.driver"));
        dataSource.setUrl(env.getRequiredProperty("db.url"));
        dataSource.setUsername(env.getRequiredProperty("db.username"));
        dataSource.setPassword(env.getRequiredProperty("db.password"));
        return dataSource;
    }


    @Bean //  JPA vendor configuration
    public JpaVendorAdapter vendorAdapter() {
        HibernateJpaVendorAdapter va = new HibernateJpaVendorAdapter();
        va.setDatabasePlatform(env.getRequiredProperty("db.dialect"));
        va.setDatabase(Database.MYSQL);
        va.setGenerateDdl(true);
        va.setShowSql(true);
        return va;
    }

    @Bean // use transactionManager as method name always
    public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
        return new JpaTransactionManager(emf);
    }
}
