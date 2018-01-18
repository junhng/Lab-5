import java.util.ArrayList;
public class Contractor {
	private ArrayList<ContractEmployee> employeeList;
	private String name;
	private double rate;
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
	@Override
	public String toString() {
		return "Contractor [getEmployeeList()=" + getEmployeeList() + ", getName()=" + getName() + ", getRate()="
				+ getRate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
