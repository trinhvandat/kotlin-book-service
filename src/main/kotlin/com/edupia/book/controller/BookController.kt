package com.edupia.book.controller

import com.edupia.book.entity.Book
import com.edupia.book.service.BookService
import lombok.RequiredArgsConstructor
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/api/v1/books")
@RestController
@RequiredArgsConstructor
class BookController(private val service: BookService) {

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  fun create(@RequestBody book: Book): Book {
    return service.create(book)
  }

  @PutMapping
  @ResponseStatus(HttpStatus.OK)
  fun update(@RequestBody book: Book): Book {
    return service.update(book)
  }

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  fun find(@RequestParam id: String): Book {
    return service.find(id)
  }

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  fun list(): List<Book> {
    return service.list()
  }

  @DeleteMapping
  @ResponseStatus(HttpStatus.OK)
  fun delete(@RequestParam id: String) {
    return service.delete(id)
  }
}