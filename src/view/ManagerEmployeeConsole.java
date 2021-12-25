package view;

import java.util.Scanner;

import controller.ManagerEmployee;
import model.Direction;
import model.Employee;
import model.Manager;
import model.Staff;

public class ManagerEmployeeConsole {

	private ManagerEmployee controller;
	private Scanner scanner = new Scanner(System.in);

	public ManagerEmployeeConsole() {
		
		this.controller = new ManagerEmployee();
		
		mockData();
	}
	public void mockData() {
		Employee staff1 = new Staff();
		staff1.setId("1");
		staff1.setName("LeA");
		staff1.setPhone("0123123123123");
		staff1.setSalary(10000d);
		staff1.setWorkDay(10);
		staff1.setIdManager("10");
		Employee staff2 = new Staff();
		staff2.setId("2");
		staff2.setName("LeB");
		staff2.setPhone("0123123123123");
		staff2.setSalary(100000d);
		staff2.setWorkDay(10);
		staff2.setIdManager("10");
		Employee staff3 = new Staff();
		staff3.setId("3");
		staff3.setName("LeC");
		staff3.setPhone("0123123123123");
		staff3.setSalary(10000.231d);
		staff3.setWorkDay(10);
		staff3.setIdManager("10");
		
		Employee staff4 = new Manager();
		staff4.setId("10");
		staff4.setName("LeC");
		staff4.setPhone("0123123123123");
		staff4.setSalary(1000d);
		staff4.setWorkDay(10);
		
		controller.add(staff1);
		controller.add(staff2);
		controller.add(staff3);
		controller.add(staff4);//		staff4.setIdManager("");
	}

	public void start() {
		int option;
		do {
			inMenu();
			option = Integer.parseInt(scanner.nextLine());
		} while (excAction(option));
	}

	private void inMenu() {
		System.out.println("Danh sách chức năng:");
		System.out.println("\t1. Nhập thông tin công ty.");
		System.out.println("\t2. In thông tin công ty.");
		System.out.println("\t3. Thêm nhân sự.");
		System.out.println("\t4. Xóa nhân sự.");
		System.out.println("\t5. In danh sách nhân sự.");
		System.out.println("\t6. In tổng lương công ty.");
		System.out.println("\t7. Phân bổ nhân sự.");
		System.out.println("\t0. Thoát.");
		System.out.print("Lựa chọn: ");
	}

	private boolean excAction(int option) {
		boolean isContinue = true;
		switch (option) {
		case 1:
			controller.inputCompanyName(scanner);
			break;
		case 2:
			controller.outputCompanyInfo();
			break;
		case 3:
			addEmployee();
			break;
		case 4:
			controller.delete(scanner);
			break;
		case 5:
			controller.getAll();
			break;
		case 6:
			controller.outputTotal();
			break;
		case 0:
			isContinue = false;
			break;
		default:
			System.out.println("Lua chon khong hop le");
			break;
		}
		return isContinue = true;
	};

	private void addEmployee() {
		System.out.println("Loại nhân viên:");
		System.out.println("1. Nhân viên");
		System.out.println("2. Trưởng phòng");
		System.out.println("3. Giám đốc");
		System.out.println("4. Quay lai");
		System.out.print("Lựa chọn: ");
		Employee employee = null;

		switch (Integer.parseInt(scanner.nextLine())) {
		case 1:
			employee = new Staff();
			break;
		case 2:
			employee = new Manager();
			break;
		case 3:
			employee = new Direction();
			break;
		case 4:
			start();
			break;
		default:
			System.out.println("Loại nhân sự không hợp lệ.");
			return;
		}
		employee.input(scanner);
		
		controller.add(employee);
		addEmployee();

	}
}
