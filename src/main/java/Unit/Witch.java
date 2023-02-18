package Unit;

public class Witch extends Character{
    int mana;

    public Witch(String name, int health, int attack, int protect, int luck) {
        super(name, health, attack, protect, luck);
    }
    public int getMana(){
        return 0;
    }
}
