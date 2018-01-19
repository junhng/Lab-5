import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Employee {
	private int employeeId;
	private String firstName;
	private String lastName;
	private double salary;
	private String grade;
	private GregorianCalendar joinDate;
	private static int numberOfEmployees = 0; {
		numberOfEmployees++;
	}
	
	public Employee() {
	}
	
	public Employee(int employeeId, String firstName, String lastName, double salary, String grade, GregorianCalendar joinDate) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.grade = grade;
		this.joinDate = joinDate;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getJoinDate() {
		return new SimpleDateFormat("dd-MM-yyyy").format(joinDate.getTime());
	}
	public void setJoinDate(GregorianCalendar joinDate) {
		this.joinDate = joinDate;	
	}
	
	public void setJoinDay(int day) {
		joinDate.set(Calendar.DAY_OF_MONTH, day);
	}
	public void setJoinMonth(int month) {
		joinDate.set(Calendar.MONTH, month);
	}
	public void setJoinYear(int year) {
		joinDate.set(Calendar.YEAR, year);
	}
	public static int getNumberOfEmployees() {
		return numberOfEmployees;
	}
	
	public abstract double getCoverage();
}
