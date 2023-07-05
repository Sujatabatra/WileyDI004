package com.sujata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.dto.entity.Husband;
import com.sujata.dto.entity.Wife;
import com.sujata.persistence.HusbandDao;
import com.sujata.persistence.WifeDao;

@Service
public class HusbandWifeServiceImpl implements HusbandWifeService {

	@Autowired
	private HusbandDao husbandDao;
	@Autowired
	private WifeDao wifeDao;
	
	@Override
	public void addHusband(Husband husband) {
		husbandDao.save(husband);

	}

	@Override
	public void addWife(Wife wife) {
		
		Husband husband=searchHusbandById(wife.getHubby().getHusbandId());
		wife.setHubby(husband);
		
		wifeDao.save(wife);

	}

	@Override
	public Husband searchHusbandById(int hId) {
		return husbandDao.findById(hId).orElse(null);
	}

	@Override
	public Wife searchWifeById(String wId) {
		return wifeDao.findById(wId).orElse(null);
	}

}
