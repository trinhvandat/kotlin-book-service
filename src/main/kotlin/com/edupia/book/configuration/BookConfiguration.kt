package com.edupia.book.configuration

import com.edupia.book.repository.BookRepository
import com.edupia.book.service.BookService
import com.edupia.book.service.BookServiceImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@Configuration
@EnableJpaRepositories(basePackages = ["com.edupia.book.repository"])
@ComponentScan(basePackages = ["com.edupia.book.repository"])
class BookConfiguration {
  @Bean
  fun bookService(repository: BookRepository): BookService {
    return BookServiceImpl(repository)
  }
}