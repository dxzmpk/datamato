package inheritence;

public interface Foo {

    default void fool(){
        System.out.println("Fooling you");
    }
    
}
