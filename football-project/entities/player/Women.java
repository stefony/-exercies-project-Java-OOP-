package football.entities.player;

public class Women extends BasePlayer {

    private  final static double INITIALS_KILOGRAM = 60.00;

    public Women(String name, String nationality,int strength) {
        super(name, nationality, INITIALS_KILOGRAM, strength);
    }

    @Override
    public void stimulation() {
        int newStrength = getStrength() + 115;
        setStrength(newStrength);
    }
}
