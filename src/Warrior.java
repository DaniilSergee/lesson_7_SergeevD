public class Warrior extends Hero{
    public Warrior(int health,int damage,String typeSuperAbility){
        super(health, damage, typeSuperAbility);
    }
    @Override
    public String applySuperAbility() {
        return "Warrior применил суперспособность " + getTypeSuperAbility();
    }
}
