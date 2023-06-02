package com.ellie.ui;

import java.util.LinkedList;
import java.util.Scanner;

import com.ellie.dto.Single_DVD;
import com.ellie.service.LibraryBusinessLogicImpl;

public class LibraryUserInterfaceImpl implements LibraryUserInterface {

	Scanner scanner = new Scanner(System.in);
	//Not creating the object : dependency
	private LibraryBusinessLogicImpl businessLogic;/* =new LibraryBusinessLogicImpl(); */

	
	
	public void setBusinessLogic(LibraryBusinessLogicImpl businessLogic) {
		this.businessLogic = businessLogic;
	}

	@Override
	public void showMenu() {
		System.out.println("1. List all DVD's in collection");
		System.out.println("2. Add DVD to the collection");
		System.out.println("3. Remove DVD from the collection");
		System.out.println("4. Edit information for a DVD in the collection");
		System.out.println("5. Search for DVD information by Title");
		System.out.println("6. Check DVD status by Title");
		System.out.println("7. Exit");

	}

	@Override
	public void performMenu(int action) {
		switch (action) {
		case 1:
			LinkedList<Single_DVD> dvds = businessLogic.getAllDvds();
			for (Single_DVD dvd : dvds) {
				System.out.println(dvd);
			}
			System.out.println("------------------------------");
			break;
		case 2:
			addDVDToCollection();
			System.out.println("------------------------------");
			break;
		case 3:
			deleteDVDFromCollection();
			System.out.println("------------------------------");
			break;
		case 4:
			editDVDInCollection();
			System.out.println("------------------------------");
			break;
		case 5:
			System.out.println("Enter the film title you would like information for : ");
			String titleForInfo = scanner.nextLine();
			if (businessLogic.getSingleDVD(titleForInfo) == null)
				System.out.println("The film : " + titleForInfo + " was not found in our database");
			else
				System.out.println(businessLogic.getSingleDVD(titleForInfo));
			System.out.println("------------------------------");
			break;
		case 6:
			System.out.println("Enter the film title you would like to check the status of for : ");
			String titleForStatus = scanner.nextLine();
			if (businessLogic.getSingleDVD(titleForStatus) == null)
				System.out.println("The film : " + titleForStatus + " has not been added to the database yet!");
			else
				System.out.println("The film : " + titleForStatus + " is in the database!!");
			System.out.println("------------------------------");
			break;

		case 7:
			businessLogic.saveAllDVDs();
			System.out.println("Thank you and goodbye");
			System.out.println("------------------------------");
			System.exit(0);
		default:
			System.out.println("Invalid choice");
			System.out.println("------------------------------");
		}

	}

	public void addDVDToCollection() {
		Single_DVD dvd = new Single_DVD();
		System.out.println("Please enter the Title of the film :");
		dvd.setTitle(scanner.nextLine());
		System.out.println("Please enter the Release Date of the film :");
		dvd.setReleaseDate(scanner.nextLine());
		System.out.println("Please enter the Director's name :");
		dvd.setDirectorName(scanner.nextLine());
		System.out.println("Please enter the Studio :");
		dvd.setStudio(scanner.nextLine());
		System.out.println("Please enter any other notes you would like to add :");
		dvd.setUserNotes(scanner.nextLine());
		System.out.println("Please enter the MPAA Rating of the film :");
		dvd.setRating(scanner.nextInt());
		scanner.nextLine();

		boolean status = businessLogic.addDVD(dvd);
		if (status)
			System.out.println("Added the film!");
		else
			System.out.println("Ooops! Something went wrong");

	}

	public void deleteDVDFromCollection() {
		System.out.println("Enter the title of the film you want to delete : ");
		String title = scanner.nextLine();
		if (businessLogic.deleteDVD(title))
			System.out.println("Film deleted!");
		else
			System.out.println("Cant find the film : " + title + " please check the spelling and try again!");

	}

	public void editDVDInCollection() {
		System.out.println("Enter the title of the film you wish to edit : ");
		String titleToEdit = scanner.nextLine();
		Single_DVD dvdEdit = businessLogic.getSingleDVD(titleToEdit);
		if (dvdEdit == null)
			System.out.println("The film : " + titleToEdit + " is not in the database so cannot be edited!");
		else {
			System.out.println("Would you like to edit the Title of the film : y/n");
			if (scanner.nextLine().equalsIgnoreCase("y")) {
				System.out.println("Please enter the eidited title");
				dvdEdit.setTitle(scanner.nextLine());
			} else {
				System.out.println("Would you like to edit the Release Date of the film : y/n");
				if (scanner.nextLine().equalsIgnoreCase("y")) {
					System.out.println("Please enter the eidited Release Date");
					dvdEdit.setReleaseDate(scanner.nextLine());
				} else {
					System.out.println("Would you like to edit the Director's name : y/n");
					if (scanner.nextLine().equalsIgnoreCase("y")) {
						System.out.println("Please enter the eidited Director's name");
						dvdEdit.setDirectorName(scanner.nextLine());
					} else {
						System.out.println("Would you like to edit the Studio : y/n");
						if (scanner.nextLine().equalsIgnoreCase("y")) {
							System.out.println("Please enter the eidited studio");
							dvdEdit.setStudio(scanner.nextLine());
						} else {
							System.out.println("Would you like to edit your notes : y/n");
							if (scanner.nextLine().equalsIgnoreCase("y")) {
								System.out.println("Please enter your eidited notes");
								dvdEdit.setUserNotes(scanner.nextLine());
							} else {
								System.out.println("Would you like to edit the MPAA Rating of the film : y/n");
								if (scanner.nextLine().equalsIgnoreCase("y")) {
									System.out.println("Please enter the eidited MPAA rating");
									dvdEdit.setRating(scanner.nextInt());

								}
							}
						}
					}
				}
			}

			System.out.println("Edited! Thank you.");
		}
	}
}
