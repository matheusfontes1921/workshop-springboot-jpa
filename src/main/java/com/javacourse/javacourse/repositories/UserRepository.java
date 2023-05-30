package com.javacourse.javacourse.repositories;

import com.javacourse.javacourse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//repository é responsável por acessar o bd
@Repository //não é necessário, já que está herdando do JPA
public interface UserRepository extends JpaRepository<User,Long> {
}
