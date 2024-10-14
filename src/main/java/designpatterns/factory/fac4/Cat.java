package designpatterns.factory.fac4;

/**
 * @author karamanmert
 * @date 14.10.2024
 */
public class Cat extends Animal {

    @Override
    public void sleep() {
        name = "mert";
        super.sleep();
    }

    @Override
    protected String getType() {
        return "cat";
    }

    @Override
    void voice() {
        System.out.println("hello");
    }
}
