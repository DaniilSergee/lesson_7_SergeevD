public class Medic extends Hero{
    private int healPoints;

    public int getHealPoints() {
        return healPoints;
    }

    public Medic(int health, int damage, String typeSuperAbility, int healPoints){
        super(health, damage, typeSuperAbility);
        this.healPoints = healPoints;
    }
    public void increaseExperience(){
        this.healPoints = ((int)(healPoints + healPoints/10));
    }
    @Override
    public String applySuperAbility() {
        return "Medic применил суперспособность " + getTypeSuperAbility();
    }
}
