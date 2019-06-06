package co.com.ceiba.chainofresponsabilityapp.repositories;

import java.util.List;

import co.com.ceiba.chainofresponsabilityapp.dtos.Vehicle;

public interface VehiclesRepository {

    List<Vehicle> getVehicles();
}
