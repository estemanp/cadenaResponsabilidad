package co.com.ceiba.chainofresponsabilityapp.repositories;

import java.util.ArrayList;
import java.util.List;

import co.com.ceiba.chainofresponsabilityapp.dtos.Vehicle;
import co.com.ceiba.chainofresponsabilityapp.enumerations.VehicleType;

public class VehiclesRepositoryImpl implements VehiclesRepository {

    private List<Vehicle> vehicles;

    public VehiclesRepositoryImpl() {

        createVehicles();
    }

    @Override
    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    private void createVehicles() {

        final Vehicle bike = new Vehicle("Bicicleta", "Bicicleta", VehicleType.BIKE);
        final Vehicle car = new Vehicle("Carro", "Bicicleta", VehicleType.CAR);
        final Vehicle motorbike = new Vehicle("Motocicleta", "Motocicleta", VehicleType.MOTORBIKE);

        vehicles = new ArrayList<Vehicle>() { {
            add(bike);
            add(car);
            add(motorbike);
        } };
    }
}
