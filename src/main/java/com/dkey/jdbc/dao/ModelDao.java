package com.dkey.jdbc.dao;

import com.dkey.jdbc.entity.Model;

import java.util.List;

public interface ModelDao {
    Model getById(int id);
    List<Model> getByBrand(String brand);
    List<Model> getByModel(String model);
    List<Model> getByBrandAndModel(String brand, String model);
}
