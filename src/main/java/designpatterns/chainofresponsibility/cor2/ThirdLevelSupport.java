package designpatterns.chainofresponsibility.cor2;

/**
 * @author karamanmert
 */
public class ThirdLevelSupport implements Handler, Eatable {

    private Handler handler;

    @Override
    public void handleRequest(String request) {
        System.out.println("third level support is done!");
        this.eat();
    }

    @Override
    public void setNext(Handler nextHandler) {
        this.handler = nextHandler;
    }

    @Override
    public void eat() {
        System.out.println("third level support eat!");
    }
}
