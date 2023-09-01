package designpatterns.chainofresponsibility;

/**
 * @author karamanmert
 */
public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);

    void dispense(Currency cur);
}