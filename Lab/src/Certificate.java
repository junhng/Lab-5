import java.util.Date;

public class Certificate {
	private String name;
	private Date passingDate;
	public Certificate(String name, Date passingDate) {
		setName(name);
		setPassingDate(passingDate);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getPassingDate() {
		return passingDate;
	}
	public void setPassingDate(Date passingDate) {
		this.passingDate = passingDate;
	}
	@Override
	public String toString() {
		return "Certificate [getName()=" + getName() + ", getPassingDate()=" + getPassingDate() + "]";
	}
}
