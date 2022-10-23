package io.openmessaging.storage.dledger.command;

import org.junit.jupiter.api.Test;

public class AppendCommandTest {
    @Test
    public void onceAppendTest() {
        AppendCommand command = new AppendCommand();
        command.setGroup("g0");
        command.setPeers("n0-localhost:10000");
        command.doCommand();
    }
}
