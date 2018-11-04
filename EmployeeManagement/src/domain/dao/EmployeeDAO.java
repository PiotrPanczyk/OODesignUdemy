package domain.dao;
import database.DatabaseConnectonManager;
import domain.Employee;

public class EmployeeDAO {
	private DatabaseConnectonManager connectionManager;
	
	public EmployeeDAO(DatabaseConnectonManager connectionManager) {
		this.connectionManager = connectionManager;
	}
	
	public void saveEmployee(Employee emp) {
		System.out.println("Saving employee:\n" + emp.toString() + "\nto database.");
	}
	
	public void deleteEmployee(Employee emp) {
		System.out.println("Deleting employee:\n" + emp.toString() + "\nfrom database");
	}

}
