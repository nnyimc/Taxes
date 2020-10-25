package presentation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import business.Employee;
import business.TaxesAmount;

public class Application {
	private static final String BUSINESS_PACKAGE = "business.";
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Employee bob = (Employee) Class
					.forName(BUSINESS_PACKAGE+Employee.class.getSimpleName())
					.newInstance();
			System.out.print("What's your social security number?: ");
			String ssn = br.readLine();
			bob.setSocialSecurityNumber(ssn);
			
			System.out.print("How much do you earn monthly before taxes?: ");
			String salary = br.readLine();
			bob.setBeforeTaxesMonthlySalary(Float.parseFloat(salary));
			
			System.out.print("What's your country of residence?: ");
			String selectedCountry = br.readLine();
			bob.setTaxesAmount((TaxesAmount)Class
								.forName(BUSINESS_PACKAGE+selectedCountry+"Taxing")
								.newInstance());
			
			System.out.println("You are left with "+bob.getAfterTaxesSalary()+" after taxes.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
