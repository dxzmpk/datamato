package inheritence;

import java.util.Objects;

public class ConstructorOverridable {
    public static void main(String... args){
        log("BUILD AN ANIMAL :");
        Animal animal = new Animal();
        log(" ");
        log("BUILD A FISH :");
        Animal fish = new Fish();
    }

    // PRIVATE

    private static void log(Object object){
        System.out.println(Objects.toString(object));
    }

    private static class Animal{
        Animal(){
            log("Animal ctor");
            //call an overridable method from ctor - dangerous
            perform();
        }
        void perform(){
            log("Animal perform.");
        }
    }

    private static class Fish extends Animal {
        Fish() {
            //every constructor has an implicit call to super(); for first line
            super();
            log("Fish ctor. This is the earliest Tail Shape can be initialized.");
        }

        void perform() {
            //in general, this method can depend on Fish data
            log("Fish perform. Can fail since Tail Shape is : " + tailShape);
        }

        private String tailShape;
    }

}
