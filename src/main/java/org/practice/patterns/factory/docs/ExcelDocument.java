package org.practice.patterns.factory.docs;

import org.practice.patterns.factory.DocsType;

public class ExcelDocument implements Document {
    @Override
    public DocsType getType() {
        return DocsType.EXCEL;
    }

    @Override
    public String getContent() {
        return "Excel Content";
    }
}
