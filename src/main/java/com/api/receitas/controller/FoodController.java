package com.api.receitas.controller;

import com.api.receitas.model.Food;
import com.api.receitas.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/foods")
public class FoodController {
    @Autowired
    private FoodService foodService;

    @GetMapping
    public ResponseEntity<List<Food>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(foodService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Food>> findById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(foodService.findById(id));
    }

    @GetMapping("/favorites")
    public ResponseEntity<List<Food>> findFavoriteFoods() {
        List<Food> favoriteFoods = foodService.findByFavorite(true);
        return ResponseEntity.status(HttpStatus.OK).body(favoriteFoods);
    }

    @PostMapping
    public ResponseEntity<Food> create(@RequestBody Food food) {
        return ResponseEntity.status(HttpStatus.CREATED).body(foodService.save(food));
    }

    @PutMapping
    public ResponseEntity<Food> update(@RequestBody Food food) {
        return ResponseEntity.status(HttpStatus.OK).body(foodService.update(food));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        foodService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}