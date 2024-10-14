package designpatterns.chainofresponsibility.cor1;

/**
 * @author karamanmert
 */
public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);

    void dispense(Currency cur);
}