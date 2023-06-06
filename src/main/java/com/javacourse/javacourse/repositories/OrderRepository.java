package com.javacourse.javacourse.repositories;

import com.javacourse.javacourse.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
