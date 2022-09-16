package com.edupia.book.service

import com.edupia.book.entity.Book
import com.edupia.book.repository.BookRepository
import lombok.extern.slf4j.Slf4j

@Slf4j
class BookServiceImpl(private val repository: BookRepository) : BookService {

  override fun create(book: Book): Book {
    return repository.save(book)
  }

  override fun update(book: Book): Book {
    return repository.save(book)
  }

  override fun find(id: String): Book {
    return repository.findById(id).orElse(null)
  }

  override fun list(): List<Book> {
    return repository.findAll()
  }

  override fun delete(id: String) {
    repository.deleteById(id)
  }
}