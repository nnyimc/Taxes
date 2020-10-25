package business;

public class Employee {
	private String socialSecurityNumber;
	private float beforeTaxesMonthlySalary;
	private TaxesAmount taxesAmount;
	
	public Employee() {
		
	}
	
	public Employee(String ssn, float bTMSalary) {
		this.socialSecurityNumber= ssn;
		this.beforeTaxesMonthlySalary = bTMSalary;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public float getBeforeTaxesMonthlySalary() {
		return beforeTaxesMonthlySalary;
	}

	public void setBeforeTaxesMonthlySalary(float beforeTaxesMonthlySalary) {
		this.beforeTaxesMonthlySalary = beforeTaxesMonthlySalary;
	}

	public void setTaxesAmount(TaxesAmount taxesAmount) {
		this.taxesAmount = taxesAmount;
	}
	
	public float getAfterTaxesSalary() {
		return beforeTaxesMonthlySalary - 
				taxesAmount.calculateTaxes(beforeTaxesMonthlySalary)/12;
	}
	
	
}
