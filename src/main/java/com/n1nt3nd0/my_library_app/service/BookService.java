package com.n1nt3nd0.my_library_app.service;

import com.n1nt3nd0.my_library_app.dto.BookDto;

import java.util.List;

public interface BookService {
    List<BookDto> findAll ();
    BookDto findById( Long id);
    BookDto save (BookDto book);
    void deleteById (Long id);
}
