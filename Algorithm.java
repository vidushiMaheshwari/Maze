/**
 * Tremaux Algorithm
 */

public class Algorithm {
    private Character character;
    private int xTarget;
    private int yTarget;
    private int[][] maze;
    // in maze --> -1 => walls, 0 => open spaces,
    // 1 => red point (1 entry), 2 => orange blob (2 entry.. path closed now)


    public boolean checkTarget() {
        return (character.getxPos() == xTarget) && (character.getyPos() == yTarget);
    }

    public void function() {
        if (checkTarget()) {
            //FOUND
            backTrace();
        } else {
            //Move the character
            Directions opening = openingAvailable();
            switch (character.getDirections()) {
                case SOUTH:
                    while (opening == null && maze[character.getxPos()][character.getyPos()] != -1) {
                        character.move(0, 1);
//                        function();
                    }
                    if (opening != null) {
                        if (opening == Directions.EAST) {
                            maze[character.getxPos()][character.getyPos()] += 1;
                            character.move(-1, 0);
//                            function();
                        }
                    }
                    // Conditions when there are 2 dots or a wall
                    if ()
            }
        }

        function();

    }

    public Directions openingAvailable() {
        if (character.getDirections() == Directions.NORTH || character.getDirections() == Directions.SOUTH) {
            if ( (maze.length > character.getxPos() + 1) && maze[character.getxPos() + 1][character.getyPos()] == 0) {
                return Directions.WEST;
            }
            if (character.getxPos() > 0 && maze[character.getxPos() - 1][character.getyPos()] == 0) {
                return Directions.EAST;
            }
            } else {
            if (maze[character.getxPos()][character.getyPos() + 1] == 0) {
                return Directions.NORTH;
            } else if (maze[character.getxPos()][character.getyPos() - 1] == 0) {
                return Directions.SOUTH;
            }
        }
        return null;
    }

    private void backTrace() {
        //TODO: implement this method
        return;
    }

}
