package lesson4;

public class Main4 {
    public static void main(String[] args) {
        PokemonBad pokemonBad = new PokemonBad(100);
        PokemonGood pokemonGood = new PokemonGood(100);

        pokemonGood.applyDamage(15);
        pokemonGood.debuffMaxHp(10);
        System.out.format("У хорошего покемона осталось %f процентов здоровья!\n",
                (float) pokemonGood.getHp() / (float) pokemonGood.getMaxHp() * 100);
        // А вообще, по хорошему этот функционал уже должен быть реализован в классе!

        pokemonBad.applyDamage(15);
        pokemonGood.debuffMaxHp(10);
        pokemonBad.maxHp = 0;
        System.out.format("У плохого покемона осталось %f процентов здоровья!",
                (float) pokemonBad.getHp() / (float) pokemonBad.getMaxHp() * 100);
    }}
