package designpatterns.chainofresponsibility.cor4;

/**
 * @author karamanmert
 * @date 15.10.2024
 */
public abstract class Handler {

    private Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected boolean handleNext(String username, String password) {
        if (nextHandler == null) {
            return true;
        }
        return nextHandler.handle(username, password);
    }

    public abstract boolean handle(String username, String password);
}
