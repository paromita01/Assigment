package com.example.vehicleapi.service;

import java.util.List;
import java.util.Optional;

import com.example.vehicleapi.model.Vehicle;
import com.example.vehicleapi.repository.VehicleRepository;

public class VehicleService {
    private final VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    public Optional<Vehicle> getVehicleByVin(String vin) {
        return vehicleRepository.findById(vin);
    }

    public Vehicle createVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    public Vehicle updateVehicle(String vin, Vehicle vehicle) {
        vehicle.setVin(vin);
        return vehicleRepository.save(vehicle);
    }

    public void deleteVehicle(String vin) {
        vehicleRepository.deleteById(vin);
    }
}
