package week2HomeWork1;

public class ComputerOutput {
	
	public static void main(String[] args) {
		Computer cO = new Computer();
		
		cO.setCompName("Macbook Pro");
		cO.setCompYear(2020);
		cO.setCompCost(2001.95);
		
		System.out.println("=====OUTPUT=====");
		System.out.println("Computer name: " + cO.getCompName());
		System.out.println("Computer Year: " + cO.getCompYear());
		System.out.println("Computer Cost: " + cO.getCompCost());
	
	}
	

}
