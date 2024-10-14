package designpatterns.factory.fac4;

/**
 * @author karamanmert
 * @date 14.10.2024
 */
public abstract class Animal {

    public String name;


    protected abstract String getType();

    abstract void voice();

    public void sleep() {
        System.out.println("Zzz");
    }
}