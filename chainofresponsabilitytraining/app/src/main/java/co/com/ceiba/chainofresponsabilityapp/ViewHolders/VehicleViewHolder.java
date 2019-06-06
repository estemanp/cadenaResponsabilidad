package co.com.ceiba.chainofresponsabilityapp.viewHolders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import co.com.ceiba.chainofresponsabilityapp.R;
import co.com.ceiba.chainofresponsabilityapp.dtos.Vehicle;

public class VehicleViewHolder extends RecyclerView.ViewHolder {

    private ImageView image;
    private TextView title;

    public VehicleViewHolder(@NonNull View itemView) {
        super(itemView);

        image = itemView.findViewById(R.id.image);
        title = itemView.findViewById(R.id.title);
    }

    public void bindData(Vehicle vehicle, int resourceId) {

        title.setText(vehicle.getTitle());
        image.setImageResource(resourceId);
    }
}
