import java.util.ArrayList;
public class Pokedex extends AbstractPokemon {
	private static ArrayList<String> myPokemons = new ArrayList<String>();
	
	public void listPokemon() {
		System.out.println(myPokemons);
	}
	
	public Pokemon createPokemon(String name, int health, String type) {
		Pokemon pokemon = super.createPokemon(name, health, type);
		myPokemons.add(pokemon.getName());
		return pokemon;
	}
	
	
}
