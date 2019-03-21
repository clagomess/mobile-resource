package com.github.clagomess.mobileresource;

import java.util.ArrayList;
import java.util.List;

public class ResourceInfo {
    public static List<ResourceDto> listIconAndroid(){
        List<ResourceDto> list = new ArrayList<>();

        list.add(new ResourceDto("android/icon/drawable-hdpi-icon.png", 72, 72));
        list.add(new ResourceDto("android/icon/drawable-ldpi-icon.png", 36, 36));
        list.add(new ResourceDto("android/icon/drawable-mdpi-icon.png", 48, 48));
        list.add(new ResourceDto("android/icon/drawable-playstore-512-icon.png", 512, 512));
        list.add(new ResourceDto("android/icon/drawable-xhdpi-icon.png", 96, 96));
        list.add(new ResourceDto("android/icon/drawable-xxhdpi-icon.png", 144, 144));
        list.add(new ResourceDto("android/icon/drawable-xxxhdpi-icon.png", 192, 192));
        list.add(new ResourceDto("android/icon/mipmap-hdpi/ic_launcher.png", 72, 72));
        list.add(new ResourceDto("android/icon/mipmap-ldpi/ic_launcher.png", 36, 36));
        list.add(new ResourceDto("android/icon/mipmap-mdpi/ic_launcher.png", 48, 48));
        list.add(new ResourceDto("android/icon/mipmap-xhdpi/ic_launcher.png", 96, 96));
        list.add(new ResourceDto("android/icon/mipmap-xxhdpi/ic_launcher.png", 144, 144));
        list.add(new ResourceDto("android/icon/mipmap-xxxhdpi/ic_launcher.png", 192, 192));

        return list;
    }

    public static List<ResourceDto> listSplashAndroidLand(){
        List<ResourceDto> list = new ArrayList<>();

        list.add(new ResourceDto("android/splash/drawable-land-hdpi-screen.png", 640, 640));
        list.add(new ResourceDto("android/splash/drawable-land-ldpi-screen.png", 426, 320));
        list.add(new ResourceDto("android/splash/drawable-land-mdpi-screen.png", 470, 320));
        list.add(new ResourceDto("android/splash/drawable-land-xhdpi-screen.png", 960, 720));
        list.add(new ResourceDto("android/splash/drawable-land-xxhdpi-screen.png", 1600, 960));
        list.add(new ResourceDto("android/splash/drawable-land-xxxhdpi-screen.png", 1920, 1280));

        return list;
    }

    public static List<ResourceDto> listSplashAndroidPort(){
        List<ResourceDto> list = new ArrayList<>();

        list.add(new ResourceDto("android/splash/drawable-port-hdpi-screen.png", 480, 640));
        list.add(new ResourceDto("android/splash/drawable-port-ldpi-screen.png", 320, 426));
        list.add(new ResourceDto("android/splash/drawable-port-mdpi-screen.png", 320, 470));
        list.add(new ResourceDto("android/splash/drawable-port-xhdpi-screen.png", 720, 960));
        list.add(new ResourceDto("android/splash/drawable-port-xxhdpi-screen.png", 960, 1600));
        list.add(new ResourceDto("android/splash/drawable-port-xxxhdpi-screen.png", 1280, 1920));

        return list;
    }

    public static List<ResourceDto> listIconIos(){
        return new ArrayList<>(); //@TODO: implements
    }

    public static List<ResourceDto> listSplashIosLand(){
        return new ArrayList<>(); //@TODO: implements
    }

    public static List<ResourceDto> listSplashIosPort(){
        return new ArrayList<>(); //@TODO: implements
    }
}
