package com.demo.inter.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {
	int salary;
	Department dep;
	
	public static void main(String[] args) {
		Department d = new Department();
		d.name = "dep1";
		
		List<Employee> list = new ArrayList();
		Employee e = new Employee();
		e.salary = 11000;
		e.dep = d;
		
		Employee e1 = new Employee();
		e1.salary = 9000;
		e1.dep = d;
		
		list.add(e1);
		list.add(e);
		//list.stream().filter(e -> e.salary > 10000).collect(Collectors.groupingBy(e1->dep,Collectors.toSet()));
		Map<Department,List<Employee>> map = list.stream().filter(e2->e2.getSalary()>10000).
				collect(Collectors.groupingBy(Employee::getDep));
		System.out.println(map);
		
		List<Integer> listInt = new  ArrayList<Integer>();
		listInt.add(1);
		listInt.add(1);
		listInt.add(2);
		listInt.add(2);
		listInt.add(3);
		listInt.add(3);
		
		/**
		 * reduce
		 * 
		 */
		Integer sum  = listInt.stream().reduce((el1,el2) -> el1+el2).get();
		System.out.println(sum);
		
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", dep=" + dep + "]";
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Department getDep() {
		return dep;
	}

	public void setDep(Department dep) {
		this.dep = dep;
	}
}
