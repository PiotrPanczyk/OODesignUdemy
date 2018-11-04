package clients;
import database.DatabaseConnectonManager;
import domain.Employee;
import domain.dao.EmployeeDAO;
import reporting.EmployeeReportFormatter;
import reporting.FormatType;

public class ClientModule {
	public static void main(String []args) {
		DatabaseConnectonManager connectionManager = new DatabaseConnectonManager();
		Employee emp = new Employee(1, "Jon", "sales", true);
		ClientModule client = new ClientModule(new EmployeeDAO(connectionManager));
		
		client.printEmployeeReport(emp, FormatType.XML);
		client.hireNewEmployee(emp);
		client.terminateEmployee(emp);
		
	}
	
	private EmployeeDAO dao;
	
	public ClientModule(EmployeeDAO dao) {
		this.dao = dao;
	}
	public void hireNewEmployee(Employee emp) {
		dao.saveEmployee(emp);
	}
	
	public void terminateEmployee(Employee emp) {
		dao.deleteEmployee(emp);
		
	}
	
	public void printEmployeeReport(Employee emp, FormatType formatType) {
		EmployeeReportFormatter empReportFormatter = 
				new EmployeeReportFormatter(emp, formatType);
		System.out.println(empReportFormatter.getFormattedEmployee());
		
	}

}
