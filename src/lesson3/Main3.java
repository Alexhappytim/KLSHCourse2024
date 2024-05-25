package lesson3;

public class Main3 {
    public static void main(String[] args) {
        PokemonExample pokemon = new PokemonExample("Eeve");
        pokemon.setExp(10);
        System.out.println( pokemon.getExp());
        System.out.println(pokemon.saySomething("привет мир!"));
    }
}
