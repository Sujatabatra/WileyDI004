package com.sujata.persistence;

import java.util.List;

import com.sujata.dto.entity.Share;

public interface ShareDao {

	List<Share> getAllShares();
	Share searchShareById(String sId);
}
