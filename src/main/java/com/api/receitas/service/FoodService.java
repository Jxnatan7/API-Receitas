package com.api.receitas.service;

import com.api.receitas.model.Food;

import java.util.List;
import java.util.Optional;

public interface FoodService {
    Food save(Food food);

    List<Food> findAll();

    Optional<Food> findById(Long id);

    Food update(Food food);

    void deleteById(Long id);

    List<Food> findByFavorite(boolean favorite);
}