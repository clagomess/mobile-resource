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
        List<ResourceDto> list = new ArrayList<>();

        list.add(new ResourceDto("ios/icon/icon.png", 57, 57));
        list.add(new ResourceDto("ios/icon/icon@2x.png", 114, 114));
        list.add(new ResourceDto("ios/icon/icon-40.png", 40, 40));
        list.add(new ResourceDto("ios/icon/icon-40@2x.png", 80, 80));
        list.add(new ResourceDto("ios/icon/icon-40@3x.png", 120, 120));
        list.add(new ResourceDto("ios/icon/icon-50.png", 50, 50));
        list.add(new ResourceDto("ios/icon/icon-50@2x.png", 100, 100));
        list.add(new ResourceDto("ios/icon/icon-60.png", 60, 60));
        list.add(new ResourceDto("ios/icon/icon-60@2x.png", 120, 120));
        list.add(new ResourceDto("ios/icon/icon-60@3x.png", 180, 180));
        list.add(new ResourceDto("ios/icon/icon-72.png", 72, 72));
        list.add(new ResourceDto("ios/icon/icon-72@2x.png", 144, 144));
        list.add(new ResourceDto("ios/icon/icon-76.png", 76, 76));
        list.add(new ResourceDto("ios/icon/icon-76@2x.png", 152, 152));
        list.add(new ResourceDto("ios/icon/icon-83.5@2x.png", 167, 167));
        list.add(new ResourceDto("ios/icon/icon-1024.png", 1024, 1024));
        list.add(new ResourceDto("ios/icon/icon-small.png", 29, 29));
        list.add(new ResourceDto("ios/icon/icon-small@2x.png", 58, 58));
        list.add(new ResourceDto("ios/icon/icon-small@3x.png", 87, 87));

        return list;
    }

    public static List<ResourceDto> listSplashIosLand(){
        List<ResourceDto> list = new ArrayList<>();

        list.add(new ResourceDto("ios/splash/Default-Landscape@~ipadpro.png", 2732, 2048));
        list.add(new ResourceDto("ios/splash/Default-Landscape@2x~ipad.png", 2048, 1536));
        list.add(new ResourceDto("ios/splash/Default-Landscape~ipad.png", 1024, 768));
        list.add(new ResourceDto("ios/splash/Default-Landscape-736h.png", 2208, 1242));

        return list;
    }

    public static List<ResourceDto> listSplashIosPort(){
        List<ResourceDto> list = new ArrayList<>();

        list.add(new ResourceDto("ios/splash/Default@2x~iphone.png", 640, 960));
        list.add(new ResourceDto("ios/splash/Default@2x~universal~anyany.png", 2732, 2732));
        list.add(new ResourceDto("ios/splash/Default~iphone.png", 320, 480));
        list.add(new ResourceDto("ios/splash/Default-568h@2x~iphone.png", 640, 1136));
        list.add(new ResourceDto("ios/splash/Default-667h.png", 750, 1334));
        list.add(new ResourceDto("ios/splash/Default-736h.png", 1242, 2208));
        list.add(new ResourceDto("ios/splash/Default-Portrait@~ipadpro.png", 2048, 2732));
        list.add(new ResourceDto("ios/splash/Default-Portrait@2x~ipad.png", 1536, 2048));
        list.add(new ResourceDto("ios/splash/Default-Portrait~ipad.png", 768, 1024));

        return list;
    }
}
