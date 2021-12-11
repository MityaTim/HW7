package HW7;

public class Cat {
    private final String name;
    private final int appetite;
    private boolean feelingOfSatiety;

    public Cat(String name, int appetite){
        this.appetite = appetite;
        this.name = name;
        this.feelingOfSatiety = false;
    }

    public void catInfo(){
        System.out.println("-------------");
        System.out.println("Cat's " + name + " properties:");
        System.out.println("         Cat's appetite: " + appetite);
        if (!feelingOfSatiety){
            System.out.println("     Feeling of Satiety: No (Hungry)!");
        }
        else {
            System.out.println("     Feeling of Satiety: Yes!");
        }
    }

    public void eat(Plate p){
        if (!feelingOfSatiety) { // eat only hungry cat
            feelingOfSatiety = p.decreaseFoodBy(appetite);
        }
    }

}
