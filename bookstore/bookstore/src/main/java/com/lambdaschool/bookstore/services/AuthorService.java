package com.lambdaschool.bookstore.services;

import com.lambdaschool.bookstore.model.Authors;

import java.util.List;

public interface AuthorService
{
    List<Authors> findAll();
}
