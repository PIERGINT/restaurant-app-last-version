package dev;



import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DataSourceMySQLConfig {

	@Bean
	public DataSource dataSource(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.mariadb.jdbc.Driver");
		dataSource.setUrl("jdbc:mariadb://bcdorjl3aww95btiuoeg-mysql.services.clever-cloud.com:3306/bcdorjl3aww95btiuoeg");
		dataSource.setUsername("uifzt3ivnfp8qybo");
		dataSource.setPassword("9goADyp5nOJf6A3gBiBr");
		return dataSource;
	}
}
