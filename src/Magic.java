public class Magic extends Hero{
    public Magic(int health,int damage,String typeSuperAbility){
        super(health, damage, typeSuperAbility);
    }
    @Override
    public String applySuperAbility() {
        return "Magic применил суперспособность " + getTypeSuperAbility();
    }
}
