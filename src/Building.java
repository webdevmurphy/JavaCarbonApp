import java.util.Scanner;

public class Building implements CarbonFootprint{
	
	
	private double kiloWatt = .25; //per hour
	private int monthsInYear = 12;
	private double avgMonthlyBill = 0;
	private double pricePerGallon = 0;
	private double pricePerThousandCubeFt = 0;

	
	
	
	public Building() {
		
	}
	
	public Building(double avgMonthlyBill) {
		this.avgMonthlyBill = avgMonthlyBill;
	}
	
	
	/*
	 * CO2 emissions in pounds = 
	 * (average amount of electric bill per month ÷ price per kwh) 
	 * × electricity emissions factor × months in a year
	 * 
	 * Electricity Emissions Factor 1.37
	 */
	
	public double electricity() {
		double elecEmissFactor = 1.37;
		double totalElec = ((avgMonthlyBill / kiloWatt) * elecEmissFactor) * monthsInYear;
		
		return totalElec;
	}
	
	
	 /* CO2 emissions in pounds = 
	 * (average amount of natural gas bill per month ÷ price per thousand cubic feet) 
	 * × natural gas emissions factor × months in a year
	 * 
	 * Electricity emissions factor 120.61
	 */
	public double naturalGas() {
		double gasEmissFactor = 120.61;
		double totalNatGas = ((avgMonthlyBill / pricePerThousandCubeFt ) * gasEmissFactor) * monthsInYear;
		
		return totalNatGas;
	}
	
	/*
	 * CO2 emissions in pounds = 
	 * (average amount of fuel oil bill per month ÷ price per gallon) 
	 * × fuel oil emissions factor × months in a year
	 * 
	 * Fuel oil Emissions Factor 22.37
	 */
	
	public double fuelOil() {
		double fuelOilEmissFactor = 22.37;
		double totalFuelOil = ((avgMonthlyBill / pricePerGallon) * fuelOilEmissFactor) * monthsInYear;
		
		return totalFuelOil;
	}
	
	/*
	 * CO2 emissions in pounds = 
	 * (average amount of propane bill per month ÷ price per gallon) 
	 * × propane emissions factor × months in a year
	 * 
	 * Propane Emissions Factor 12.17
	 */
	public double propane() {
		double propaneEmissFactor = 12.17;
		double totalPropane = ((avgMonthlyBill / pricePerGallon) * propaneEmissFactor) * monthsInYear;
		
		return totalPropane;
	}
	
	
	public double getKiloWatt() {
		return kiloWatt;
	}

	public void setKiloWatt(double kiloWatt) {
		this.kiloWatt = kiloWatt;
	}

	public double getAvgMonthlyBill() {
		return avgMonthlyBill;
	}

	public void setAvgMonthlyBill(double avgMonthlyBill) {
		this.avgMonthlyBill = avgMonthlyBill;
	}

	public double getPricePerGallon() {
		return pricePerGallon;
	}

	public void setPricePerGallon(double pricePerGallon) {
		this.pricePerGallon = pricePerGallon;
	}

	public double getPricePerThousandCubeFt() {
		return pricePerThousandCubeFt;
	}

	public void setPricePerThousandCubeFt(double pricePerThousandCubeFt) {
		this.pricePerThousandCubeFt = pricePerThousandCubeFt;
	}

	@Override
	public double getCarbonFootprint() {
		
		return electricity();
	}
	
	@Override
	public String toString() {
		return "Your average monthly electric bill is: " + avgMonthlyBill + " and your electrical consumption produces " + getCarbonFootprint() + "  .lbs of CO2 per year.";
	}

}
