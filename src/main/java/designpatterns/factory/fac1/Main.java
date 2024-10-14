package designpatterns.factory.fac1;

/**
 * @author karamanmert
 */
public class Main {
    public static void main(String[] args) {
        String helloWorld = FileExporterFactory.getInstance(FileType.PDF).export("Hello World");
        System.out.println(helloWorld);

        String helloWorld1 = FileExporterFactory.getInstance(FileType.EXCEL).export("Hello World");
        System.out.println(helloWorld1);
    }
}
