package designpatterns.singleton.sing3;

/**
 * @author karamanmert
 */
public enum ColorEnum {

    RESET("\u001B[0m"),

    RED("\u001B[31m"),

    GREEN("\u001B[32m"),

    YELLOW("\u001B[33m"),

    BLUE("\u001B[34m");

    private final String color;

    ColorEnum(String string) {
        this.color = string;
    }

    public String getColor() {
        return color;
    }
}
