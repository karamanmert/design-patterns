package designpatterns.chainofresponsibility.cor2;

/**
 * @author karamanmert
 */
public interface Handler {

    void handleRequest(String request);

    void setNext(Handler nextHandler);
}
