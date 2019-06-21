package com.lambdaschool.bookstore.repository;

import com.lambdaschool.bookstore.model.Authors;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AuthorsRepository extends PagingAndSortingRepository<Authors,Long>
{
}
