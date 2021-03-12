package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Game extends JFrame implements MouseListener {
    private Field[][]fields;


    /**
     * constructor
     * @throws HeadlessException err
     */
    public Game() throws HeadlessException {
        super("Kursov proekt");
        super.addMouseListener(this);

        this.fields = new Field[7][9];
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(900, 700);
        super.setVisible(true);
        initFields();

    }

    /**
     * init of the field
     */
    private void initFields() {

            generateBattleField();
            generatePlayerBG(0, 1);
            generatePlayerBG(5, 6);


    }

    /**
     * generate battlefield
     */
    private void generateBattleField() {
        for (int row = 2; row <= 4; row++) {
            for (int col = 0; col < 9; col++) {
                Field field = new Field(col, row, Color.ORANGE);
                fields[row][col] = field;
            }
        }
    }

    /**
     * generate player battleground
     * @param fromRow from
     * @param toRow to
     */
    private void generatePlayerBG(int fromRow, int toRow) {
        Color currentColor = Color.GRAY;

        for (int row = fromRow; row <= toRow; row++) {
            for (int col = 0; col < 9; col++) {
                currentColor = currentColor.equals(Color.GRAY) ? Color.DARK_GRAY : Color.GRAY;

                Field field = new Field(col, row, currentColor);
                fields[row][col] = field;
            }
        }

    }


    /**
     * paint method
     * @param g
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g);


        for (int row = 0; row < 7; row++) {
            for (int col = 0; col < 9; col++) {
                fields[row][col].render(g);
            }
        }

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
