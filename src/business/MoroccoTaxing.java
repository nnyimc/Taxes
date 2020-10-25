package business;

public class MoroccoTaxing implements TaxesAmount{
	public MoroccoTaxing() {
		super();
	}
	
	@Override
	public float calculateTaxes(float beforeTaxesMonthlySalary) {
		float beforeTaxesAnnualSalary = beforeTaxesMonthlySalary*12f;
		float rate = 0.0f;
		float total = 0.0f;
			if(beforeTaxesAnnualSalary < 40000) {
				rate = 5.0f;
				total = beforeTaxesAnnualSalary*rate/100f;
			} else if (40000 < beforeTaxesAnnualSalary && 120000 > beforeTaxesAnnualSalary) {
				rate = 20f;
				total = beforeTaxesAnnualSalary*rate/100f;
			} else {
				rate = 42f;
				total = beforeTaxesAnnualSalary*rate/100f;
			}
		return total;
	}

}
