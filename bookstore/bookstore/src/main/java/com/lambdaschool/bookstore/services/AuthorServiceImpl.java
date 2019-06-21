package com.lambdaschool.bookstore.services;


import com.lambdaschool.bookstore.model.Authors;
import com.lambdaschool.bookstore.repository.AuthorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "authorService")
public class AuthorServiceImpl implements AuthorService
{
    @Autowired
    private AuthorsRepository authorsrepos;

    @Override
    public List<Authors> findAll()
    {
        List<Authors> list= new ArrayList<>();
        authorsrepos.findAll().iterator().forEachRemaining(list::add);
        return list;
    }
}
