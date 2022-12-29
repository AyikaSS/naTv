package kg.megacom.services.impl;

import kg.megacom.dao.DbHelper;
import kg.megacom.exceptions.SqlException;
import kg.megacom.models.Shop;
import kg.megacom.services.ShopServices;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class ShopServicesImpl implements ShopServices {
    DbHelper dbHelper = new DbHelper() {


    @Override
    public void save(String name) {
        try( PreparedStatement preparedStatement = dbHelper.getStatement
                    ("insert into tb_shop(name, add_date, active) values(?,?,?)")) {

        preparedStatement.setString(1, name);
        preparedStatement.setLong(2, Long.parseLong(new Date().toString()));
        preparedStatement.setBoolean(3, true);
        } catch (SqlException throwables) {
            throw new SqlException("Произошла ошибка при сохранении объекта в магазин");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void update(Long id, String name) {
        try (PreparedStatement preparedStatement=dbHelper.getStatement
                ("update tb_shop set name=? where id=?")){

            preparedStatement.setString(1, name);
            preparedStatement.setLong(2,id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



    @Override
    public List<Shop> findAll() {
        return null;
    }

    @Override
    public Shop findById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id);

