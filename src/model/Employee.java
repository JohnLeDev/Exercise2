package model;

import java.util.Scanner;

public class Employee {
	private String id;
	private String name;
	private String phone;
	private float workDay;
	private double salary;
	private String idManager;

	public void output() {
		String info = new StringBuilder().append("---Thông tin nhân sự---").append("\nMã số: ").append(this.id)
				.append("\nHọ tên: ").append(this.name).append("\nSố điện thoại: ").append(this.phone)
				.append("\nSố ngày làm: ").append(this.workDay).append("\nLương một ngày: ").append(this.salary)
				.append("\n Trum quan ly: ").append(this.idManager).toString();
		System.out.println(info);
	}

	public void input(Scanner scanner) {
		System.out.println("---Nhập thông tin---");
		System.out.print("Mã số: ");
		this.id = scanner.nextLine();
		System.out.print("Họ tên: ");
		this.name = scanner.nextLine();
		System.out.print("Số điện thoại: ");
		this.phone = scanner.nextLine();
		System.out.print("Số ngày làm: ");
		this.workDay = Float.parseFloat(scanner.nextLine());
		System.out.print("Lương một ngày: ");
		this.salary = Float.parseFloat(scanner.nextLine());
		System.out.print("Thuoc dia ban nao: ");
		this.idManager = scanner.nextLine();
	};

	public String getId() {
		return this.id;
	}

	public String getIdManager() {
		if (this.idManager == null) {
			return "";
		}
		return this.idManager;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public float getWorkDay() {
		return workDay;
	}

	public void setWorkDay(float workDay) {
		this.workDay = workDay;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIdManager(String idManager) {
		this.idManager = idManager;
	}

}
