package org.practice.patterns.composite;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class File implements Item {
    @Override
    public int getSize() {
        return 10;
    }

    @Override
    public boolean isDirectory() {
        return false;
    }
}
