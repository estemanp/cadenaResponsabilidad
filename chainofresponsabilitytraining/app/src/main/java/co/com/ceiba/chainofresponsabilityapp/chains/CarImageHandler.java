package co.com.ceiba.chainofresponsabilityapp.chains;

import co.com.ceiba.chainofresponsabilityapp.R;
import co.com.ceiba.chainofresponsabilityapp.dtos.Vehicle;
import co.com.ceiba.chainofresponsabilityapp.enumerations.VehicleType;
import co.com.ceiba.chainofresponsabilityapp.viewHolders.VehicleViewHolder;

public class CarImageHandler extends VehicleImageHandler {

    @Override
    public void handleImageType(Vehicle vehicle, VehicleViewHolder vehicleViewHolder) {

        if (vehicle.getType() == VehicleType.CAR) {

            vehicleViewHolder.bindData(vehicle, R.drawable.ic_car);
        } else if (successor != null) {

            successor.handleImageType(vehicle, vehicleViewHolder);
        }
    }
}
