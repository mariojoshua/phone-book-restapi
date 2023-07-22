package com.uttara.phone_book_restapi.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EntityScan("com.uttara.phone_book_restapi")
@EnableJpaRepositories("com.uttara.phone_book_restapi")
@EnableTransactionManagement
public class DomainConfig {
}
