import java.util.GregorianCalendar;

public class ProjectManager extends PermanentEmployee {
	public ProjectManager() {

	}

	public ProjectManager(int employeeId, String firstName, String lastName, double salary, String grade,
			GregorianCalendar joinDate, int numberOfYears) {
		super(employeeId, firstName, lastName, salary, grade, joinDate, numberOfYears);
		setNumberOfYears(numberOfYears);
	}
	@Override
	public double getSalary() {
		return 10000 * getNumberOfYears();
	}
	@Override
	public double getCoverage() {
		return this.getSalary();
	}
	@Override
	public String toString() {
		return "Employee ID: " + getEmployeeId() + " Name: " + getFirstName() + 
				" " + getLastName() + " Designation: PM Years of experience: " +
				getNumberOfYears();
	}
}
