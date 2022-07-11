package stream;

import java.util.Arrays;
import java.util.List;

public class EmployeeDB {
	
	public static  List<Employee>  getEmployees() {
		List<Employee> employees = Arrays.asList(
				new Employee(1, "Subham", "CSE", 1000000),
				new Employee(2, "Nihal", "CIVIL", 1200000),
				new Employee(1, "Pritish", "MECH", 1400000),
				new Employee(1, "Shyam", "ETC", 1600000)
				);
		return employees;
	}

}
