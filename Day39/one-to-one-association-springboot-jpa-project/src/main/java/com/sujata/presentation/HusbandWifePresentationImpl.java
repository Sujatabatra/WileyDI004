package com.sujata.presentation;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sujata.dto.entity.Husband;
import com.sujata.dto.entity.Wife;
import com.sujata.persistence.WifeDao;
import com.sujata.service.HusbandWifeService;

@Component
public class HusbandWifePresentationImpl implements HusbandWifePresentation {

	@Autowired
	private HusbandWifeService husbandWifeService;
	
	@Override
	public void showMenu() {
		System.out.println("1. Add Husband");
		System.out.println("2. Add Wife");
		System.out.println("3. Search WIfe By ID");
		System.out.println("4. Exit");

	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		switch(choice) {
		case 1:
			Husband husband=new Husband();
			System.out.println("Enter Husband Id : ");
			husband.setHusbandId(scanner.nextInt());
			System.out.println("Enter Husband Name : ");
			husband.setHusbandName(scanner.next());
			husbandWifeService.addHusband(husband);
			System.out.println("Husband Added");
			break;
		case 2:
			Wife wife=new Wife();
			System.out.println("Enter Wife ID : ");
			wife.setWifeId(scanner.next());
			System.out.println("Enter Wife Name : ");
			wife.setWifeName(scanner.next());
			
			Husband hubby=new Husband();
			System.out.println("Enter Husband ID : ");
			hubby.setHusbandId(scanner.nextInt());
			
			wife.setHubby(hubby);
			
			
			husbandWifeService.addWife(wife);
			System.out.println("Wife Added");
			break;
		case 3:
			System.out.println("Enter Wife ID : ");
			String id=scanner.next();
			Wife searchedWife=husbandWifeService.searchWifeById(id);
			System.out.println(searchedWife);
			break;
		case 4:
			System.out.println("Thanks for Visiting Us!");
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
		}

	}

}
