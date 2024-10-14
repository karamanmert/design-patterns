package designpatterns.factory.fac1;

/**
 * @author karamanmert
 */
class PdfExporter implements FileExporter {
    @Override
    public String export(String content) {
        return "PDF export: " + content;
    }
}
