package org.practice.patterns.command;

public abstract class Command {

    protected TextFile textFile;

    public abstract boolean execute();
}
