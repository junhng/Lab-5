
public class Mediclaim {
	private double rate;
	public Mediclaim(double rate) {
		setRate(rate);
	}
	public double getCoverage(double salary) {
		return getRate() * salary;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
}
