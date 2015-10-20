package tn.edu.esprit.sigma.fusion.youbayclient.crud;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import tn.edu.esprit.sigma.fusion.youbay.entities.Buyer;
import tn.edu.esprit.sigma.fusion.youbayclient.delegate.BuyerServicesDelegate;
import tn.edu.esprit.sigma.fusion.youbayclient.delegate.InitDatabaseServicesDelegate;

/*
 * ============>Documentation<==================
 *@Test			:The java class will be executed for every @Test i:independent
 * Only methods with the annotation @Test are going to be tested=executed with the 
 * FIRST principal (fast/independent/repeatable/self-checking/timely 
 *@Before		:Test Initialization with setup function and @Before annotation
 * 				this methods will be executed before every test
 *@After			:After every test
 *@BeforeClass	:To be executed one time before all the other of tests 
 *@AfterClass	:To be executed one time after all the other of tests
 *We can use "assertEquals(result, expected);" to know if a test is successful or not 
 */
public class Simple {

	/*
	 * to be executed for every test independently
	 */

	@BeforeClass
	public static void setupBeforeClass() {
		System.out.println("==============================================");
		System.out.println("i'm setupBeforeClass -->BeforeClass");
		System.out.println("executed one time before all the other of tests");
		System.out.println("==============================================");
	}

	@AfterClass
	public static void tearDownAfterClass() {

		System.out.println("==============================================");
		System.out.println("tearDownAfterClass-->@AfterClass");
		System.out.println("executed one time After all the other of tests");
		System.out.println("==============================================");
	}

	@Before
	public void setup() {

		System.out.println("==============================================");
		System.out.println("============> i'm setup ---> @Before");
		System.out.println("============> executed before every test");
		System.out.println("==============================================");
	}

	@After
	public void tearDown() {
		System.out.println("==============================================");
		System.out.println("============>i'm tearDown ---> @After");
		System.out.println("============> executed After every test");
		System.out.println("==============================================");

	}

	@Test
	public void test1() {

		InitDatabaseServicesDelegate.doTruncateAllTables();
		System.out.println("test1");
	}

	@Test
	public void test2() {
		Buyer theBuyer = new Buyer();
		theBuyer.setFirstName("houssem");
		BuyerServicesDelegate.doAddBuyer(theBuyer);
	}

	@Test
	public void test3() {
		System.out.println("test3");
	}

}