import java.util.Scanner;

public class FactoryRobotHazardAnalyzer {

    public static void main(String[] args) {
        try {
            throw new RobotSafetyException("Safety violation detected");
        } catch (RobotSafetyException e) {
            System.out.println(e.getMessage());
        }
    }
}
