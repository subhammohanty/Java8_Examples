package stream;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorted {
	
	public static void main(String[] args) {
		
		List<Employee> employees = EmployeeDB.getEmployees();
		
//		Collections.sort(employees , new Comparator<Employee>() {
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				return (int) (o1.getSalary()-o2.getSalary());
//			}
//		});
//		System.out.println(employees);
		
		
		
		Collections.sort(employees , ( o1,  o2) ->  (int) (o1.getSalary()-o2.getSalary()));
		System.out.println(employees);
		
		//Using Stream
			
//		employees.stream()
//		.sorted(( o1,  o2) ->  (int) (o1.getSalary()-o2.getSalary()))
//		.forEach(System.out::println);
		
		employees.stream()
		.sorted(Comparator.comparing(emp->emp.getSalary()))
		.forEach(System.out::println);
		
		employees.stream()
		.sorted(Comparator.comparing(Employee::getSalary))
		.forEach(System.out::println);
		
	}

}
