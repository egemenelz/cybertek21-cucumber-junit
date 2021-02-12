package com.cybertek.utilities;

public class BrowserUtils {

    public static void Sleep(int howLong) {
        try {
            Thread.sleep(howLong * 1000);
        } catch (InterruptedException e) {
        }
    }
}
