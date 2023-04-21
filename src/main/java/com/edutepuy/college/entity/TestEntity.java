package com.edutepuy.college.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "test")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
