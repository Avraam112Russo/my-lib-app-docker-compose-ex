package com.n1nt3nd0.my_library_app.mapper;

import com.n1nt3nd0.my_library_app.dto.BookDto;
import com.n1nt3nd0.my_library_app.entity.Book;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BookMapper {
    Book dtoToModel(BookDto bookDto);

    BookDto modelToDto(Book book);

    List<BookDto> toListDto(List<Book> books);
}
