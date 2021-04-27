package Fruit;

public class Fruit {
	String name;

	public Fruit(String name) {
		this.name = name;
		System.out.println(this.name);
	}
}

class Apple extends Fruit {
	String colour;
	public Apple(String name, String colour) {
		super(name);
		this.colour = colour;
	}
}
class redApple extends Apple{
	double weight, price;
	public redApple(String name, String colour, double weight, double price) {
		super(name, colour);
		this.weight = weight;
		this.price = price;
	}
	public double totalPrice() {
		double totalPrice = this.weight * this.price;
		System.out.println("The total price is " + totalPrice );
		return totalPrice;
	}
}
class greenApple extends Apple{
	double price;
	int quantity;
	public greenApple(String name, String colour, int quantity, double price) {
		super(name, colour);
		this.quantity = quantity;
		this.price = price;
	}
	public double totalPrice() {
		double totalPrice = this.quantity * this.price;
		System.out.println("The total price is " + totalPrice );
		return totalPrice;
	}
}
class Orange extends Fruit{
	double price;
	double weight;
	public Orange(String name, double weight, double price) {
		super(name);
		this.weight = weight;
		this.price = price;
	}
	public void typesOfOrange(){
		String [] typeOfOrange = {"Navel", "Mandarin", "Blood Oranges", "Valencia"};
		System.out.println("Types of Orange;");
		System.out.println(typeOfOrange.length);
	}
}
class Strawberry extends Fruit{
	double price;
	int quantity;
	public Strawberry(String name, int quantity, double price) {
		super(name);
		this.quantity = quantity;
		this.price = price;
	}
	public void typesOfStrawberry(){
		String [] typeOfStrawberry = {"Albion", "Allstar", "Alpine", "Aroma"};
		for (int i = 0; i < typeOfStrawberry.length; i++)
		{
				System.out.println(typeOfStrawberry[i]);
	}
}		
}


class Main {
	public static void main(String[] args) {		
		Apple a = new Apple("Red Apple", "Red");
		System.out.println("Name: " + a.name);
		System.out.println("Colour: " + a.colour);
		
		redApple c = new redApple("Honeycrisp", "Red", 0.02, 5.30);
		System.out.println("Name: " + c.name);
		System.out.println("Colour: " + c.colour);
		System.out.println("Weight: " + c.weight + " each");
		System.out.println("Price: RM" + c.price + "/kg");
		System.out.println("The total price is RM" + c.totalPrice());
		
		greenApple d = new greenApple("Crispin", "Green", 10, 0.85);
		System.out.println("Name: " + d.name);
		System.out.println("Colour: " + d.colour);
		System.out.println("the price is RM" + d.quantity + " each");
		System.out.println("Price: RM" + d.price +" each");
		
		Orange e = new Orange("Orange", 0.03, 6.50);
		System.out.println("Name: " + e.name);
		System.out.println("Weight: " + e.weight + "kg");
		System.out.println("Price: RM" +e.price +"per kg");
		
		Strawberry f = new Strawberry("Strawberry", 20, 10.50);
		System.out.println("Name: " + f.name);
		System.out.println("Quantity: " + f.quantity + "kg");
		System.out.println("Price : RM" +f.price + " each");
	}
}