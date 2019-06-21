package com.lambdaschool.bookstore.repository;

import com.lambdaschool.bookstore.model.Book;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.transaction.annotation.Transactional;

public interface BookRepository extends PagingAndSortingRepository<Book,Long>
{

    @Transactional
    @Modifying
    @Query(value = "INSERT INTO wrote(bookid, authorid) values (:bookid, :authorid)", nativeQuery = true)
    void insertBooksFromAuthor(long bookid,long authorid);
}
