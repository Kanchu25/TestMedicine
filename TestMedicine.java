package assign;

class Medicine
{
	double price;
	String expiry_date;
    public Medicine(double price, String expiry_date) {
		super();
		this.price = price;
		this.expiry_date = expiry_date;
	}
    void displayLabel() {
    }
 }

class Tablet extends Medicine
{

	public Tablet(double price, String expiry_date) {
		super(price, expiry_date);
	}

	@Override
	void displayLabel() {
		System.out.println("Store in cool and dry place");
	}
}

class Syrup extends Medicine
{

	public Syrup(double price, String expiry_date) {
		super(price, expiry_date);
	}

	@Override
	void displayLabel() {
		System.out.println("consult your doctor");
	}
}

class Ointment extends Medicine
{

	public Ointment(double price, String expiry_date) {
		super(price, expiry_date);
	}

	@Override
	void displayLabel() {
		System.out.println("For external use only");
	}
}


public class TestMedicine {

	public static void main(String[] args) {

       double i = Math.random()*3;
       int j = (int) i;
       System.out.println(j);
       
       switch(j)
       {
       case 1:
    	   Medicine m= new Tablet(56.4, " 08-04-2021");
    	   m.displayLabel();
    	   break;
    	   
       case 2:
    	   Medicine m1= new Syrup(64.4, " 09-05-2021");
    	   m1.displayLabel();
    	   break;
    	
       case 3:
    	   Medicine m2= new Ointment(98.4, " 10-04-2022");
    	   m2.displayLabel();
    	   break;
	}
	}
}

