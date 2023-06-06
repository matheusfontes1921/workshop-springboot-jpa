package com.javacourse.javacourse.repositories;

import com.javacourse.javacourse.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
