package com.example.nexttravelbackend.repo;

import com.example.nexttravelbackend.entity.TourPackage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TourPackageRepository extends JpaRepository<TourPackage,Long> {
    Optional <TourPackage> findByName(String name);

    boolean existsByName(String name);
}
