
public class PokemonTest {

	public static void main(String[] args) {
		Pokedex pokedex = new Pokedex();
		Pokemon geodude = pokedex.createPokemon("Geodude", 250, "Rock");
		Pokemon teddiursa = pokedex.createPokemon("Teddiursa", 175, "Normal");
		
		teddiursa.attackPokemon(geodude);
		System.out.println(geodude.getHealth());
		pokedex.listPokemon();
	}

}
