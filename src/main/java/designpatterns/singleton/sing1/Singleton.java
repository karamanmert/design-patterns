package designpatterns.singleton.sing1;

/**
 * @author karamanmert
 */
public class Singleton {

    private static Singleton instance; // tek bir instance'ı saklama için private static değişken.

    private Singleton() { // private const sayesinde dışardan yeni nesne oluşturulamaz.

    }

    public static Singleton getInstance() { // instance'i almak için public static method
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void doSomething() { // konudan bağımsız. instance üretildikten sonra kullanmak için ek method.
        System.out.println("singleton works! ");
    }
}
