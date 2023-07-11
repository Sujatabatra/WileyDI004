package com.sujata.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sujata.dto.entity.Share;

@Repository
public class ShareDaoImpl implements ShareDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Share> getAllShares() {
		return jdbcTemplate.query("SELECT * FROM SHARE", new ShareMapper());
	}

	@Override
	public Share searchShareById(String sId) {
		try {
			return jdbcTemplate.queryForObject("SELECT * FROM SHARE WHERE SHAREID=?", new ShareMapper(), sId);
		} catch (Exception ex) {
			return null;
		}
	}

}
