package org.practice.patterns.factory.docs;

import org.practice.patterns.factory.DocsType;

public interface Document {

    public DocsType getType();

    public String getContent();


}
