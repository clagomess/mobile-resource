package com.github.clagomess.mobileresource;

import java.io.IOException;
import java.net.URL;

public class Config {
    public static String getResource(String path) throws IOException {
        URL url = Thread.currentThread().getContextClassLoader().getResource(path);

        if(url == null){
            throw new IOException("Não encontrado");
        }

        return url.getPath();
    }
}
