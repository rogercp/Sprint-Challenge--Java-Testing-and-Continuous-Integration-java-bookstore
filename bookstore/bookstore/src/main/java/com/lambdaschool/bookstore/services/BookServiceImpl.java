package com.lambdaschool.bookstore.services;


import com.lambdaschool.bookstore.model.Book;
import com.lambdaschool.bookstore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service(value = "bookService")
public class BookServiceImpl implements BookService
{
    @Autowired
    private BookRepository bookrepo;

    @Override
    public List<Book> findAll()
    {
        List<Book> list= new ArrayList<>();
        bookrepo.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Transactional
    @Override
    public void saveAuthorBook(long bookid, long authorid)
    {
        bookrepo.insertBooksFromAuthor(bookid, authorid);
    }


    @Transactional
    @Override
    public Book update(Book book, long id)
    {
        Book currentBook = bookrepo.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(Long.toString(id)));
        if (book.getBooktitle() != null)
        {
            currentBook.setBooktitle(book.getBooktitle());
        }
        if (book.getCopy() != 0)
        {
            currentBook.setCopy(book.getCopy());
        }
        if (book.getISBN() != null)
        {
            currentBook.setISBN(book.getISBN());
        }
        return bookrepo.save(currentBook);
    }

    @Override
    public void delete(long id) throws EntityNotFoundException
    {
        if (bookrepo.findById(id).isPresent())
        {
            bookrepo.deleteById(id);
        } else
        {
            throw new EntityNotFoundException(Long.toString(id));
        }
    }
    

}
