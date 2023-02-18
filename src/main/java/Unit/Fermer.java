package Unit;

public class Fermer extends Character{
    int feed;
    int cartridges;
    public Fermer(String name, int health, int attack, int protect, int luck) {
        super(name, health, attack, protect, luck);
    }
    public int getFeed(){
        return 0;
    }
    public int getCartridges(){
        return 0;
    }
}
