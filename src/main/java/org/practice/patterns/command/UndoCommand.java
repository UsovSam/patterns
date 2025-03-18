package org.practice.patterns.command;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class UndoCommand extends Command {
    @Override
    public boolean execute() {
        return false;
    }
}
