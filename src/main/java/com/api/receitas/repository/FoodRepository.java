package com.api.receitas.repository;

import com.api.receitas.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoodRepository extends JpaRepository<Food, Long> {
    List<Food> findByFavorite(boolean favorite);
}