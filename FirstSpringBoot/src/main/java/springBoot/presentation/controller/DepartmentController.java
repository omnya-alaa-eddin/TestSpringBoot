/**
 * 
 */
package springBoot.presentation.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springBoot.presentation.dto.Department;

/**
 * @author o.alaa
 *
 */
@RestController
public class DepartmentController {
	static List<Department> depts = Arrays.asList(new Department(1, "Dept2","address1"),
			new Department(2, "Dept2","address2"),new Department(3, "Dept3","address3"));
		
	
	
	@RequestMapping(value="/getAllDept")
	public List<Department> getAllDept(){
		
		return depts;
	}
	
	@RequestMapping(value="/getDept")
	public List<Department> getDept(int id){
		Predicate<Department> t;
		return depts.stream().filter(t -> t.getId().equals(id)).findAny();
	}
	
	
}
