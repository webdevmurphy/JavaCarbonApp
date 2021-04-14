
public class Results implements CarbonFootprint {

	private String identity;
	private static final int MAX = 100;
	private CarbonFootprint[] objects;
	private int objCount;
	
	public Results(String identity) {
		this.identity = identity;
		objects = new CarbonFootprint[MAX];
		objCount = 0;
	}
	
	public void addObject(CarbonFootprint p) {
		if((objCount < MAX) && (p != null)) {
			objects[objCount++]= p;
			System.out.println("Added!");
		}
	}
	
	@Override
	public String toString() {
		
		for(int i = 0; i < objCount; i++) {
			System.out.println(objects[i]);
			System.out.println();
		}
		
		
		return "--end array--";
	}

	@Override
	public double getCarbonFootprint() {

		for(int i = 0; i < objCount; i++) {
			System.out.println(objects[i]);
			System.out.println();
		}
		
		return 0;
	}
	
	
}
