public class Movement {
    Robot robot = new Robot();
    Boolean isPlaced = false;

    void Place(int locationx, int locationy, String face){
        if ((locationx<5) && (-1 < locationx) &&(locationy <5) && (-1 < locationy)){
            robot.x = locationx;
            robot.y = locationy;
            robot.f = face;
            isPlaced = true;
        }
    }
    void Move(){

            //check which way it is facing
            //x or y ++
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

    void Left() {
        if (isPlaced) {
            try {
                if (robot.f.equals("NORTH")) {
                    robot.f = "WEST";
                } else if (robot.f.equals("WEST")) {
                    robot.f = "SOUTH";
                } else if (robot.f.equals("SOUTH")) {
                    robot.f = "EAST";
                } else {
                    robot.f = "NORTH";
                }
            } catch (NullPointerException e) {
                System.out.println("Robot is not on table.");
            }
        }
    }
    void Right() {
        if (isPlaced) {

            try {
                if (robot.f.equals("NORTH")) {
                    robot.f = "EAST";
                } else if (robot.f.equals("EAST")) {
                    robot.f = "SOUTH";
                } else if (robot.f.equals("SOUTH")) {
                    robot.f = "WEST";
                } else {
                    robot.f = "NORTH";
                }
            } catch (NullPointerException e) {
                System.out.println("Robot is not on table.");
            }
        }
    }
    String Report(){
        return robot.x + "," + robot.y +","  + robot.f;
    }
}
