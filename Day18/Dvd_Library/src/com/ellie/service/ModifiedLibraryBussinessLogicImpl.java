package com.ellie.service;

import com.ellie.dto.Single_DVD;
import com.ellie.persistance.LibraryDataAccess;

public class ModifiedLibraryBussinessLogicImpl extends LibraryBusinessLogicImpl {

	public ModifiedLibraryBussinessLogicImpl(LibraryDataAccess dataAccess) {
		super(dataAccess);
	}
	
	@Override
	public Single_DVD getSingleDVD(String title) {
		for(Single_DVD dvd:getAllDvds()) {
			if(dvd.getTitle().equalsIgnoreCase(title)){
				dvd.setTitle(dvd.getTitle().toUpperCase());
				return dvd;
			}
		}
		return null;
	}

	
}
