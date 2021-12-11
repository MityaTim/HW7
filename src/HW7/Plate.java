package HW7;

public class Plate {
    private int food;

    public Plate (int food){
        this.food = food;
    }

    public boolean decreaseFoodBy (int appetite){
        if ((food - appetite) > 0) {
            food -= appetite;
            return true;
        }
        else {
            return false;
        }
    }

    public void addFood (int value){
        food += value;
        System.out.println("");
        System.out.println("Adding some food, new amount equals: " + food);
        System.out.println("");
    }

    public void foodInfo(){
        System.out.println("");
        System.out.println("Amount of food: " + food);
        System.out.println("");
    }
}

