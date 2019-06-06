package co.com.ceiba.chainofresponsabilityapp.chains;

import co.com.ceiba.chainofresponsabilityapp.R;
import co.com.ceiba.chainofresponsabilityapp.dtos.Vehicle;
import co.com.ceiba.chainofresponsabilityapp.enumerations.VehicleType;
import co.com.ceiba.chainofresponsabilityapp.viewHolders.VehicleViewHolder;

public class MotorbikeImageHandler extends VehicleImageHandler {

    @Override
    public void handleImageType(Vehicle vehicle, VehicleViewHolder vehicleViewHolder) {

        if (vehicle.getType() == VehicleType.MOTORBIKE) {

            vehicleViewHolder.bindData(vehicle, R.drawable.ic_motorbike);
        } else if (successor != null) {

            successor.handleImageType(vehicle, vehicleViewHolder);
        }
    }
}
