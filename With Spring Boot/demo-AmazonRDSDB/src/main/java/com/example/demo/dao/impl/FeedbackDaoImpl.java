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

import com.example.demo.dao.FeedbackDao;
import com.example.demo.domain.FeedbackVO;

@Component
public class FeedbackDaoImpl implements FeedbackDao {

	private NamedParameterJdbcTemplate jdbcTemplate;

	@Autowired
	public FeedbackDaoImpl(@Qualifier(value = "rdsJdbcTemplate") NamedParameterJdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public String saveFeedback(FeedbackVO feedback) {
		String feedbackInserSQL = "Insert into Feedback_Tbl(email, feedback) values(:email, :feeback)";
		MapSqlParameterSource map = new MapSqlParameterSource();
		map.addValue("email", feedback.getUserEmail());
		map.addValue("feeback", feedback.getFeedbackMsg());
		jdbcTemplate.execute(feedbackInserSQL, map, new PreparedStatementCallback<>() {
			public Object doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				return ps.executeUpdate();
			}
		});
		return "Feedback Saved Successfully !!";
	}

}
