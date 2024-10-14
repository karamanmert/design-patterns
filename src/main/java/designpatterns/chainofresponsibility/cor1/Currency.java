package designpatterns.chainofresponsibility.cor1;

/**
 * @author karamanmert
 */
public class Currency {

    private int amount;

    public Currency(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
