package org.practice.patterns.command;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class PasteCommand extends Command {

    @Override
    public boolean execute() {
        textFile.pasteCommand();
        return true;
    }

}
