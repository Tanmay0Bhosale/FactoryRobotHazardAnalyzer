import java.util.Scanner;

public class FactoryRobotHazardAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        RobotHazardAuditor auditor = new RobotHazardAuditor();

        double armPrecision = sc.nextDouble();
        int workerDensity = sc.nextInt();
        sc.nextLine();
        String machineryState = sc.nextLine();

        double risk = auditor.calculateHazardRisk(
                armPrecision, workerDensity, machineryState);

        System.out.println("Robot Hazard Risk Score: " + risk);
    }
}
