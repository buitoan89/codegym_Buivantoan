package advenced_object_oriented_design.animal;

public class Tiger extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "Tiger : roarrr";
    }
    @Override
    public String howToEat(){
        return "could be fried";
    }

}
