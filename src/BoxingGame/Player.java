public class Player {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    public Player(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    public int hit(Player foe) {
        System.out.println("------------");
        System.out.println(this.name + " => " + foe.name + " hasar etkisi: " +  this.damage);

        if (foe.dodge()) {
            System.out.println(foe.name + " gelen hasarı engelledi.");
            return foe.health;
        }

        if (foe.health - this.damage < 0)
            return 0;

        return foe.health - this.damage;
    }

    public boolean dodge() {
        double randomValue = Math.random() * 100;
        return randomValue <= this.dodge;
    }
}
