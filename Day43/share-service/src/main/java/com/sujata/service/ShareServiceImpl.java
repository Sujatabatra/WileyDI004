package com.sujata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.dto.entity.Share;
import com.sujata.persistence.ShareDao;

@Service
public class ShareServiceImpl implements ShareService {

	@Autowired
	private ShareDao shareDao;
	
	@Override
	public List<Share> getAllShares() {
		return shareDao.getAllShares();
	}

	@Override
	public Share getShareById(String shareId) {
		return shareDao.searchShareById(shareId);
		
	}

}
