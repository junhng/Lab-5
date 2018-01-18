import java.util.GregorianCalendar;

public abstract class ContractEmployee extends Employee {
	private double numberOfHoursWorked;
	private Contractor contractor;
	private static int numberOfContract = 0; {
		numberOfContract++;
	}
	
	public ContractEmployee() {
	}
	
	public ContractEmployee(int employeeId, String firstName, String lastName, double salary, String grade,
			GregorianCalendar joinDate, double numberOfHoursWorked, Contractor contractor) {
		super(employeeId, firstName, lastName, salary, grade, joinDate);
		setNumOfHoursWorked(numberOfHoursWorked);
		setContractor(contractor);
	}


	public double getNumberOfHoursWorked() {
		return numberOfHoursWorked;
	}
	public void setNumOfHoursWorked(double numberOfHoursWorked) {
		this.numberOfHoursWorked = numberOfHoursWorked;
	}
	public Contractor getContractor() {
		return contractor;
	}
	public void setContractor(Contractor contractor) {
		this.contractor = contractor;
	}
	
	@Override
	public double getSalary() {
		return contractor.getRate() * getNumberOfHoursWorked();
	}
	@Override
	public double getCoverage() {
		return 0;
	}
	public static int getNumberOfContract() {
		return numberOfContract;
	}

}
