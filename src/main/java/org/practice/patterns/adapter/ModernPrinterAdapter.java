package org.practice.patterns.adapter;

public class ModernPrinterAdapter implements ModernPrinter {

    LegacyPrinter legacyPrinter;

    public ModernPrinterAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    @Override
    public void printDocument(String document) {
        this.legacyPrinter.print(document);
    }
}
