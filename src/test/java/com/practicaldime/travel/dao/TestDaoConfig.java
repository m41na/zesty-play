package com.practicaldime.travel.dao;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import com.practicaldime.travel.dao.repo.AirlinesDao;
import com.practicaldime.travel.dao.repo.AirlinesDaoImpl;
import com.practicaldime.travel.dao.repo.AirplanesDao;
import com.practicaldime.travel.dao.repo.AirplanesDaoImpl;
import com.practicaldime.travel.dao.repo.AirportsDao;
import com.practicaldime.travel.dao.repo.AirportsDaoImpl;
import com.practicaldime.travel.dao.repo.CountriesDao;
import com.practicaldime.travel.dao.repo.CountriesDaoImpl;
import com.practicaldime.travel.dao.repo.FlightsDao;
import com.practicaldime.travel.dao.repo.FlightsDaoImpl;

@Configuration
public class TestDaoConfig {
 
    @Value("${app.jdbc.driver}")
    private String jdbcDriver;
    @Value("${app.jdbc.url}")
    private String jdbcUrl;
    @Value("${app.jdbc.username}")
    private String jdbcUser;
    @Value("${app.jdbc.password}")
    private String jdbcPass;
    
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }
    
    @Bean(destroyMethod = "close")
    public DataSource dataSource(){
    	BasicDataSource ds = new BasicDataSource();
    	ds.setUrl(jdbcUrl);
    	ds.setUsername(jdbcUser);
    	ds.setPassword(jdbcPass);
        ds.setDriverClassName(jdbcDriver);
        return ds;
    }
    
    @Bean
    public JdbcTemplate jdbcTemplate(){
        return new JdbcTemplate(dataSource());
    }
    
    @Bean
    public PlatformTransactionManager platformTransactionManager() {
    	return new DataSourceTransactionManager(dataSource());	
    }
    
    @Bean
    public AirportsDao airportsDao(@Autowired JdbcTemplate template){
        return new AirportsDaoImpl(template);
    }
    
    @Bean
    public AirlinesDao airlinesDao(@Autowired JdbcTemplate template){
        return new AirlinesDaoImpl(template);
    }
    
    @Bean
    public AirplanesDao airplanesDao(@Autowired JdbcTemplate template){
        return new AirplanesDaoImpl(template);
    }
    
    @Bean
    public CountriesDao countriesDao(@Autowired JdbcTemplate template){
        return new CountriesDaoImpl(template);
    }
    
    @Bean
    public FlightsDao flightsDao(@Autowired JdbcTemplate template){
        return new FlightsDaoImpl(template);
    }
}
