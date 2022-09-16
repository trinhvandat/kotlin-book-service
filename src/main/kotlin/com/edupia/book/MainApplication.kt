package com.edupia.book

import lombok.extern.slf4j.Slf4j
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@Slf4j
@SpringBootApplication
class MainApplication : CommandLineRunner {

  fun main(args: Array<String>) {
    runApplication<MainApplication>(*args)
  }

  override fun run(vararg args: String?) {
    println("Starting application ...")
  }
}


