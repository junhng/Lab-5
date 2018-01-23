import java.util.GregorianCalendar;

public class ProjectManager extends PermanentEmployee {
	public ProjectManager() {
		setMediclaim(new Mediclaim(1));
	}

	public ProjectManager(int employeeId, String firstName, String lastName, double salary, String grade,
			GregorianCalendar joinDate, int numberOfYears) {
		super(employeeId, firstName, lastName, salary, grade, joinDate, numberOfYears);
		setNumberOfYears(numberOfYears);
		setMediclaim(new Mediclaim(1));
	}
	@Override
	public double getSalary() {
		return 10000 * getNumberOfYears();
	}
	public double getCoverage() {
		return getMediclaim().getCoverage(getSalary());
	}
	@Override
	public String toString() {
		return "Employee ID: " + getEmployeeId() + " Name: " + getFirstName() + 
				" " + getLastName() + " Designation: PM Years of experience: " +
				getNumberOfYears() + " Certifications: " + getListOfCertifications().toString();
	}
}
