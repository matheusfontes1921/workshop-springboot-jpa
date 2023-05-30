package com.javacourse.javacourse.repositories;

import com.javacourse.javacourse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
//repository é responsável por acessar o bd
public interface UserRepository extends JpaRepository<User,Long> {
}
