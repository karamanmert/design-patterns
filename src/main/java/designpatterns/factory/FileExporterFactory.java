package designpatterns.factory;

import java.util.Map;

/**
 * @author karamanmert
 */
public class FileExporterFactory {

    private static final Map<FileType, FileExporter> exporters = Map.of(FileType.PDF,
                                                                        new PdfExporter(),
                                                                        FileType.EXCEL,
                                                                        new ExcelExporter());

    public static FileExporter getInstance(FileType fileType) {
        FileExporter exporter = exporters.get(fileType);
        if (exporter == null) {
            throw new IllegalArgumentException("No exporter found for type: " + fileType);
        }
        return exporter;
    }
}
