package lesson3;

public class PokemonExample {
    int hp;
    public String name;
    private int exp;

    public PokemonExample(String n){
        this(100,n,0);
    }

    private PokemonExample(int hp, String name, int exp){
        this.hp = hp;
        this.name = name;
        this.exp = exp;
    }
    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
    public String saySomething(String s){
        return name + " говорит " + s;
    }
}
