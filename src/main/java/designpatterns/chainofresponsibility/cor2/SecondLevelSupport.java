package designpatterns.chainofresponsibility.cor2;

/**
 * @author karamanmert
 */
public class SecondLevelSupport implements Handler {

    private Handler handler;

    @Override
    public void handleRequest(String request) {
        System.out.println("second level support is done!");
    }

    @Override
    public void setNext(Handler nextHandler) {
        this.handler = nextHandler;
    }
}
