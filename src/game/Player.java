package game;

import game.figures.Figure;

import java.util.ArrayList;
import java.util.List;


public class Player {
    private int id;

    private List<Figure> figures;

    public Player(int id) {
        this.id = id;

        this.figures = new ArrayList<>();
    }

    public int getId() {
        return id;
    }
}

