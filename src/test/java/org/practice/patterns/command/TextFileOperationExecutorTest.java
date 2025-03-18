package org.practice.patterns.command;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class TextFileOperationExecutorTest {

    @Test
    void testExecuteOperationAddsCommandToHistoryAndReturnsExecuted() {

        Command mockCommand = mock(Command.class);
        when(mockCommand.execute()).thenReturn(true);

        TextFileOperationExecutor executor = new TextFileOperationExecutor();

        String result = executor.executeOperation(mockCommand);

        assertEquals("Executed", result);
        assertEquals(1, executor.history.size());
        assertEquals(mockCommand, executor.history.peek());
        verify(mockCommand).execute();
    }

    @Test
    void testExecuteOperationDoesNotAddCommandToHistoryWhenExecutionFails() {

        Command mockCommand = mock(Command.class);
        when(mockCommand.execute()).thenReturn(false);

        TextFileOperationExecutor executor = new TextFileOperationExecutor();

        String result = executor.executeOperation(mockCommand);

        assertEquals("Executed", result);
        assertEquals(0, executor.history.size());
        verify(mockCommand).execute();
    }
}