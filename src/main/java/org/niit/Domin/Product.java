/*
 * Author Name: Philip Meshach
 * Date: 21-12-2022
 * Praise The Lord
 */
package org.niit.Domin;

public class Product {

    private String brandName;
    private int id;
    private int price;

    public Product() {
    }

    public Product(String brandName, int id, int price) {
        this.brandName = brandName;
        this.id = id;
        this.price = price;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "brandName='" + brandName + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }
}
