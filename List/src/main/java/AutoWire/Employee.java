package AutoWire;

public class Employee {
	int salary;
	Address ads;

	public Employee() {
		super();
	}

	public Employee(Address ads) {
		this.ads = ads;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Address getAds() {
		return ads;
	}

	public void setAds(Address ads) {
		this.ads = ads;
	}
	
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", ads=" + ads + "]";
	}
}
