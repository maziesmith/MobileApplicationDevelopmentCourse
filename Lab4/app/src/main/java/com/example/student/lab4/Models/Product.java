package com.example.student.lab4.Models;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by msrabon on 11/16/16.
 */

@Table(name = "products")
public class Product extends Model {

    @Column(name = "name")
    private String product_name;

    @Column(name = "product_id")
    private String product_id;

    @Column(name = "stock")
    private int product_stock;

    @Column(name = "price")
    private double product_price;

    public Product() {
    }

    public Product(String product_name, int product_stock, double product_price) {
        this.product_name = product_name;
        this.product_stock = product_stock;
        this.product_price = product_price;
    }

    public String getProduct_name() {
        return product_name;
    }

    public String getProduct_id() {
        return product_id;
    }

    public int getProduct_stock() {
        return product_stock;
    }

    public double getProduct_price() {
        return product_price;
    }

    @Override
    public String toString() {
        return product_id + product_name + product_price + product_stock;
    }
}
