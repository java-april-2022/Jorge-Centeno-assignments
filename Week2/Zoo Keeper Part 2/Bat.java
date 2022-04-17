public class Bat extends Mammal{
    double energyLevel;

    public Bat() {
        super(300);
    }
    
    public void fly() {
        System.out.println("You are clear for take off");
        this.energyLevel -= 50;
    }

    public void eatHumans(){
        System.out.println("It's looking for some tasty humans to eat");
        this.energyLevel += 25;
    }

    public void attackTown(){
        System.out.println("Warning, this Town is under attack and is on fire!");
        this.energyLevel -= 100;
    }
}