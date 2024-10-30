package me.n1ar4.gui;

import javax.swing.*;

public class MenuUtil {
    public static JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(createAboutMenu());
        return menuBar;
    }

    private static JMenu createAboutMenu() {
        try {
            JMenu newMenu = new JMenu("File");

            JMenuItem connectItem = new JMenuItem("New");
            connectItem.addActionListener(e -> {
                // 完成你的逻辑
                System.out.println("Do New File");
                // 如何弹出一个框
                JOptionPane.showMessageDialog(null,"Do New File");
            });
            newMenu.add(connectItem);
            return newMenu;
        } catch (Exception ex) {
            return null;
        }
    }
}
