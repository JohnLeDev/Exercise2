package controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import model.Company;
import model.Employee;
import model.Manager;

public class ManagerEmployee {
	private List<Employee> listOfEmployee;
	private Company company;
	
	public ManagerEmployee() {
		listOfEmployee = new ArrayList<>();
		company = new Company();
	}

	public void inputCompanyName(Scanner scanner) {
		company.inputInfoCompany(scanner);
	}

	public void outputCompanyInfo() {
		company.outputInfo();
	};

	public boolean add(Employee employee) {
		if (employee == null)
			return false;

		if (employee.getId() == null || employee.getId().equals(""))
			return false;
		return listOfEmployee.add(employee);
	}

	public boolean delete(Scanner scanner) {
		System.out.println("Nhap id can xoa : ");
		String id = scanner.nextLine();
	
		String idManager = null;
		for (int counter = 0 ; counter < listOfEmployee.size() ; counter++) {
			if (listOfEmployee.get(counter).getId().equals(id)) {
				if (listOfEmployee.get(counter) instanceof Manager) {
					idManager = listOfEmployee.get(counter).getId();
					listOfEmployee.remove(counter);
					break;
				} else {
					listOfEmployee.remove(counter);
				}
			}
			System.out.println();
		}
		Iterator iEmployee = listOfEmployee.iterator();
		if (idManager != null) {
			while (iEmployee.hasNext()) {
				Employee data = (Employee) iEmployee.next();
				if (data.getIdManager().equals(idManager)) {
					iEmployee.remove();
				}
			}
		}
		return false;
	}

	public void getAll() {
		for (Employee employee : listOfEmployee) {
			employee.output();
			System.out.println();
		}
	}
	public void outputTotal() {
		double count = 0;
		for( Employee employee : listOfEmployee) {
			count = count + employee.getSalary();
		}
		System.out.print("Tong luong cong ty la : ");
		System.out.println(count);
	}

}
