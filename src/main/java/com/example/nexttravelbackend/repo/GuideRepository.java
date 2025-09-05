package com.example.nexttravelbackend.repo;

import com.example.nexttravelbackend.entity.Guide;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GuideRepository extends JpaRepository<Guide, Long> {

    Optional<Guide> findByEmail(String email);

    boolean existsByEmail(String email);

    List<Guide> findAll();

    List<Guide> findAllByBookedAndStatus(String booked, String status);
}
