package com.cinema.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ComponentScan(basePackages = {"com.cinema.dao", "com.cinema.service", "com.cinema.controller", "com.cinema.configuration"})
@EnableTransactionManagement
public class ContextConfiguration {
}
