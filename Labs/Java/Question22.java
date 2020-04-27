
public class Question22
{
	public static void main(String args[])
	{
		//Name number model cost roadtax
		Truck ob1 = new Truck("Safari","WB01 3B 4012","Tata",350000,5);
		Bike ob2 = new Bike("CBR","TN02 4B 3005","Honda",50000,2);
		Car ob3 = new Car("Model S","OB04 5N 2345","Tesla",450000,2.5);
		Bus ob4 = new Bus("Double Decker","PY02 3B 0742","Volkswagen",750000,5);
		ob1.display();
		ob2.display();
		ob3.display();
		ob4.display();
	}
}
