package co.com.ceiba.chainofresponsabilityapp.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import co.com.ceiba.chainofresponsabilityapp.R;
import co.com.ceiba.chainofresponsabilityapp.adapters.VehiclesAdapter;
import co.com.ceiba.chainofresponsabilityapp.repositories.VehiclesRepository;
import co.com.ceiba.chainofresponsabilityapp.repositories.VehiclesRepositoryImpl;

public class VehiclesActivity extends AppCompatActivity {

    private RecyclerView vehiclesRecyclerView;
    private VehiclesRepository vehiclesRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle(R.string.app_title);
        initViews();
        setData();
    }

    private void initViews() {

        vehiclesRecyclerView = findViewById(R.id.recycler);
        vehiclesRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setData() {

        vehiclesRepository = new VehiclesRepositoryImpl();
        VehiclesAdapter adapter = new VehiclesAdapter(vehiclesRepository.getVehicles());
        vehiclesRecyclerView.setAdapter(adapter);
    }
}
