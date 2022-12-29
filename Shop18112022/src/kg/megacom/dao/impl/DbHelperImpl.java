package kg.megacom.dao.impl;

import kg.megacom.dao.DbHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DbHelperImpl implements DbHelper {
    @Override
    public PreparedStatement getStatement(String sql) {
//        Connection connection = DriverManager.getConnection();
//        return null;
    }
}
