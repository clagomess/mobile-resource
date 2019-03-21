package com.github.clagomess.mobileresource;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class Core {
    @Setter
    private String imageSource;

    void mkdir(String filename) {
        filename = filename.replaceFirst("\\/([\\w\\.\\-_@~]+?)\\.png", "");
        File file = new File(filename);

        if (!file.isDirectory()) {
            file.mkdirs();
        }
    }

    public void build(ResourceDto dto) throws IOException {
        mkdir(dto.getFilename());

        Thumbnails.of(imageSource)
                .size(dto.getWidth(), dto.getHeight())
                .crop(Positions.CENTER)
                .keepAspectRatio(true)
                .outputFormat("png")
                .toFile(dto.getFilename());
    }

    public void build(ResourceEnum type) throws IOException {
        List<ResourceDto> list = new ArrayList<>();

        switch (type){
            case ANDROID_ICON:
                list.addAll(ResourceInfo.listIconAndroid());
                break;
            case ANDROID_SPLASH_LAND:
                list.addAll(ResourceInfo.listSplashAndroidLand());
                break;
            case ANDROID_SPLASH_PORT:
                list.addAll(ResourceInfo.listSplashAndroidPort());
                break;
            case IOS_ICON:
                list.addAll(ResourceInfo.listIconIos());
                break;
            case IOS_SPLASH_LAND:
                list.addAll(ResourceInfo.listSplashIosLand());
                break;
            case IOS_SPLASH_PORT:
                list.addAll(ResourceInfo.listSplashIosPort());
                break;
        }

        // build
        for (ResourceDto dto : list){
            log.info("Building: {}", dto);
            build(dto);
        }
    }
}
