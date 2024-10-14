package designpatterns.factory.fac1;

import java.util.Map;

/**
 * @author karamanmert
 */
public class FileExporterFactory {

    private static final Map<FileType, FileExporter> exporters = getExporters();

    private static Map<FileType, FileExporter> getExporters() {
        return Map.of(FileType.PDF, new PdfExporter(), FileType.EXCEL, new ExcelExporter());
    }

    public static FileExporter getInstance(FileType fileType) {
        if (fileType == null) {
            throw new IllegalArgumentException("FileType must be not null");
        }
        FileExporter exporter = exporters.get(fileType);
        if (exporter == null) {
            throw new IllegalArgumentException("No exporter found for type: " + fileType);
        }
        return exporter;
    }
}
