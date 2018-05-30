package com.dkey.jdbc.service;

import com.dkey.jdbc.dao.ModelDao;
import com.dkey.jdbc.entity.Model;
import com.dkey.jdbc.util.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ModelService extends ConnectionManager implements ModelDao {
    Connection connection = getConnection();

    public Model getById(int id) {
        PreparedStatement ps = null;

        String sql = "select * from model_view where id = ?";

        Model model = new Model();
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1,id);

            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                model.setId(rs.getInt("id"));
                model.setModelName(rs.getString("model_name"));
                model.setBrand(rs.getString("brand"));
                model.setBody(rs.getString("body"));
                model.setKind(rs.getString("kind"));
                model.setFuel(rs.getString("fuel"));
                model.setPowerKwt(rs.getInt("power_kwt"));
                model.setPowerHp(rs.getInt("power_hp"));
                model.setCapacity(rs.getInt("capacity"));
                model.setCylinder(rs.getInt("cylinder"));
                model.setOwnWeight(rs.getInt("own_weight"));
                model.setTotalWeight(rs.getInt("total_weight"));
                model.setnSeating(rs.getInt("n_seating"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            if(ps!=null)
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            if(connection!=null)
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
        return model;
    }

    public List<Model> getByBrand(String brand) {
        PreparedStatement ps = null;
        String sql = "select * from model_view where brand = upper(?) ";

        List<Model> models = new ArrayList<Model>();
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1,brand);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Model model = new Model();
                model.setId(rs.getInt("id"));
                model.setModelName(rs.getString("model_name"));
                model.setBrand(rs.getString("brand"));
                model.setBody(rs.getString("body"));
                model.setKind(rs.getString("kind"));
                model.setFuel(rs.getString("fuel"));
                model.setPowerKwt(rs.getInt("power_kwt"));
                model.setPowerHp(rs.getInt("power_hp"));
                model.setCapacity(rs.getInt("capacity"));
                model.setCylinder(rs.getInt("cylinder"));
                model.setOwnWeight(rs.getInt("own_weight"));
                model.setTotalWeight(rs.getInt("total_weight"));
                model.setnSeating(rs.getInt("n_seating"));
                models.add(model);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(ps!=null)
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            if(connection!=null)
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }

        return models;
    }

    public List<Model> getByModel(String model) {
        return null;
    }

    public List<Model> getByBrandAndModel(String brand, String model) {
        return null;
    }
}
