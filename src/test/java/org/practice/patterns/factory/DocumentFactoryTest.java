package org.practice.patterns.factory;

import org.junit.jupiter.api.Test;
import org.practice.patterns.factory.docs.Document;

import static org.junit.jupiter.api.Assertions.*;

class DocumentFactoryTest {

    @Test
    public void testCreateDocument_pdf() {
        Document document = DocumentFactory.createDocument(DocsType.PDF);
        assertNotNull(document);
        assertEquals(DocsType.PDF, document.getType());
    }


    @Test
    public void testCreateDocument_xls() {
        Document document = DocumentFactory.createDocument(DocsType.EXCEL);
        assertNotNull(document);
        assertEquals(DocsType.EXCEL, document.getType());
    }


    @Test
    public void testCreateDocument_word() {
        Document document = DocumentFactory.createDocument(DocsType.WORD);
        assertNotNull(document);
        assertEquals(DocsType.WORD, document.getType());
    }


    @Test
    public void testCreateDocument_text() {
        Document document = DocumentFactory.createDocument(DocsType.TEXT);
        assertNotNull(document);
        assertEquals(DocsType.TEXT, document.getType());
    }


    @Test
    public void testCreateDocument_ukno() {
        Document document = DocumentFactory.createDocument(DocsType.UNKNOWN);
        assertNull(document);
    }

}