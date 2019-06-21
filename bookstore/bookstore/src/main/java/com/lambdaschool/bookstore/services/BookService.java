package com.lambdaschool.bookstore.services;

import com.lambdaschool.bookstore.model.Book;

import java.util.List;

public interface BookService
{
    List<Book> findAll();

    Book update(Book book, long id);

    void delete(long id);

    void saveAuthorBook(long bookid, long authorid);
}
