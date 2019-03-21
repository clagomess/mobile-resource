package com.github.clagomess.mobileresource;

import org.junit.Test;

import java.io.IOException;

public class MainTest {
    @Test
    public void info(){
        Main.main(new String[]{});
    }

    @Test
    public void run() throws IOException {
        Main.main(new String[]{
            "-option", "ANDROID_ICON",
            "-source", Config.getResource("icon.png"),
        });
    }
}
