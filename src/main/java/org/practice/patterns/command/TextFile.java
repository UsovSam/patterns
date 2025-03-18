package org.practice.patterns.command;

public class TextFile {

    public void copyTextToClipboard() {
        System.out.println("Text is copied to clipboard");
    }

    public void pasteCommand() {
        System.out.println("Text is pasted from clipboard");
    }
}
