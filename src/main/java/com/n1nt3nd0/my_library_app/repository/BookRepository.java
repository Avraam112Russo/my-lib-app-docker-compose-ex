package com.n1nt3nd0.my_library_app.repository;

import com.n1nt3nd0.my_library_app.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
