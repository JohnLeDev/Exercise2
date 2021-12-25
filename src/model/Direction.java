package model;

import java.util.Scanner;

public class Direction extends Employee {
	private float soCoPhan;

	/* constructors */

	/* getters and setters */

	/* methods */
	@Override
	public void input(Scanner scanner) {
		super.input(scanner);
		System.out.print("Số cổ phần: ");
		this.soCoPhan = Float.parseFloat(scanner.nextLine());
	}

	@Override
	public void output() {
		super.output();
		System.out.println(new StringBuilder().append("Cổ phần: ").append(this.soCoPhan));
	}
}
