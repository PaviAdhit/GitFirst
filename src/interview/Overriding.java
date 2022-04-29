package interview;


class Bank{
	int getRateOfInterest() {return 0;}
	int method() {
		return 1;
	}
}

class SBI extends Bank{
	int getRateOfInteret() {return 8;}
}

class ICICI extends Bank{
	int getRateOfInterest() {return 9;}
}

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      SBI s=new SBI();
      ICICI i=new ICICI();
      System.out.println(s.method());
      System.out.println(i.method());
      System.out.println("SBI interest:"+s.getRateOfInterest());
      System.out.println("ICICI interest:"+i.getRateOfInterest());
	}

}
