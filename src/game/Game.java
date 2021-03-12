package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Game extends JFrame implements MouseListener {
    private Field[][]fields;
    public Game() throws HeadlessException {
        super("Kursov proekt");
        super.addMouseListener(this);

        this.fields = new Field[7][9];
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(900, 700);
        super.setVisible(true);
        initFields();

    }

    private void initFields() {
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
