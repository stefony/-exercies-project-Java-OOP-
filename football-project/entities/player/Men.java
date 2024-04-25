package football.entities.player;

public class Men extends BasePlayer{

    private  final static double INITIALS_KILOGRAM = 85.50;
    public Men(String name, String nationality, int strength) {
        super(name, nationality, INITIALS_KILOGRAM, strength);
    }

    @Override
    public void stimulation() {
        int newStrength = getStrength() + 145;
        setStrength(newStrength);
    }
}
