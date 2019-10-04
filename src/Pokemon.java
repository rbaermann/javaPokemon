
public class Pokemon {
	private String name;
	private int health;
	private String type;
	private static int count;
	
	public Pokemon() {
	}
	
	public Pokemon(String name, int health, String type) {
		setName(name);
		setHealth(health);
		setType(type);
		count++;
	}
	
	public void attackPokemon(Pokemon pokemon) {
		pokemon.health -= 10;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public int getCount() {
		return count;
	}
}
