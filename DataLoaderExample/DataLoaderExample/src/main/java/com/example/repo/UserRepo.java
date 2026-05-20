package com.example.repo;

import com.example.beans.Userr;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<Userr, Integer> {
}