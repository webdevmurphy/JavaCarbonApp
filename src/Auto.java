import java.text.DecimalFormat;

public class Auto implements CarbonFootprint{
	
private int milesDrivenPerWeek = 100;
private int weeksInYear = 52;
private double fuelEfficiency = 32;
private double co2 = 19.4;
private double otherGases = 1.0526315789;
private String make = " Genric Car ";
private int year = 1952;

/*  Math test to check formula accuracy.
 *  answer: 3318
 *  100 miles driven  32 miles per gallon
 */
	
	public Auto() {
	
	}
	
	public Auto(String make, int year) {
		this.make = make;
		this.year = year;
		
	}
	
	public Auto(String make, int year, int milesDrivenPerWeek, int fuelEfficiency) {
		this.make = make;
		this.year = year;
		this.milesDrivenPerWeek = milesDrivenPerWeek;
		this.fuelEfficiency = fuelEfficiency;
		this.weeksInYear = weeksInYear;
		
	}
	
	public int getMilesDrivenPerWeek() {
		return milesDrivenPerWeek;
	}

	public void setMilesDrivenPerWeek(int milesDrivenPerWeek) {
		this.milesDrivenPerWeek = milesDrivenPerWeek;
	}

	public double getFuelEfficiency() {
		return fuelEfficiency;
	}

	public void setFuelEfficiency(double fuelEfficiency) {
		this.fuelEfficiency = fuelEfficiency;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double carbonFootprint(int milesDrivenPerWeek, double fuelEfficiency) {
		double a = ((milesDrivenPerWeek * weeksInYear) / fuelEfficiency) * co2;
		double result = a * otherGases;
		
		
		
		return result;
	}
	
	
	
	
	
	@Override
	public double getCarbonFootprint() {
		double a = ((milesDrivenPerWeek * weeksInYear) / fuelEfficiency) * co2;
		double result = a * otherGases;
		
		int solution = (int)result;
		
		return solution;
	}
	
	
	
	
	public String toString() {
		DecimalFormat lbs = new DecimalFormat("####");
		return "Driving a " + year + " " + make + " " + milesDrivenPerWeek + " miles per week creates " + lbs.format(getCarbonFootprint()) 
		+ " lbs of carbon per year.";
	}

	
	
}
