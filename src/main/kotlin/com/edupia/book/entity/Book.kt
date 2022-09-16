package com.edupia.book.entity

import lombok.Data
import lombok.NoArgsConstructor
import java.util.UUID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Data
@Entity
@NoArgsConstructor
class Book (
  val description: String,
  @Column(name = "name")
  val name: String,
  val releaseAt: Int
) {
  @Id
  val id: String = UUID.randomUUID().toString()
  val isActive: Boolean = true
}