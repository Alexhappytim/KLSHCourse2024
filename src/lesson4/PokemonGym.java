package lesson4;

public class PokemonGym {
    private static PokemonGym gym;
    static {
        gym = new PokemonGym();
    }
    private String[] restingPokemonsNames;
    private PokemonGym(){
        restingPokemonsNames = new String[3];
    }
    public static PokemonGym getInstance(){
        return gym;
    }
}
