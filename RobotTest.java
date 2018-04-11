import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;



public class RobotTest {

    //Test 1: Checking SW Corner Functionality
    @Test
    public void testRobotTest1() throws Exception{
        Movement robot = new Movement();

        robot.Place(0,0,"NORTH");
        robot.Move();
        String report = robot.Report();
        Assertions.assertEquals(report, "0,1,NORTH");
    }
    //Test 2: Checking SE Corner Functionality
    @Test
    public void testRobotTest2() throws Exception{
        Movement robot = new Movement();

        robot.Place(4,0,"SOUTH");
        robot.Move();
        String report = robot.Report();
        Assertions.assertEquals(report, "4,0,SOUTH");
    }
    //Test 3: Checking NE Corner Functionality
    @Test
    public void testRobotTest3() throws Exception{
        Movement robot = new Movement();

        robot.Place(4,4,"NORTH");
        robot.Move();
        String report = robot.Report();
        Assertions.assertEquals(report, "4,4,NORTH");
    }
    //Test 4: Checking NW Corner Functionality
    @Test
    public void testRobotTest4() throws Exception{
        Movement robot = new Movement();

        robot.Place(0,4,"NORTH");
        robot.Move();
        String report = robot.Report();
        Assertions.assertEquals(report, "0,4,NORTH");
    }
    //Test 5: Check that Left command
    @Test
    public void testRobotTest5() throws Exception{
        Movement robot = new Movement();

        robot.Place(0,0,"NORTH");
        robot.Left();
        robot.Left();
        String report = robot.Report();
        Assertions.assertEquals(report, "0,0,SOUTH");
    }
    //Test 6: Check that Right command works
    @Test
    public void testRobotTest6() throws Exception{
        Movement robot = new Movement();
        robot.Place(0,0,"NORTH");
        robot.Left();
        robot.Left();
        robot.Right();
        robot.Right();
        robot.Right();
        String report = robot.Report();
        Assertions.assertEquals(report, "0,0,EAST");
    }
    //Test 7: Testing Place + Move + Left functionality
   @Test
    public void testRobotTest7() throws Exception{
        Movement robot = new Movement();

        robot.Place(1,2,"EAST");
        robot.Move();
        robot.Move();
        robot.Left();
        robot.Move();
        String report = robot.Report();
        Assertions.assertEquals(report, "3,3,NORTH");
    }
    //Test 8: Check not legal Place command
    @Test
    public void testRobotTest8() throws Exception{
        Movement robot = new Movement();
        robot.Place(1,5,"EAST");
        String report = robot.Report();
        Assertions.assertEquals(report, "0,0,null");
    }
    //Test 9:Check not legal Place command with ignoring other commands
    @Test
    public void testRobotTest9() throws Exception{
        Movement robot = new Movement();
        robot.Place(-1,4,"EAST");
        robot.Move();
        robot.Right();
        robot.Move();
        robot.Left();
        String report = robot.Report();
        Assertions.assertEquals(report, "0,0,null");
    }
    //Test 10: Check if not robot is placed, no movement is done
    @Test
    public void testRobotTest10() throws Exception{
        Movement robot = new Movement();
        robot.Move();
        robot.Left();
        robot.Right();
        String report = robot.Report();
        Assertions.assertEquals(report, "0,0,null");
    }
    //Test 11: Testing robot not falling off boundaries on West side
    @Test
    public void testRobotTest11() throws Exception{
        Movement robot = new Movement();
        robot.Place(0,0,"SOUTH");
        robot.Move();
        robot.Move();
        robot.Right();
        robot.Move();
        String report = robot.Report();
        Assertions.assertEquals(report, "0,0,WEST");
    }
    //Test 12: Testing robot not falling off boundaries on East Side
    @Test
    public void testRobotTest12() throws Exception{
        Movement robot = new Movement();
        robot.Place(4,3,"SOUTH");
        robot.Move();
        robot.Move();
        robot.Move();
        robot.Move();
        robot.Left();
        robot.Move();
        robot.Left();
        robot.Move();
        robot.Move();
        robot.Move();
        robot.Move();
        robot.Move();
        String report = robot.Report();
        Assertions.assertEquals(report, "4,4,NORTH");
    }
}
