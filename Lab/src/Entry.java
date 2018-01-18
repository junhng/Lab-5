import java.util.GregorianCalendar;
public class Entry {
	public static void main(String[] args) {
		System.out.println(Employee.getNumberOfEmployees());
		
		Employee contract = new ContractTechnicalAssociate(Employee.getNumberOfEmployees(), "a", "b", 10.5, "B", new GregorianCalendar(), 15.5, new Contractor("C", 6));
		//Employee projectMgr = new ProjectManager(Employee.getNumberOfEmployees(), "c", "d", 3000, "C", new Date());
		//Employee technicalAssociate = new TechnicalAssociate(Employee.getNumberOfEmployees(), "e", "f", 3000, "D", new Date());
		
		System.out.println(Employee.getNumberOfEmployees());
		System.out.println(ContractEmployee.getNumberOfContract());
		System.out.println(contract);
		//System.out.println(projectMgr);
		//System.out.println(technicalAssociate);
	}
}
