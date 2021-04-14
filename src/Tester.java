import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class Tester {
	
	public static void main (String args[]) {
	
	Auto myCar = new Auto();
	Auto myCar2 = new Auto("Buick", 1980, 180, 12);
	Auto myCar3 = new Auto("Honda Accord", 2001, 180, 24);
	
	System.out.println(myCar);
	System.out.println(myCar2);
	System.out.println(myCar3);
	
	Food myFood = new Food();
	
	System.out.println();

		myFood.setSpentMeat(1.00);
		
		myFood.setSpentFish(2.50);
	
		myFood.setSpentEgg(1.00);
		
		myFood.setSpentCereal(2.50);
		
		myFood.setSpentBakery(1.00);
		
		myFood.setSpentDairy(2.33);
		
		myFood.setSpentFruit(3.50);
		
		myFood.setSpentVeg(1.50);
		
		myFood.setSpentDineOut(5.00);
	
		myFood.setSpentOther(12.00);
		
		System.out.println(myFood);
	
	System.out.println();
	
	Building myBuilding = new Building(25.32);
	
	System.out.println(myBuilding);

	
	System.out.println();
	System.out.println();
	System.out.println("::::::::::::::::::::::::::::::End Test:::::::::::::::::::::::::::::::::::::::");
	System.out.println(":::::::::::::::::::::::All Output Below is From proj5_data.csv:::::::::::::::::::::::::::::::::");
	System.out.println();
	System.out.println();
	
	String name = "stuff";

	Results myObjects = new Results(name);
	int counter = 0;
	int counter2 = 1;
	try {
		Scanner fInput =
				  new Scanner(new FileInputStream("src/proj5_data.csv"));
		while (fInput.hasNextLine()) {
			
			String s = fInput.nextLine();
			String[] line = s.split(",");
		if(line[0].equalsIgnoreCase("car")) {
			int milesDriven = Integer.parseInt(line[1]);
			int fuelEff = Integer.parseInt(line[2]);
			int year = Integer.parseInt(line[3]);
			String make = line[4];
			
			Auto myCar4 = new Auto();
		    String type = line[0];
			myCar4.setMilesDrivenPerWeek(milesDriven);
			myCar4.setFuelEfficiency(fuelEff);
			myCar4.setYear(year);
			myCar4.setMake(make);
			
			System.out.println(myCar4);
			
		
			myObjects.addObject(myCar4);
			
			
		}
		
		if(line[0].equalsIgnoreCase("food")) {
		    
			String type = line[0];
			String meat = line[1];
			String fish = line[2];
			String egg = line[3];
			String cereal = line[4];
			String bakery = line[5];
			String dairy = line[6];
			String fruit = line[7];
			String veg = line[8];
			String dineOut = line[9];
			String other = line[10];
			counter++;
			Food myFood4 = new Food();
			System.out.println("Household #" + counter);
			myFood4.setSpentMeat(Double.parseDouble(line[1]));
			myFood4.setSpentFish(Double.parseDouble(line[2]));
			myFood4.setSpentEgg(Double.parseDouble(line[3]));
			myFood4.setSpentCereal(Double.parseDouble(line[4]));
			myFood4.setSpentBakery(Double.parseDouble(line[5]));
			myFood4.setSpentDairy(Double.parseDouble(line[6]));
			myFood4.setSpentFruit(Double.parseDouble(line[7]));
			myFood4.setSpentVeg(Double.parseDouble(line[8]));
			myFood4.setSpentDineOut(Double.parseDouble(line[9]));
			myFood4.setSpentOther(Double.parseDouble(line[10]));
			
			System.out.println(myFood4);
			System.out.println();
			
			myObjects.addObject(myFood4);
			
		}
			
		if(line[0].equalsIgnoreCase("building")) {
			
			System.out.println(":::::Building " + counter2++ + " Electricity::::::");
				String bill = line[1];
				
				Building house1 = new Building();
				house1.setAvgMonthlyBill(Double.parseDouble(bill));
				System.out.println(house1);
				
				myObjects.addObject(house1);
			
			}
		
			System.out.println();
			
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	System.out.println("+++++++++++++++++++++Call to Object Array of carbon+++++++++++++++++++++++");
	myObjects.getCarbonFootprint();

	
	}
	
	

}
