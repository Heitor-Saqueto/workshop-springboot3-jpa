package com.heitorsaqueto.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.heitorsaqueto.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
