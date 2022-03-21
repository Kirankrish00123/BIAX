package Pages;

import FunctionalPages.HomePageFunctional;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class HomePage{
	
	HomePageFunctional homeFunPAge;
	
	@Step
	public void LaunchBiax() {
		
		homeFunPAge.open();
		homeFunPAge.Close_the_Cookies();
		homeFunPAge.Accept_the_Disclaimer();
		
	}
	
	@Step
	public void Get_The_Car_Name() {
		
		homeFunPAge.getCarName();
		
		
	}
	
	@Step
	public void Get_The_ModelYear() {
		
		homeFunPAge.getModelYear();
	}

}
