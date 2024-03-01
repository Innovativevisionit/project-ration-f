package com.example.wastetowealth;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wastetowealth.adapter.CardAdapter;
import com.example.wastetowealth.adapter.ProductAdapter;
import com.example.wastetowealth.model.AllProductsModel;
import com.example.wastetowealth.model.DashboardCards;

import java.util.ArrayList;
import java.util.List;

public class AllProducts extends AppCompatActivity {
    private ArrayList<AllProductsModel> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_products);
        RecyclerView courseRV = findViewById(R.id.allProducts);
        ArrayList<AllProductsModel> productList = new ArrayList<>();

        productList.add(new AllProductsModel("Product 1", "10", "5", R.drawable.add,R.drawable.p1));
        productList.add(new AllProductsModel("Product 2", "15", "8", R.drawable.add,R.drawable.p2));
        productList.add(new AllProductsModel("Product 3", "15", "8", R.drawable.add,R.drawable.p3));
        productList.add(new AllProductsModel("Product 4", "15", "8", R.drawable.add,R.drawable.p4));
        productList.add(new AllProductsModel("Product 5", "15", "8", R.drawable.add,R.drawable.p5));

        ProductAdapter courseAdapter = new ProductAdapter(this,productList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        courseRV.setLayoutManager(linearLayoutManager);
        courseRV.setAdapter(courseAdapter);
    }
}
