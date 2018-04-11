/**
 * Movement Class: Commands that can be used to move toy
 * Follows the scheme of not being able to do anything to
 * the toy until it has first been placed in a legal spot
 * on the 5*5 plane.
 */
class Movement {
    private Robot robot = new Robot();
    private Boolean isPlaced = false;

    //places robot on the board, if location is legal
    void Place(int locationx, int locationy, String face){
        if ((locationx<5) && (-1 < locationx) &&(locationy <5) && (-1 < locationy)){
            robot.x = locationx;
            robot.y = locationy;
            robot.f = face;
            isPlaced = true;
        }
    }
    //Moves robot one step forward depending on which way is is facing
    //Will not move robot if not first placed or not legal move
    void Move(){
        if (isPlaced) {
            try {
                if (robot.f.equals("NORTH") && robot.y < 4) {
                    robot.y++;
                } else if (robot.f.equals("SOUTH") && robot.y > 0) {
                    robot.y--;
                } else if (robot.f.equals("EAST") && robot.x < 4) {
                    robot.x++;
                } else if (robot.f.equals("WEST") && robot.x > 0) {
                    robot.x--;
                }
            } catch (NullPointerException e) {
                System.out.println("Robot is not on table.");
            }
        }

    }
    //Rotates robot 90 degrees LEFT if placed on the board
    void Left() {
        if (isPlaced) {
            try {
                switch (robot.f) {
                    case "NORTH":
                        robot.f = "WEST";
                        break;
                    case "WEST":
                        robot.f = "SOUTH";
                        break;
                    case "SOUTH":
                        robot.f = "EAST";
                        break;
                    default:
                        robot.f = "NORTH";
                        break;
                }
            } catch (NullPointerException e) {
                System.out.println("Robot is not on table.");
            }
        }
    }
    //Rotates robot 90 degrees RIGHT if placed on the board
    void Right() {
        if (isPlaced) {

            try {
                switch (robot.f) {
                    case "NORTH":
                        robot.f = "EAST";
                        break;
                    case "EAST":
                        robot.f = "SOUTH";
                        break;
                    case "SOUTH":
                        robot.f = "WEST";
                        break;
                    default:
                        robot.f = "NORTH";
                        break;
                }
            } catch (NullPointerException e) {
                System.out.println("Robot is not on table.");
            }
        }
    }
    //Returns a String with the X & Y and which way it is facing
    String Report(){
        return robot.x + "," + robot.y +","  + robot.f;
    }
}
