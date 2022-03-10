package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.src.model.Entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{

}
