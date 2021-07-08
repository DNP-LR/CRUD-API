package com.example.CRUD.API.Repositories;

import com.example.CRUD.API.Models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TodoRepository extends CrudRepository<Todo,Long> {

}
