
import static org.junit.Assert.*;
import static org.junit.Assume.*;

import org.hamcrest.Matcher;
import org.hamcrest.CoreMatchers.*;

import static org.junit.Assert.assertThat;

import org.junit.*;
import org.junit.runners.MethodSorters;

import generalAnimals.FoodCart;
import generalAnimals.FoodCart.foodItemType;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FoodCartTest {

	FoodCart foodcart;
	int beforeCapacity;

	@Before
	public void setup() {
		foodcart = new FoodCart();
	//	foodcart.setMaxCapacity(20);
		foodcart.getItems().add(FoodCart.foodItemType.Fish);
		foodcart.getItems().add(FoodCart.foodItemType.Fish);
		foodcart.getItems().add(FoodCart.foodItemType.Fish);
		foodcart.getItems().add(FoodCart.foodItemType.Grass);
		foodcart.getItems().add(FoodCart.foodItemType.Grass);
		beforeCapacity = foodcart.getCurrentCapacity();
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void canPutAnotherItemInFoodCart() {
		//TODO test adds exactly to the max capacity
		//TODO test if the item is there
		//TODO test if taking it out works
		//TODO test if it is possible to put another item in
		assertTrue(true);
	}

	@Test
	public void canNotPutAnotherItemInFoodCart() {
		// test tries to add item over max capacity, fails
		foodcart.getItems().add(FoodCart.foodItemType.Fish);
		assertTrue("will show up if failed ",beforeCapacity != foodcart.getCurrentCapacity());

	}

	@Test
	public void shouldNotCrashWhenTakingFoodFromEmptyCart(){
		FoodCart.foodItemType temp;
		for( int i=1; i<5;i++){//TODO
			temp = foodcart.takeItemOut(foodItemType.Fish); //needs to return the taken value, for further use
			assertTrue("not fish or empty object", temp == foodItemType.Fish || foodItemType.Unknown);//return unknown or empty if nothing can be taken out
		}
		
	}
	
	@Test//(expected = IndexOutOfBoundsException.class)
	public void shouldCrashWhenTakingFoodFromEmptyCart(){
		FoodCart.foodItemType temp;
		for( int i=0; i<6;i++){
			 foodcart.getItems().remove(0);
			  System.out.println("Taking out item - done");
		}
		
	}
	//General test examples
	@Test
	public void precisionTest(){
		
		double dvalue1=0.3;
		double dvalue2=0.31;
		
		assertEquals("Numbers not close enough in first check", dvalue1, dvalue2, 1);
		assertEquals("Numbers not close enough in second check", dvalue1, dvalue2, 0.1);	//will fail on delta <= 0.09999 and smaller
		assertEquals("Numbers not close enough in third check, delta =0.01", dvalue1, dvalue2, 0.01);
		//also works as assertNotEquals
	}
	
	//AssertEquals
	@Test
	public void StringExampleTest(){
		String first = "testing";
		String second = "testing";
		String nonPooledSecond = new String("testing");
		String third = "Testing";
		assertEquals("Strings compared with equal", first, second);
		assertSame("not the same object, but pooling!", first, second);
		assertSame("not the same object and not pooling!", first, nonPooledSecond);
		assertEquals("Strings compared with equal, but different cases", first, third);
		
		

	}
	
	
	@Test
	public void nullObjectExampleTest(){
		String obj = "notNull";
		String nullObject = null;
		Object t = null;
		
		assertEquals("One is null", nullObject, obj);
		assertEquals("Both are null", nullObject, t);
		
	}
	
	@Test
	public void arrayEqualityExampleTest(){
		int [] first = {1,2,3};
		int [] same = first;
		int [] second = {1,2,3};
		int [] third = {1,4,3};
		
		assertEquals("One and the same?", first, same);
		assertEquals("Both different objects, with the same data", first, second);// arrays need special comparison
		assertArrayEquals("Both different objects, with the same data", first, second);
		assertArrayEquals("Both different objects, with the same data", first, third);//gives specific fail point
		
	}
	
	@Test(expected=AssertionError.class)
	public void showcaseOfNotEquals(){
		
		Object[] any1 = {new FoodCart(), "some string", new Integer(6)};
		Object[] any2 = {new FoodCart(), "some string", new Integer(6)};
		Object[] any3 = {new FoodCart(), "some string", new Integer(3)};
		
		assertArrayEquals("Both different objects, with the same data", any1, any2);
		// assertArrayNotEquals does not exist!
		assertArrayEquals("Both different objects, with the same data", any1, any3);
				
	}
	
	//AssertThat usage examples
	
//	@Test
//	public void _Anything(){
//		
//		String tested = " Welcome to some matcher logic";
//		String check = "some matcher";
//		//assertThat("Anything passes", tested, anything(check));
//		assertThat(tested, anything(check));
//		
//	}
//	
	
	@Test
	public void assumeExampleTest(){
		
		String st = "some text";
		assumeFalse("This should be false", false);
		assumeTrue("This should be true", false);
		
		assumeNotNull(st);
		
		assertTrue(false);
	}

	
	//Examples of how Annotations are handled in a normal test run
	  // Run once, e.g. Database connection, connection pool
    @BeforeClass
    public static void runOnceBeforeClass() {
        System.out.println("@BeforeClass - runOnceBeforeClass");
    }

    // Run once, e.g close connection, cleanup
    @AfterClass
    public static void runOnceAfterClass() {
        System.out.println("@AfterClass - runOnceAfterClass");
    }

    // Should rename to @BeforeTestMethod
    // e.g. Creating an similar object and share for all @Test
    @Before
    public void runBeforeTestMethod() {
        System.out.println("@Before - runBeforeTestMethod");
    }

    // Should rename to @AfterTestMethod
    @After
    public void runAfterTestMethod() {
        System.out.println("@After - runAfterTestMethod");
    }
	
	
}
