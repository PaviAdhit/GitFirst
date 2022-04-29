package interview;


public class Emp {
	int id;
	String name;
	Address address;
	
	public Emp(int id, String name, Address address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}

	void display() {
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address1=new Address("abc","TN","India");
		Address address2=new Address("def","TN","India");
		
		Emp e=new Emp(111,"Pavi", address1);
		Emp e1=new Emp(112,"Mani", address2);
		
		e.display();
		e1.display();
		
	}

}
