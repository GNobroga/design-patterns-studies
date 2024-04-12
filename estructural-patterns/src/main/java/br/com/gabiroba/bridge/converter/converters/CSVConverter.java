package br.com.gabiroba.bridge.converter.converters;

import br.com.gabiroba.bridge.converter.employees.Employee;

public class CSVConverter {

	public String getEmployeeFormated(Employee emp) {
		return String.format("%s;%d;%.2f", 
				emp.getName(),
				emp.getAge(),
				emp.getSalary());
	}

}
