public class Main {



    public static void main(String[] args) {

        Boss boss = new Boss();


        boss.setDamage(123456789);
        boss.setHealth(987654321);
        boss.setMech(new Weapon("mech", "облик"));


        Skeleton skeleton1 = new Skeleton();

        skeleton1.setArrows(69);
        skeleton1.setDamage(889);
        skeleton1.setHealth(67);
        skeleton1.setMech(new Weapon("luk", " kira"));


        Skeleton skeleton2 = new Skeleton();

        skeleton2.setArrows(67);
        skeleton2.setHealth(897);
        skeleton2.setDamage(453);
        skeleton2.setMech(new Weapon("luk", "матильда"));

        System.out.println(boss.printInfo());
        System.out.println(skeleton2.printInfo());
        System.out.println(skeleton1.printInfo());


    }
}