package com.example.wastetowealth.model;

public class AllProductsModel {
    private String productName;
    private String totalKgs;
    private String availKgs;
    private int productImage;
    private int addImage;

    public AllProductsModel() {
    }

    public AllProductsModel(String productName, String totalKgs, String availKgs, int addImage, int productImage) {
        this.productName = productName;
        this.totalKgs = totalKgs;
        this.availKgs = availKgs;
        this.productImage = productImage;
        this.addImage = addImage;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTotalKgs() {
        return totalKgs;
    }

    public void setTotalKgs(String totalKgs) {
        this.totalKgs = totalKgs;
    }

    public String getAvailKgs() {
        return availKgs;
    }

    public void setAvailKgs(String availKgs) {
        this.availKgs = availKgs;
    }

    public int getAddImage() {
        return addImage;
    }

    public void setAddImage(int addImage) {
        this.addImage = addImage;
    }

    public int getProductImage() {
        return productImage;
    }

    public void setProductImage(int productImage) {
        this.productImage = productImage;
    }
}
