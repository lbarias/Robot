import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;



public class RobotTest {

    @Test
    public void testRobotTest1() throws Exception{
        Movement robot = new Movement();

        robot.Place(0,0,"NORTH");
        robot.Move();
        String report = robot.Report();
        Assertions.assertEquals(report, "0,1,NORTH");
    }
    @Test
    public void testRobotTest2() throws Exception{
        Movement robot = new Movement();

        robot.Place(0,0,"NORTH");
        robot.Left();
        String report = robot.Report();
        Assertions.assertEquals(report, "0,0,WEST");
    }
    @Test
    public void testRobotTest3() throws Exception{
        Movement robot = new Movement();

        robot.Place(1,2,"EAST");
        robot.Move();
        robot.Move();
        robot.Left();
        robot.Move();
        String report = robot.Report();
        Assertions.assertEquals(report, "3,3,NORTH");
    }
    @Test
    public void testRobotTest4() throws Exception{
        Movement robot = new Movement();
        robot.Place(1,5,"EAST");
        String report = robot.Report();
        Assertions.assertEquals(report, "0,0,null");
    }
    @Test
    public void testRobotTest5() throws Exception{
        Movement robot = new Movement();
        robot.Place(-1,4,"EAST");
        robot.Move();
        robot.Right();
        robot.Move();
        robot.Left();
        String report = robot.Report();
        Assertions.assertEquals(report, "0,0,null");
    }
    @Test
    public void testRobotTest6() throws Exception{
        Movement robot = new Movement();
        robot.Move();
        robot.Left();
        robot.Right();
        String report = robot.Report();
        Assertions.assertEquals(report, "0,0,null");
    }

}
