package com.lambdaschool.bookstore.services;

import com.lambdaschool.bookstore.model.Authors;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AuthorService
{
    List<Authors> findAll(Pageable pageable);
}
