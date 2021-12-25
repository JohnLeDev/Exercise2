package model;

import java.util.Scanner;

public class Company {
	private String name;
	private String idOfCompany;
	private double value;
	
	 public void inputInfoCompany(Scanner scanner) {
		System.out.println("---Nhap thong tin cong ty---");
		System.out.print("Ten: ");
		this.name = scanner.nextLine();
		System.out.print("Ma so thue ");
		this.idOfCompany = scanner.nextLine();
		System.out.println("Doanh thu thang: ");
		this.value = Double.parseDouble(scanner.nextLine());
		
	}
	public void outputInfo() {
		System.out.println("---thông tin công ty---");
		System.out.println(new StringBuilder()
				.append("Tên: ").append(this.name)
				.append("\nMã số thuế: ").append(this.idOfCompany)
				.append("\nDoanh thu tháng: ").append(this.value));
	}
}
