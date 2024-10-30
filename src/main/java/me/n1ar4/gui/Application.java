package me.n1ar4.gui;

import com.formdev.flatlaf.FlatLightLaf;

@SuppressWarnings("all")
public class Application {
    public static void main(String[] args) {
        // 使用 flatlaf 的皮肤
        FlatLightLaf.setup();
        // 黑暗主题和一些其他主题的皮肤尝试
        // FlatDarkLaf.setup();
        // FlatIntelliJLaf.setup();
        DemoForm.start();
    }
}
