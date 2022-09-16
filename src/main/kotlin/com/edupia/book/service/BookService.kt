package com.edupia.book.service

import com.edupia.book.entity.Book

interface BookService {
  fun create(book: Book): Book
  fun update(book: Book): Book
  fun find(id: String): Book
  fun list(): List<Book>
  fun delete(id: String)
}