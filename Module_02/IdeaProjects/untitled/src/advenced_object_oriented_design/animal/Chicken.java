package advenced_object_oriented_design.animal;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck";
    }
    @Override
    public String howToEat(){
        return "could can ";
    }
}
