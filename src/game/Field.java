package game;

import game.figures.Figure;

import java.awt.*;

public class Field {
    public static final int FIELD_SIZE = 100;

    private int x;
    private int y;

    private Color color;
    private Figure currentFigure;

    public Field(int x, int y, Color color) {
        setX(x);
        setY(y);
        this.color = color;
        this.currentFigure = null;
    }

    public void render(Graphics g) {
        if (currentFigure == null) {
            g.setColor(color);
            g.fillRect(x, y, Field.FIELD_SIZE, Field.FIELD_SIZE);
        } else {
            g.setColor(Color.white);
        }

        g.setColor(Color.BLACK);
        g.drawRect(x, y, Field.FIELD_SIZE, Field.FIELD_SIZE);
    }

    public void setCurrentFigure(Figure currentFigure) {
        this.currentFigure = currentFigure;
    }

    public void setX(int x) {
        this.x = x * FIELD_SIZE;
    }

    public void setY(int y) {
        this.y = y * FIELD_SIZE;
    }


}
