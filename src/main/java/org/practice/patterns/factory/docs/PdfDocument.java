package org.practice.patterns.factory.docs;

import org.practice.patterns.factory.DocsType;

public class PdfDocument implements Document {
    @Override
    public DocsType getType() {
        return DocsType.PDF;
    }

    @Override
    public String getContent() {
        return "PDF Content";
    }
}
