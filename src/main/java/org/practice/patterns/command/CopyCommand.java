package org.practice.patterns.command;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CopyCommand extends Command {

    private TextFile textFile;

    @Override
    public boolean execute() {
        textFile.copyTextToClipboard();
        return false;
    }
}
