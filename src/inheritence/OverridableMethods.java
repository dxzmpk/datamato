package inheritence;

public class OverridableMethods implements Foo{

    public int doSomething(){
        return 1;
    }

    private int doAnotherThing(){
        return 2;
    }

    public static int doMoreThings(){
        return 3;
    }

    public final int doThingsForever(){
        return 4;
    }
}
