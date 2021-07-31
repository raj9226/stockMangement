package com.example.arbinstockmanagement;

public class model {
    String product_name;
    Float product_quantity;
    Float product_price;

    public model(String product_name, Float product_quantity, Float product_price) {
        this.product_name = product_name;
        this.product_quantity = product_quantity;
        this.product_price = product_price;
    }


    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Float getProduct_quantity() {
        return product_quantity;
    }

    public void setProduct_quantity(Float product_quantity) {
        this.product_quantity = product_quantity;
    }

    public Float getProduct_price() {
        return product_price;
    }

    public void setProduct_price(Float product_price) {
        this.product_price = product_price;
    }
}
