package com.lambdaschool.bookstore.services;

import com.lambdaschool.bookstore.model.Book;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BookService
{
    List<Book> findAll(Pageable pageable);

    Book update(Book book, long id);

    void delete(long id);

    void saveAuthorBook(long bookid, long authorid);
}
