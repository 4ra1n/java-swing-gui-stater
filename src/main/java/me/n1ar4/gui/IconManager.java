package me.n1ar4.gui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.util.Objects;

@SuppressWarnings("all")
public class IconManager {
    private static ImageIcon getIcon(String path, int x, int y) {
        try {
            ImageIcon showIcon = new ImageIcon(ImageIO.read(
                    Objects.requireNonNull(IconManager.class
                            .getClassLoader().getResourceAsStream(path))));
            Image image = showIcon.getImage();
            Image resizedImage = image.getScaledInstance(x, y, Image.SCALE_SMOOTH);
            showIcon = new ImageIcon(resizedImage);
            return showIcon;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public static ImageIcon getLogoIcon() {
        // 传入名称 和 你希望得到的 长 宽
        return getIcon("img/logo.png", 60, 60);
    }
}
