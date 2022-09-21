package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("=== TEST 1: seller findById =====");
		Department department = departmentDao.findById(1);
		System.out.println(department);

		System.out.println("\n=== TEST 2: seller Insert =====");
		Department newDepartment = new Department(null, "Food");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());

		System.out.println("\n=== TEST 3: department update =====");
		department = departmentDao.findById(1);
		department.setName("Music");
		departmentDao.update(department);
		System.out.println("Update completed");

		System.out.println("\n=== TEST 4: seller delete =====");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");

		sc.close();
		
		System.out.println("\n=== TEST 5: seller findAll =====");
		List<Department> list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
	}

}
