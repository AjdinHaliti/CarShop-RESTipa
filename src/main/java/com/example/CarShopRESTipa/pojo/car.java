package com.example.CarShopRESTipa.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column
    private String type;
    @Column
    private String model;
    @Column
    private String fuel;
    @Column
    private Integer power;
    @Column
    private Integer mileage;
    @Column
    private Double price;

    @ManyToOne
    @JoinColumn(name = "car_id", nullable = false)
    @JsonIgnore
    private com.example.CarShopRESTipa.pojo.carShop carShop;

    public car() {
    }

    public car(String type, String model, String fuel, Integer power, Integer mileage, Double price, com.example.CarShopRESTipa.pojo.carShop carShop){
        this.type = type;
        this.model = model;
        this.fuel = fuel;
        this.power = power;
        this.mileage = mileage;
        this.price = price;
        this.carShop = carShop;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public com.example.CarShopRESTipa.pojo.carShop getCarShop() {
        return carShop;
    }

    public void setCarShop(com.example.CarShopRESTipa.pojo.carShop carShop) {
        this.carShop = carShop;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", model='" + model + '\'' +
                ", fuel='" + fuel + '\'' +
                ", power=" + power +
                ", mileage=" + mileage +
                ", price=" + price +
                ", carShop=" + carShop +
                '}';
    }
}