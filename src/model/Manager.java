package model;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee{
	private List<Staff> listOfStaff;
	public Manager() {
		listOfStaff = new ArrayList<>();
	}
	
	public boolean add(Staff staff) {
		if( staff == null)
			return false;
		
		if(staff.getId() == null || staff.getId().equals(""))
			return false;
		
		return listOfStaff.add(staff);
	}
	public boolean removeAll() {
		return listOfStaff.removeAll(listOfStaff);
	}
	public void output() {
		super.output();
		System.out.println(new StringBuilder().append("Manager "));
	}
}
