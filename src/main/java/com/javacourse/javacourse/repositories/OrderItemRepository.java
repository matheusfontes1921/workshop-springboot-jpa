package com.javacourse.javacourse.repositories;

import com.javacourse.javacourse.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
