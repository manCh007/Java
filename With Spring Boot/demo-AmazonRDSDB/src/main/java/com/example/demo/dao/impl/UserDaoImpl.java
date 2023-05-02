package com.example.demo.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.dao.UserDao;
import com.example.demo.domain.UserDetailsVO;


@Component
public class UserDaoImpl implements UserDao {
	
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	@Autowired
	public UserDaoImpl(@Qualifier(value = "rdsJdbcTemplate") NamedParameterJdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}

	@Override
	public UserDetailsVO saveUser(UserDetailsVO user) {
		String userInserSQL = "Insert into User_Tbl(firstName, lastName, email) values(:fname, :lname, :email)";
		MapSqlParameterSource map = new MapSqlParameterSource();
		map.addValue("fname", user.getFirstName());
		map.addValue("lname", user.getLastName());
		map.addValue("email", user.getUserEmail());
		jdbcTemplate.execute(userInserSQL, map, new PreparedStatementCallback<>() {
            public Object doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
                return ps.executeUpdate();
            }
        });
		return user;
	}

}
