package com.sujata.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sujata.dto.entity.Share;

public class ShareMapper implements RowMapper<Share> {

	@Override
	public Share mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		
		Share share=new Share();
		share.setShareId(resultSet.getString("shareId"));
		share.setShareName(resultSet.getString("shareName"));
		share.setMarketValue(resultSet.getDouble("marketPrice"));
		
		return share;
	}

}
