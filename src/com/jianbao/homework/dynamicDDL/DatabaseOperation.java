package com.jianbao.homework.dynamicDDL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseOperation implements AutoCloseable {
    public DatabaseOperation() {
        try {
            if (connection == null) {
                //连接数据库
                Class.forName(("com.mysql.cj.jdbc.Driver"));
                connection = DriverManager.getConnection(url, username, password);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void execute(String sql){
        try {
            PreparedStatement ptmt=this.connection.prepareStatement(sql);
            ptmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void close() throws Exception {
        this.connection.close();
    }

    private static final String url = "jdbc:mysql://192.168.0.101:3306/test?serverTimezone=GMT";
    private static final String username = "root";
    private static final String password = "123456";
    private Connection connection = null;
}
