package generalAnimals;

public class GeneralAnimal implements Animal {
	private String name, scientificDesignation;
	private boolean fury;
	private int age, legcount, height, length, mass;
	
	
	@Override
	public String move(int x, int y) {
		// TODO Auto-generated method stub
		return null;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getScientificDesignation() {
		return scientificDesignation;
	}


	public void setScientificDesignation(String scientificDesignation) {
		this.scientificDesignation = scientificDesignation;
	}


	public boolean isFury() {
		return fury;
	}


	public void setFury(boolean fury) {
		this.fury = fury;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getLegcount() {
		return legcount;
	}


	public void setLegcount(int legcount) {
		this.legcount = legcount;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public int getMass() {
		return mass;
	}


	public void setMass(int mass) {
		this.mass = mass;
	}

}
