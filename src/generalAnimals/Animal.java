package generalAnimals;

public interface Animal {
	enum type {
		carnivore, omnivore, herbivore, unknown;
	}
	public String move (int x, int y);
}
