package designpatterns.factory;

/**
 * @author karamanmert
 */
class ExcelExporter implements FileExporter {
    @Override
    public String export(String content) {
        return "Excel export: " + content;
    }
}
