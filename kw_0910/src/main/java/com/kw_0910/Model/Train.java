package com.kw_0910.Model;

import javax.persistence.*;

@Entity
public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String start;

    private String stop;

    private int distance;
    private int quantity;

    @Column(length = 50)
    private String location;

    private boolean hasEquipment;

    public Train(){
    }

    public Train(String start, String stop, int distance, int quantity, String location, boolean hasEquipment) {
        this.start = start;
        this.stop = stop;
        this.distance = distance;
        this.quantity = quantity;
        this.location = location;
        this.hasEquipment = hasEquipment;
    }

    //setters and getters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getStop() {
        return stop;
    }

    public void setStop(String stop) {
        this.stop = stop;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isHasEquipment() {
        return hasEquipment;
    }

    public void setHasEquipment(boolean hasEquipment) {
        this.hasEquipment = hasEquipment;
    }
}
