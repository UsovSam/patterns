package org.practice.patterns.adapter;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class ModernPrinterAdapterTest {

    @Test
    public void printDocument() {
        LegacyPrinter legacyPrinter = mock(LegacyPrinter.class);

        ModernPrinter modernPrinterAdapter = new ModernPrinterAdapter(legacyPrinter);
        modernPrinterAdapter.printDocument("This is a test");

        verify(legacyPrinter, times(1)).print("This is a test");

    }
}