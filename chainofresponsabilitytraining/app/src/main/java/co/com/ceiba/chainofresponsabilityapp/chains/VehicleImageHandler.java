package co.com.ceiba.chainofresponsabilityapp.chains;

import co.com.ceiba.chainofresponsabilityapp.dtos.Vehicle;
import co.com.ceiba.chainofresponsabilityapp.viewHolders.VehicleViewHolder;

public abstract class VehicleImageHandler {

    protected VehicleImageHandler successor;

    public VehicleImageHandler setSuccessor(VehicleImageHandler successor) {

        this.successor = successor;
        return this;
    }

    public abstract void handleImageType(Vehicle vehicle, VehicleViewHolder vehicleViewHolder);
}
