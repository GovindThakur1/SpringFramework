package com.govind.config;

import com.govind.dao.IStudentDao;
import com.govind.dao.StudentDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"com.govind"})
public class SpringJdbcConfig {

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource(
                "jdbc:postgresql://localhost:5432/springframework2_springjdbc",
                "govind",
                "govind"
        );
        dataSource.setDriverClassName("org.postgresql.Driver");
        return dataSource;
    }


    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }

    // removing below because using annotation and autowired for creating object of StudentDao
//    @Bean
//    public IStudentDao studentDao() {
//        return new StudentDao(jdbcTemplate());
//    }


}
