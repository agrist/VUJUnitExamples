package generalAnimals;
import java.util.ArrayList;

public class FoodCart {

	int maxCapacity, currentCapacity;
	ArrayList items;

	public enum foodItemType {
		Grass(2), Seaweed(2), Honey(3), Meat(5), Eggs(3), Hay(4), Berries(2), Plankton(1), Fish(5), Seeds(2);

		private int value;

		private foodItemType(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}
	}

	
	
	
	
	
	public int getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public int getCurrentCapacity() {
		return currentCapacity;
	}

	public void setCurrentCapacity(int currentCapacity) {
		this.currentCapacity = currentCapacity;
	}

	public ArrayList getItems() {
		return items;
	}

	public void setItems(ArrayList items) {
		this.items = items;
	}

	public void takeItemOut(foodItemType item) {
		
	};

	public void putItemIn(foodItemType item) {
		
	}

	public FoodCart() {
		super();
		items = new ArrayList<>();
		setCurrentCapacity(0);
		setMaxCapacity(20);
		
	};

}
