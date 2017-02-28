
import static org.junit.Assert.*;

import org.junit.*;

import generalAnimals.FoodCart;
import generalAnimals.FoodCart.foodItemType;

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
	public void canPutAnotherItem() {
		//TODO test adds exactly to the max capacity
		//TODO test if the item is there
		//TODO test if taking it out works
		//TODO test if it is possible to put another item in
		assertTrue(true);
	}

	@Test
	public void canNotPutAnotherItem() {
		// test tries to add item over max capacity, fails
		foodcart.getItems().add(FoodCart.foodItemType.Fish);
		assertTrue(beforeCapacity != foodcart.getCurrentCapacity());

	}

	@Test
	public void notCrashesWhenTakingFoodFromEmptyCart(){
		FoodCart.foodItemType temp;
		for( int i=1; i<5;i++){//TODO
			temp = foodcart.takeItemOut(foodItemType.Fish); //needs to return the taken value, for further use
			assertTrue(temp == foodItemType.Fish || foodItemType.Unknown);//return unknown or empty if nothing can be taken out
		}
		
	}
	
	@Test//(expected = IndexOutOfBoundsException.class)
	public void crashesWhenTakingFoodFromEmptyCart(){
		FoodCart.foodItemType temp;
		for( int i=0; i<6;i++){
			 foodcart.getItems().remove(0);
			  System.out.println("Taking out item - done");
		}
		
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
