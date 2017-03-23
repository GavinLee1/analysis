package com.gavin.finance.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.core.io.support.ResourcePatternResolver;

import javax.inject.Named;
import javax.sql.DataSource;
import java.io.IOException;
import java.util.Properties;

@Configuration
public class MybatisConfig {

    private final static Logger log = LoggerFactory.getLogger(MybatisConfig.class);

    @Bean
    public DataSource dataSource() {
        HikariDataSource mysqlDS = null;
        try {
            Resource resource = new ClassPathResource("jdbc.properties");
            Properties props = PropertiesLoaderUtils.loadProperties(resource);
            HikariConfig config = new HikariConfig(props);
            mysqlDS = new HikariDataSource(config);

            log.info("[Mybatis] - Database connection pool created!");

        } catch (IOException e) {
            log.error("[Mybatis] - Error connecting data source", e);
        }
        return mysqlDS;
    }

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory() throws Exception {

        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();

        sqlSessionFactoryBean.setDataSource(dataSource());

        sqlSessionFactoryBean.setTypeAliasesPackage("com.gavin.finance.pojo");

        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();

        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:mybatis/mapper/*Mapper.xml"));

        log.info("[Mybatis] - Loaded the SqlSessionFactory!");

        return (SqlSessionFactory) sqlSessionFactoryBean.getObject();
    }

    @Bean(name = "sqlSessionTemplate")
    public SqlSessionTemplate ringsAccountSqlSessionTemplate(@Named("sqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        log.info("[Mybatis] - Loaded the SqlSessionTemplate with name sqlSessionTemplate!");
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
