package practice_excercise_3_20_and_3_21;

import java.awt.*;

public class House {
    private int x;
    private int y;
    private int width;
    private int height;

    public House(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics2D g) {
        Rectangle ext = new Rectangle(this.x, this.y, this.width, this.height);
        Rectangle window = new Rectangle(this.x + this.width / 6, this.y + this.height / 4, this.width / 4, this.height / 4);
        Rectangle door = new Rectangle(this.x + this.width / 2, this.y + this.height / 2, this.width / 6, this.height / 2);
        g.draw(ext);
        g.draw(window);
        g.draw(door);
        g.drawLine(this.x, this.y, this.x + this.width / 2, this.y - this.height / 2);
        g.drawLine(this.x + this.width, this.y, this.x + this.width / 2, this.y - this.height / 2);
    }
}
