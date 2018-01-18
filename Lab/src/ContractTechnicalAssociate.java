import java.util.GregorianCalendar;

public class ContractTechnicalAssociate extends ContractEmployee {

	public ContractTechnicalAssociate() {
		// TODO Auto-generated constructor stub
	}

	public ContractTechnicalAssociate(int employeeId, String firstName, String lastName, double salary, String grade,
			GregorianCalendar joinDate, double numberOfHoursWorked, Contractor contractor) {
		super(employeeId, firstName, lastName, salary, grade, joinDate, numberOfHoursWorked, contractor);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getSalary() {
		return (getNumberOfHoursWorked() <= 40 ? 
				getContractor().getRate() * getNumberOfHoursWorked() : 
				40 * getContractor().getRate() + (getNumberOfHoursWorked() - 40) * getContractor().getRate() * 2);
	}

	@Override
	public String toString() {
		return "Contractor: " + getContractor().getName() + " Name: " + getFirstName() + 
				" " + getLastName() + "Designation: TA-C";
	}
	
}
