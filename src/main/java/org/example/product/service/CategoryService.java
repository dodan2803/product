package org.example.product.service;

import org.example.product.model.Category;
import org.example.product.service.IService.ICategoryService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryService implements ICategoryService<Category> {
    Connection connection = ConnectToMySQL.getConnection();
    @Override
    public void add(Category category) {

    }

    @Override
    public void edit(int id, Category category) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Category> findAll() {
        List<Category> categories = new ArrayList<>();
        String sql = "select * from category;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                Category category = new Category(id, name);
                categories.add(category);
            }
        } catch (SQLException e) {
                throw new RuntimeException(e);
        }
        return categories;
    }
}
