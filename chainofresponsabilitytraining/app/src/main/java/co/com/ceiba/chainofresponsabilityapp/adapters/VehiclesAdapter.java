package co.com.ceiba.chainofresponsabilityapp.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import co.com.ceiba.chainofresponsabilityapp.R;
import co.com.ceiba.chainofresponsabilityapp.chains.BikeImageHandler;
import co.com.ceiba.chainofresponsabilityapp.chains.CarImageHandler;
import co.com.ceiba.chainofresponsabilityapp.chains.MotorbikeImageHandler;
import co.com.ceiba.chainofresponsabilityapp.chains.VehicleImageHandler;
import co.com.ceiba.chainofresponsabilityapp.viewHolders.VehicleViewHolder;
import co.com.ceiba.chainofresponsabilityapp.dtos.Vehicle;

public class VehiclesAdapter extends RecyclerView.Adapter<VehicleViewHolder> {

    private List<Vehicle> vehicles;

    public VehiclesAdapter(List<Vehicle> vehicles) {

        this.vehicles = vehicles;
    }

    @NonNull
    @Override
    public VehicleViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int itemType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);
        return new VehicleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VehicleViewHolder vehicleViewHolder, int position) {

        Vehicle vehicle = vehicles.get(position);

        VehicleImageHandler vehicleImageHandler = new BikeImageHandler().setSuccessor(new CarImageHandler().setSuccessor(new MotorbikeImageHandler()));
        vehicleImageHandler.handleImageType(vehicle, vehicleViewHolder);
    }

    @Override
    public int getItemCount() {
        return vehicles.size();
    }
}
