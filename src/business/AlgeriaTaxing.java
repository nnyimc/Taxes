package business;

public class AlgeriaTaxing implements TaxesAmount {
	public AlgeriaTaxing() {
		
	}

	@Override
	public float calculateTaxes(float beforeTaxesMonthlySalary) {
		return beforeTaxesMonthlySalary*12*(35.0f/100);
	}
	
}
