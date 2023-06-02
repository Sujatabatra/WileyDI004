package com.ellie.service;

import java.util.LinkedList;

import com.ellie.dto.Single_DVD;

public interface LibraryBusinessLogic {
LinkedList<Single_DVD> getAllDvds();
boolean addDVD(Single_DVD dvd);
boolean deleteDVD(String title);
public void saveAllDVDs();
public Single_DVD getSingleDVD(String title);
}
