package wooso_baboo;

public class Car implements Valuable{
	private String name;
	private double price;
	
	public Car(String name,double price){
		this.name=name;
		this.price=price;
		price=price*0.8;
	}
	@Override
	public double EstimateValue(int month){
		int time=month;
		price=price*0.8;
		for(int i=0;i<time;i++){
			price=price*0.99;
		}
		return price;
	}
	public String toString(){
		return String.format("car name: "+ name +"\n initial price" + price);
	}
}
