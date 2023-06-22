public class Main {
    public static void main(String[] args) {
        Magic merlin = new Magic(200, 250, "fireball");
        Medic nebolit = new Medic(150, 100, "dislocation reduction", 50);
        Warrior konan = new Warrior(300, 200, "splitting");
        Hero[] dremTeam = {merlin, nebolit, konan};
        System.out.println("healpoint: " + nebolit.getHealPoints());
        for (int i = 0; i < dremTeam.length; i++){
            System.out.println(dremTeam[i].applySuperAbility());
            if (i == 1){
                nebolit.increaseExperience();
            }
        }
        System.out.println("healpoint: " + nebolit.getHealPoints());
    }
}