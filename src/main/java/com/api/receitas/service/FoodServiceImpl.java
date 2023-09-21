package com.api.receitas.service;

import com.api.receitas.model.Food;
import com.api.receitas.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    private FoodRepository foodRepository;

    @Override
    public Food save(Food food) {
        return foodRepository.save(food);
    }

    @Override
    public List<Food> findAll() {
        return foodRepository.findAll();
    }

    @Override
    public Optional<Food> findById(Long id) {
        return foodRepository.findById(id);
    }

    @Override
    public Food update(Food food) {
        return foodRepository.save(food);
    }

    @Override
    public void deleteById(Long id) {
        foodRepository.deleteById(id);
    }

    @Override
    public List<Food> findByFavorite(boolean favorite) {
        return foodRepository.findByFavorite(favorite);
    }
}