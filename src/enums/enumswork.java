package enums;

public enum enumswork {
	
	ASIF(21, 7),
	RIMZY(23, 14),
	STRETCH(22, 16),
	FIDDY(24, 4),
	SHAK(23, 12);
	
	
	private final double age;
	private final double tenure;
	
	enumswork(double age, double tenure){
		this.age=age;
		this.tenure=tenure;
	}

	public double getTenure() {
		return tenure;
	}
	

}
