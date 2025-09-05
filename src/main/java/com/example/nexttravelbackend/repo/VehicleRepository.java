package com.example.nexttravelbackend.repo;

import com.example.nexttravelbackend.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle,Long> {

    Optional<Vehicle> findByVehicleNumber(String vehicleNumber);

    boolean existsByVehicleNumber(String vehicleNumber);

    List<Vehicle> findByStatus(String status);

    List<Vehicle> findAllByBookedAndStatus(String booked, String status);

    List<Vehicle> findByUserEmail(String email);

    String findOwnerEmailByVehicleNumber(String vehicleNumber);
}
