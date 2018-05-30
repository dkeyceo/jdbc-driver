package com.dkey.jdbc.entity;

public class Model {
    private int id;
    private String modelName;
    private String brand;
    private String body;
    private String kind;
    private String fuel;
    private int powerKwt;
    private int powerHp;
    private int capacity;
    private int cylinder;
    private int ownWeight;
    private int totalWeight;
    private int nSeating;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getPowerKwt() {
        return powerKwt;
    }

    public void setPowerKwt(int powerKwt) {
        this.powerKwt = powerKwt;
    }

    public int getPowerHp() {
        return powerHp;
    }

    public void setPowerHp(int powerHp) {
        this.powerHp = powerHp;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCylinder() {
        return cylinder;
    }

    public void setCylinder(int cylinder) {
        this.cylinder = cylinder;
    }

    public int getOwnWeight() {
        return ownWeight;
    }

    public void setOwnWeight(int ownWeight) {
        this.ownWeight = ownWeight;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(int totalWeight) {
        this.totalWeight = totalWeight;
    }

    public int getnSeating() {
        return nSeating;
    }

    public void setnSeating(int nSeating) {
        this.nSeating = nSeating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Model model = (Model) o;

        if (id != model.id) return false;
        if (powerKwt != model.powerKwt) return false;
        if (powerHp != model.powerHp) return false;
        if (capacity != model.capacity) return false;
        if (cylinder != model.cylinder) return false;
        if (ownWeight != model.ownWeight) return false;
        if (totalWeight != model.totalWeight) return false;
        if (nSeating != model.nSeating) return false;
        if (modelName != null ? !modelName.equals(model.modelName) : model.modelName != null) return false;
        if (brand != null ? !brand.equals(model.brand) : model.brand != null) return false;
        if (body != null ? !body.equals(model.body) : model.body != null) return false;
        if (kind != null ? !kind.equals(model.kind) : model.kind != null) return false;
        return fuel != null ? fuel.equals(model.fuel) : model.fuel == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (modelName != null ? modelName.hashCode() : 0);
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + (body != null ? body.hashCode() : 0);
        result = 31 * result + (kind != null ? kind.hashCode() : 0);
        result = 31 * result + (fuel != null ? fuel.hashCode() : 0);
        result = 31 * result + powerKwt;
        result = 31 * result + powerHp;
        result = 31 * result + capacity;
        result = 31 * result + cylinder;
        result = 31 * result + ownWeight;
        result = 31 * result + totalWeight;
        result = 31 * result + nSeating;
        return result;
    }

    @Override
    public String toString() {
        return "Model{" +
                "id=" + id +
                ", modelName='" + modelName + '\'' +
                ", brand='" + brand + '\'' +
                ", body='" + body + '\'' +
                ", kind='" + kind + '\'' +
                ", fuel='" + fuel + '\'' +
                ", powerKwt=" + powerKwt +
                ", powerHp=" + powerHp +
                ", capacity=" + capacity +
                ", cylinder=" + cylinder +
                ", ownWeight=" + ownWeight +
                ", totalWeight=" + totalWeight +
                ", nSeating=" + nSeating +
                '}';
    }

}
