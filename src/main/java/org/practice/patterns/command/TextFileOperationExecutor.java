package org.practice.patterns.command;

import java.util.Stack;

public class TextFileOperationExecutor {
    Stack<Command> history = new Stack<>();

    public String executeOperation(Command command) {
        if (command.execute()) {
            history.add(command);
        }
        return "Executed";
    }

    public String undoOperation() {
        if (!history.isEmpty()) {
            Command command = history.pop();
            command.execute();
        }
        return "Undone";
    }

}
