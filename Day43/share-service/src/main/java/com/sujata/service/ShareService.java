package com.sujata.service;

import java.util.List;

import com.sujata.dto.entity.Share;

public interface ShareService {

	List<Share> getAllShares();
	Share getShareById(String shareId);
}
