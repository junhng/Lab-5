import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Contractor {
	private ArrayList<ContractEmployee> employeeList;
	private String name;
	private double rate;
	private int numberOfContract = 0;
	public Contractor(String name, double rate) {
		setName(name);
		setRate(rate);
		employeeList = new ArrayList<ContractEmployee>();
	}
	public ArrayList<ContractEmployee> getEmployeeList() {
		return employeeList;
	}
	public void addEmployee(ContractEmployee ce) {
		employeeList.add(ce);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public int getNumberOfContract() {
		return numberOfContract;
	}
	public void setNumberOfContract(int numberOfContract) {
		this.numberOfContract = numberOfContract;
	}
	@Override
	public String toString() {
		return "Contractor [getEmployeeList()=" + getEmployeeList().toString() + ", getName()=" + getName() + ", getRate()="
				+ getRate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	public abstract class ContractEmployee extends Employee {
		private double numberOfHoursWorked;
		
		public ContractEmployee() {
			setNumberOfContract(getNumberOfContract() + 1);
		}
		
		public ContractEmployee(int employeeId, String firstName, String lastName, double salary, String grade,
				GregorianCalendar joinDate, double numberOfHoursWorked) {
			super(employeeId, firstName, lastName, salary, grade, joinDate);
			setNumOfHoursWorked(numberOfHoursWorked);
			setNumberOfContract(getNumberOfContract() + 1);
		}
		public double getNumberOfHoursWorked() {
			return numberOfHoursWorked;
		}
		public void setNumOfHoursWorked(double numberOfHoursWorked) {
			this.numberOfHoursWorked = numberOfHoursWorked;
		}
		public Contractor getContractor() {
			return Contractor.this;
		}
		
		@Override
		public double getSalary() {
			return Contractor.this.getRate() * getNumberOfHoursWorked();
		}
	}
	public class ContractTechnicalAssociate extends ContractEmployee {
		public ContractTechnicalAssociate() {
			// TODO Auto-generated constructor stub
		}
		public ContractTechnicalAssociate(int employeeId, String firstName, String lastName, double salary, String grade,
				GregorianCalendar joinDate, double numberOfHoursWorked) {
			super(employeeId, firstName, lastName, salary, grade, joinDate, numberOfHoursWorked);
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
					" " + getLastName() + " Designation: TA-C" + " Certifications: " + getListOfCertifications().toString();
		}
	}
}
