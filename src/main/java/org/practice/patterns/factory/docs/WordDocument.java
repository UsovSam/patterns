package org.practice.patterns.factory.docs;

import org.practice.patterns.factory.DocsType;

public class WordDocument implements Document {
    @Override
    public DocsType getType() {
        return DocsType.WORD;
    }

    @Override
    public String getContent() {
        return "Word Content";
    }
}
