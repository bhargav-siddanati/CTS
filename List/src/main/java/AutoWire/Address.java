package AutoWire;

public class Address {
	private String name;
	private String address;

	public Address(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Address [name=" + name + ", address=" + address + "]";
	}

}
