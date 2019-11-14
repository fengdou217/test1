package Dao.Impl;

import Model.LoginModel;
import util.JDBC;

public class LoginImpl implements LoginDao {

    @Override
    public int add(LoginModel model) {
        String sql = "insert into t_user (username,password) values('" + model.getUsername() + "'," + model.getPassword() + ");";
        return JDBC.update(sql);
    }
}
