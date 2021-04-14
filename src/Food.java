
import java.lang.Math;

public class Food implements CarbonFootprint{
	
	private int meatFishEggFactor = 1452;
	private double cerealBakeryFactor = 741;
	private int dairyEmissionsFactor = 1911;
	private int fruitVegFactor = 1176;
	private int dineOutFactor = 368;
	private int otherFoodsFactor = 467;
	private double gramPound = .0022;
	private int monthsInYear = 12;
	
	private double spentMeat = 0;
	private double spentFish = 0;
	private double spentEgg = 0;
	private double spentCereal = 0;
	private double spentBakery = 0;
	private double spentDairy = 0;
	private double spentFruit = 0;
	private double spentVeg = 0;
	private double spentDineOut = 0;
	private double spentOther = 0;
	private String header1 = "--------------------------------------";
	private String sym = "$";
	
	public Food() {
	
		
	}
	
	
	public Food(double spentMeat,double spentFish, double spentEgg,  double spentCereal,double spentBakery, double spentDiary, double spentFruit, double spentVeg, double spentDineOut, double spentOther) {
		this.spentMeat = spentMeat;
		this.spentFish = spentFish;
		this.spentEgg = spentEgg;
		this.spentCereal = spentCereal;
		this.spentBakery = spentBakery;
		this.spentDairy = spentDairy;
		this.spentFruit = spentFruit;
		this.spentVeg = spentVeg;
		this.spentDineOut = spentDineOut;
		this.spentOther = spentOther;
	}

	public double getSpentMeat() {
		return spentMeat;
	}


	public void setSpentMeat(double spentMeat) {
		this.spentMeat = spentMeat;
	}


	public double getSpentFish() {
		return spentFish;
	}


	public void setSpentFish(double spentFish) {
		this.spentFish = spentFish;
	}


	public double getSpentEgg() {
		return spentEgg;
	}


	public void setSpentEgg(double spentEgg) {
		this.spentEgg = spentEgg;
	}


	public double getSpentCereal() {
		return spentCereal;
	}


	public void setSpentCereal(double spentCereal) {
		this.spentCereal = spentCereal;
	}


	public double getSpentBakery() {
		return spentBakery;
	}


	public void setSpentBakery(double spentBakery) {
		this.spentBakery = spentBakery;
	}


	public double getSpentDairy() {
		return spentDairy;
	}


	public void setSpentDairy(double spentDairy) {
		this.spentDairy = spentDairy;
	}


	public double getSpentFruit() {
		return spentFruit;
	}


	public void setSpentFruit(double spentFruit) {
		this.spentFruit = spentFruit;
	}


	public double getSpentVeg() {
		return spentVeg;
	}


	public void setSpentVeg(double spentVeg) {
		this.spentVeg = spentVeg;
	}


	public double getSpentDineOut() {
		return spentDineOut;
	}


	public void setSpentDineOut(double spentDineOut) {
		this.spentDineOut = spentDineOut;
	}


	public double getSpentOther() {
		return spentOther;
	}


	public void setSpentOther(double spentOther) {
		this.spentOther = spentOther;
	}

	public double totalMeatFishEgg() {
		double total = Math.round(((((spentMeat+spentFish+spentEgg) * meatFishEggFactor) * gramPound) * monthsInYear));
		System.out.println("Spending $" + (spentMeat+spentFish+spentEgg) + " dollars on Meat, Fish, & Protein per month, produces a total of " + total +" pounds of CO2 per year.");
		return total;
	}
	
	public double totalAllDairy() {
		double total = Math.round((((spentDairy * dairyEmissionsFactor) * gramPound) * monthsInYear));
		System.out.println("Spending $" + spentDairy + " dollars on dairy per month, produces a total of " + total + " pounds of CO2 per year.");
 		return total;
	}
	
	public double totalFruitVeg() {
		double total = Math.round(((((spentFruit + spentVeg) * fruitVegFactor) * gramPound) * monthsInYear));
		System.out.println("Spending $" + Math.round((spentFruit + spentVeg)) + " dollars on Fruits and Vegetables per month, produces a total of " + total + " pounds of CO2 per year.");
		
		return total;
	}
	
	public double totalDiningOut() {
		double total = Math.round((((spentDineOut * dineOutFactor) * gramPound) * monthsInYear));
		System.out.println("Spending $" + spentDineOut + " dollars on Dining Out per month, produces a total of " + total + " pounds of CO2 per year.");
	
		return total;
	}
	
	public double totalOtherFood() {
		double total = Math.round( (((spentOther * otherFoodsFactor) * gramPound)) * monthsInYear );
		System.out.println("Spending $" + spentOther + " dollars on Junk Foods per month, produces a total of " + total + " pounds of CO2 per year.");
		
		return total;
	}
	
	public double totalCerealBakery() {
		double total = Math.round( (((spentCereal + spentBakery) * cerealBakeryFactor) * gramPound) * monthsInYear);
		System.out.println("Spending $" + ( spentCereal + spentBakery) + " dollars on Cereal and Bakery Foods per month, produces a total of " + total + " pounds of CO2 per year.");
		return total;
	}
	

	@Override
	public double getCarbonFootprint() {
		
		double totalMeatEggFish = ((spentMeat+spentFish+spentEgg) * meatFishEggFactor) * gramPound;
		double totalDairy = (spentDairy * dairyEmissionsFactor) * gramPound;
		double totalFruitVeg = ((spentVeg + spentFruit) * fruitVegFactor) * gramPound;
		double totalDineOut = (spentDineOut * dineOutFactor) * gramPound;
		double totalOther = (otherFoodsFactor * spentOther) * gramPound;
		double totalCerealBakery = ((spentCereal + spentBakery) * cerealBakeryFactor) * gramPound;
		double sumFood = ((totalMeatEggFish + totalDairy + totalFruitVeg + totalDineOut + totalOther + totalCerealBakery) * monthsInYear);
	
		return sumFood + totalMeatFishEgg() + totalAllDairy() + totalFruitVeg() + totalDiningOut() + totalOtherFood() + totalCerealBakery() ;
	}
	
	@Override
	public String toString() {
		String out = String.format(
		      "%10s |Dollars Spent| %n"
			+ "Meat: %15s  %n"
			+ "Fish: %15s %n"
			+ "Eggs: %15s %n"
			+ "Cereal: %13s %n"
			+ "Bakery: %13s %n"
			+ "Diary: %14s %n"
			+ "Fruit: %14s %n"
			+ "Veggies: %12s %n"
			+ "Dine Out: %11s %n"
			+ "Other: %14s %n"
			+ " %1s %n"
			+ "Total indirect emissions from food and diet: %.1flbs %n"
			, "" , spentMeat , spentFish , spentEgg , spentCereal , spentBakery , spentDairy , spentFruit , spentVeg , spentDineOut , spentOther , header1, getCarbonFootprint());
		return out;
	}

}
