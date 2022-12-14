public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Ring(Fighter f1, Fighter f2, int minWeight,int maxWeight){
        this.f1= f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run(){
        if(checkWeight()){
            while (f1.health>0 && f2.health>0){
                System.out.println("======= NEW ROUND =======");

                if(isFirst()){
                    System.out.println("Starting first fighter");
                    f2.health= f1.hit(f2);

                    if(isWin())
                        break;
                }else{
                    System.out.println("Starting second fighter");
                    f1.health = f2.hit(f1);

                    if (isWin())
                        break;
                }
                printScore();
            }
        }else{
            System.out.println("Fighters' sclets do not match");
        }
    }

    public boolean checkWeight(){
        return (f1.weight>=minWeight && f1.weight<=maxWeight)&&(f2.weight>=minWeight && f2.weight<=maxWeight);
    }

    public boolean isFirst(){
        double randomNumber = Math.random()*100;
        return (randomNumber >=50);
    }

    public boolean isWin(){
        if(f1.health==0){
            System.out.println(f2.name+ " win the game!");
            return true;
        }else if(f2.health==0){
            System.out.println(f1.name + " win the game!");
            return true;
        }
        return false;
    }

    public void printScore(){
        System.out.println("---------");
        System.out.println(f1.name + " health condition: "+f1.health);
        System.out.println(f2.name + " health condition: "+f2.health);
    }
}
