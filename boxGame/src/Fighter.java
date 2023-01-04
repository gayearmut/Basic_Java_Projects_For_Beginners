public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;


    Fighter(String name,int damage, int health, int weight, int dodge){
        this.name =  name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    public int hit(Fighter foe) {
        System.out.println(this.name + " => " + foe.name + " " + this.damage + "  struck damage");

        if (foe.dodge()) {
            System.out.println(foe.name + " blocked the hit!");
            return foe.health;
        }
        if (foe.health - this.damage < 0) {
            return 0;
        }
        return foe.health- this.damage;
    }

    public boolean dodge(){
        double randomValue = Math.random()*100;
        return randomValue<= this.dodge;
    }
}
