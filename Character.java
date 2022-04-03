public class Character {
    private Directions directions; // This direction is not relative to the character but to the screen
    private int xPos;
    private int yPos;

    public void move(int x, int y) {
        if (y > 0) {
            directions = Directions.SOUTH;
        } else if (y < 0) {
            directions = Directions.NORTH;
        }

        if (x > 0) {
            directions = Directions.WEST;
        } else if (x < 0) {
            directions = Directions.EAST;
        }

        xPos += x;
        yPos += y;
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public Directions getDirections() {
        return directions;
    }

    public void setDirections(Directions directions) {
        this.directions = directions;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }
}
