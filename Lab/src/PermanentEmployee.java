import java.util.GregorianCalendar;

public abstract class PermanentEmployee extends Employee {
	private int numberOfYears;
	private Mediclaim mediclaim;
	private static int numberOfPerm = 0; {
		numberOfPerm++;
	}
	
	public PermanentEmployee() {
	}
	
	public PermanentEmployee(int employeeId, String firstName, String lastName, double salary, String grade,
			GregorianCalendar joinDate, int numberOfYears) {
		super(employeeId, firstName, lastName, salary, grade, joinDate);
		setNumberOfYears(numberOfYears);
	}
	
	public int getNumberOfYears() {
		return numberOfYears;
	}

	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}
	public static int getNumOfPerm() {
		return numberOfPerm;
	}
	
	@Override
	public double getSalary() {
		return getSalary();
	}

	protected Mediclaim getMediclaim() {
		return mediclaim;
	}

	protected void setMediclaim(Mediclaim mediclaim) {
		this.mediclaim = mediclaim;
	}
}
