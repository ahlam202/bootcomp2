package testCases;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.CheckOutpPage;
import pageObjects.ChooseFlight;
import pageObjects.HomePage;
import pageObjects.PassengerInformation;
import utilities.Base;

public class TC_bookingFlight_01 extends Base {
public static WebDriver driver;

@Test
public void bookingFlight() throws InterruptedException {
	HomePage hp= new HomePage(Base.driver);
	hp.flight();
	hp.leavingFrom();
	hp.departur();
	hp.placeD();
	hp.goingTo();
	hp.arrival();
	hp.placeA();
	hp.calandre();
	Thread.sleep(6000);
	hp.departDate();
	hp.arrivDate();
	hp.donButton();
	hp.searchbutton();
	ChooseFlight cf=new ChooseFlight(Base.driver);
	cf.departingFlight();
	cf.selectButt();
	Thread.sleep(6000);
	cf.returningFlight();
	cf.selectButt2();
	CheckOutpPage co=new CheckOutpPage(Base.driver);
	co.checkOutButt();
	PassengerInformation pi=new PassengerInformation(Base.driver);
	pi.firstName();
	pi.lastName();
	pi.phoneNumb();
	pi.genderFem();
	pi.monthOfBirth();
	pi.dayOfBirth();
	pi.yearOfBirth();
	pi.insurBox();
	pi.creditCard();
	pi.monthCardExp();
	pi.yearCardExp();
	pi.SecurityCode();
	pi.BillingAddress();
	pi.cityAdd();
	pi.stateAdd();
	pi.zipCode();
	pi.emailAdd();
	pi.completeBookingButt();
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
}
