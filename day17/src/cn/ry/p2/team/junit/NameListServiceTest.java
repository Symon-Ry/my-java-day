package cn.ry.p2.team.junit;

import cn.ry.p2.team.domain.Employee;
import cn.ry.p2.team.service.NameListService;
import cn.ry.p2.team.service.TeamException;

public class NameListServiceTest {
	
	

	public void testGetAllEmployees(){
		NameListService listService = new NameListService();
		
		Employee[] employees = listService.getAllEmployees();
		
		for(int i = 0;i < employees.length;i++){
			System.out.println(employees[i]);
		}
	}
	

	public void testGetEmployee(){
		int id = 2;
		NameListService listService = new NameListService();
		try {
			Employee emp = listService.getEmployee(id);
			System.out.println(emp);
		} catch (TeamException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
