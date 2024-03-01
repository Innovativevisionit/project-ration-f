package com.example.wastetowealth.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wastetowealth.AllProducts;
import com.example.wastetowealth.R;
import com.example.wastetowealth.model.AllProductsModel;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {
    private final List<AllProductsModel> dataList;

    public ProductAdapter(AllProducts allProducts, List<AllProductsModel> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.product_card, parent, false);
        return new ProductAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        AllProductsModel item = dataList.get(position);

        holder.addView.setImageResource(item.getAddImage());
        holder.productName.setText(item.getProductName());
        holder.totalKgs.setText(item.getTotalKgs());
        holder.availKgs.setText(item.getAvailKgs());
        holder.productImage.setImageResource(item.getProductImage());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView addView;
        public ImageView productImage;
        public TextView productName;
        public TextView totalKgs;
        public TextView availKgs;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            addView = itemView.findViewById(R.id.addProducts);
            productName = itemView.findViewById(R.id.productName);
            totalKgs = itemView.findViewById(R.id.totalKgs);
            availKgs = itemView.findViewById(R.id.availKgs);
            productImage = itemView.findViewById(R.id.imageStore);
        }
    }
}
