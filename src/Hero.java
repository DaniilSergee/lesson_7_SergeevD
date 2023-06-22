public abstract class Hero implements HavingSuperAbility{
    private int health;
    private int damage;
    private String typeSuperAbility;
    public Hero(int health,int damage,String typeSuperAbility){
        this.health=health;
        this.damage=damage;
        this.typeSuperAbility=typeSuperAbility;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getTypeSuperAbility() {
        return typeSuperAbility;
    }

    @Override
    public String applySuperAbility() {
        return " применил суперспособность " + this.typeSuperAbility;
    }
}
