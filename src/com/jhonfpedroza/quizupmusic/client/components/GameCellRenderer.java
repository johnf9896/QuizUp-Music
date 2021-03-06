package com.jhonfpedroza.quizupmusic.client.components;

import com.jhonfpedroza.quizupmusic.models.Game;

import javax.swing.*;
import java.awt.*;

public class GameCellRenderer implements ListCellRenderer {
    private JPanel content;
    private JLabel p1Label;
    private JLabel p2Label;

    private static final Color HIGHLIGHT_COLOR = new Color(0, 0, 255);
    private static final Color NORMAL_COLOR = new Color(255, 255, 255);

    GameCellRenderer() {
    }

    @Override
    public Component getListCellRendererComponent(JList list, Object obj, int index, boolean isSelected, boolean cellHasFocus) {

        Game game = (Game)obj;
        p1Label.setText(game.getPlayer1().getName());
        p2Label.setText(game.getPlayer2().getName());

        if (isSelected) {
            content.setBackground(HIGHLIGHT_COLOR);
            p1Label.setOpaque(true);
            p2Label.setOpaque(true);
        } else {
            content.setBackground(NORMAL_COLOR);
            p1Label.setOpaque(false);
            p2Label.setOpaque(false);
        }

        return content;
    }
}
