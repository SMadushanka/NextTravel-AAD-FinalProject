package com.example.nexttravelbackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "destinations")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Destination {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(length = 500)
    private String description;

    private String imageUrl;

    private String location;  // e.g., "Southern Province, Sri Lanka"

    private String category;  // e.g., "Beach", "Wildlife", "Cultural", etc.

    private String costPerDay;
}
