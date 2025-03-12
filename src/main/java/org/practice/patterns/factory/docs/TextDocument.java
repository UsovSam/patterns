package org.practice.patterns.factory.docs;

import org.practice.patterns.factory.DocsType;

// implement interface Document
public class TextDocument implements Document {
    @Override
    public DocsType getType() {
        return DocsType.TEXT;
    }

    @Override
    public String getContent() {
        return "Text Content";
    }
}
