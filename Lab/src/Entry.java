import java.util.GregorianCalendar;
public class Entry {
	public static void main(String[] args) {
		System.out.println(Employee.getNumberOfEmployees());
		Employee[] employeeList = new Employee[10];
		Employee contract = new ContractTechnicalAssociate(Employee.getNumberOfEmployees(), "a", "b", 10.5, "B", new GregorianCalendar(), 15.5, new Contractor("C", 6));
		Employee projectMgr = new ProjectManager(Employee.getNumberOfEmployees(), "c", "d", 3000, "C", new GregorianCalendar(), 2);
		Employee technicalAssociate = new PermTechnicalAssociate(Employee.getNumberOfEmployees(), "e", "f", 3000, "D", new GregorianCalendar(), 2, 3);
		employeeList[0] = contract;
		employeeList[1] = projectMgr;
		employeeList[2] = technicalAssociate;
  		
		try {
			System.out.println(search(20, employeeList));
		} catch (EmployeeNotFoundException e) {
			e.printStackTrace();
		}
		//System.out.println(projectMgr);
		//System.out.println(technicalAssociate);
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