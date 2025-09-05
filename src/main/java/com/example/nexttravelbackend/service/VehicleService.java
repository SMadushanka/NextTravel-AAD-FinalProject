package com.example.nexttravelbackend.service;

import com.example.nexttravelbackend.dto.VehicleDTO;
import jakarta.validation.Valid;

import java.util.List;

public interface VehicleService {


    int saveVehicle(@Valid VehicleDTO vehicleDTO);

    List<VehicleDTO> getAllVehicles();

    VehicleDTO getVehicleById(Long id);

    boolean updateVehicleStatus(Long id, String status);

    int deactivateVehicle(String vehicleNumber);

    int activateVehicle(String vehicleNumber);

    List<VehicleDTO> getVehiclesByStatus(String status);

    List<VehicleDTO> getAvailableVehicles();

    List<VehicleDTO> getVehiclesByUserEmail(String email);

    int getTotalVehicleCount();
}
