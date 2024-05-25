package lesson4;

public class PokemonGood {
    private int hp;
    private int maxHp;

    public PokemonGood(int max){
        setMaxHp(max);
        hp = getMaxHp();
    }

    private void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getHp() {
        return hp;
    }

    public void applyDamage(int damage){
        if(getHp()-damage<0){
            hp = 0;
        }else{
            hp-=damage;
        }
    }
    public void debuffMaxHp(int debuff){
        if(getMaxHp()-debuff<1){
            setMaxHp(1);
        }else{
            setMaxHp(getMaxHp()-debuff);
        }
    }

}
