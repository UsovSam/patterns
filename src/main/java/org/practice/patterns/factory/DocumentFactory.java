package org.practice.patterns.factory;

import org.practice.patterns.factory.docs.*;

public class DocumentFactory {

    public static Document createDocument(DocsType type) {
        return switch (type) {
            case DocsType.PDF -> new PdfDocument();
            case DocsType.EXCEL -> new ExcelDocument();
            case DocsType.TEXT -> new TextDocument();
            case DocsType.WORD -> new WordDocument();
            default -> null;
        };
    }

}
