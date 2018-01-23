import java.util.GregorianCalendar;

public class PermTechnicalAssociate extends PermanentEmployee {
	private int numberOfCertifications;
	public PermTechnicalAssociate() {
		setMediclaim(new Mediclaim(2));
	}

	public PermTechnicalAssociate(int employeeId, String firstName, String lastName, double salary, String grade,
			GregorianCalendar joinDate, int numberOfYears, int numerOfCertifications) {
		super(employeeId, firstName, lastName, salary, grade, joinDate, numberOfYears);
		setNumberOfCertifications(numberOfCertifications);
		setMediclaim(new Mediclaim(2));
	}
	
	public int getNumberOfCertifications() {
		return numberOfCertifications;
	}
	public void setNumberOfCertifications(int numberOfCertifications) {
		this.numberOfCertifications = numberOfCertifications;
	}

	@Override
	public double getSalary() {
		return 5000 * getNumberOfYears() + 1000 * getNumberOfCertifications();
	}
	
	public double getCoverage() {
		return getMediclaim().getCoverage(getSalary());
	}
	@Override
	public String toString() {
		return "Employee ID: " + getEmployeeId() + " Name: " + getFirstName() + 
				" " + getLastName() + " Designation: TA-P Years of experience: " +
				getNumberOfYears() + " Certifications: " + getListOfCertifications().toString();
	}
}
