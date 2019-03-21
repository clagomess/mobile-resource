package com.github.clagomess.mobileresource;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class CoreTest {
    @Test
    public void build() throws IOException {
        File dir = new File("out");
        if(!dir.isDirectory()){
            Assert.assertTrue(dir.mkdir());
        }

        String source = Config.getResource("icon.png");
        String outfile = "out/teste.png";

        Core core = new Core();
        core.setImageSource(source);

        core.build(new ResourceDto(outfile, 100, 100));

        Assert.assertTrue((new File(outfile)).isFile());
    }

    @Test
    public void buildEnum() throws IOException {
        String source = Config.getResource("icon.png");
        Core core = new Core();
        core.setImageSource(source);
        core.build(ResourceEnum.ANDROID_ICON);
    }

    @Test
    public void mkdir(){
        Core core = new Core();

        core.mkdir("out/android/icon/teste.png");
    }
}
