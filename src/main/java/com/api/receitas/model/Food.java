package com.api.receitas.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    private Long time;

    @Column(length = 200000)
    private String cover;

    @Column(length = 2000)
    private String video;

    @Column(length = 3000)
    private String ingredients;

    @Column(length = 3000)
    private String instructions;

    private Boolean favorite;
}