package model;

public class Staff extends Employee{
	private Manager manager;
	
	@Override
	public void output() {
		super.output();
		System.out.println(new StringBuilder().append("Staff "));
	}
}
