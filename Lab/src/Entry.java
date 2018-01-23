import java.util.Date;
import java.util.GregorianCalendar;
public class Entry {
	public static void main(String[] args) {
		Date expiry = new Date();
		expiry.setYear(expiry.getYear() + 1);
		
		System.out.println(Employee.getNumberOfEmployees());
		Contractor contractor = new Contractor("Alvin", 1);
		Employee[] employeeList = new Employee[10];
		//Employee contract = new ContractTechnicalAssociate(Employee.getNumberOfEmployees(), "a", "b", 10.5, "B", new GregorianCalendar(), 15.5);
		Employee contract = contractor.new ContractTechnicalAssociate(Employee.getNumberOfEmployees(), "a", "b", 10.5, "B", new GregorianCalendar(), 15.5);
		contractor.addEmployee((Contractor.ContractEmployee)contract);
		Employee projectMgr = new ProjectManager(Employee.getNumberOfEmployees(), "c", "d", 3000, "C", new GregorianCalendar(), 2);
		Employee technicalAssociate = new PermTechnicalAssociate(Employee.getNumberOfEmployees(), "e", "f", 3000, "D", new GregorianCalendar(), 2, 3);
		employeeList[0] = contract;
		employeeList[1] = projectMgr;
		employeeList[2] = technicalAssociate;
		contract.addCertificate(new Certificate("SCJP", new Date()));
		contract.addCertificate(new Certificate("SCWCD", new Date()));
		try {
			System.out.println(search(0, employeeList));
		} catch (EmployeeNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(contractor);
		
	}
	public static Employee search(int employeeId, Employee[] employeeList)
		throws EmployeeNotFoundException {
		for(int i = 0; i < employeeList.length; i++) {
			if(employeeList[i] != null) {
				if(employeeList[i].getEmployeeId() == employeeId)
					return employeeList[i];
			}
		}
		throw new EmployeeNotFoundException();
	}
}