package designpatterns.factory;

/**
 * @author karamanmert
 */
class PdfExporter implements FileExporter {
    @Override
    public String export(String content) {
        return "PDF export: " + content;
    }
}
