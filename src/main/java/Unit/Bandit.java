package Unit;

public class Bandit extends Character{
    int theft;
    int disguise;

    public Bandit(String name, int health, int attack, int protect, int luck) {
        super(name, health, attack, protect, luck);
    }
    public int getTheft(){
        return  0;
    }
}
