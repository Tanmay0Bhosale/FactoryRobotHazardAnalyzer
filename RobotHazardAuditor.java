public class RobotHazardAuditor {

    public double calculateHazardRisk(double armPrecision,
                                      int workerDensity,
                                      String machineryState)
            throws RobotSafetyException {

        double machineRiskFactor;

        if (machineryState.equals("Worn")) {
            machineRiskFactor = 1.3;
        }
        else if (machineryState.equals("Faulty")) {
            machineRiskFactor = 2.0;
        }
        else if (machineryState.equals("Critical")) {
            machineRiskFactor = 3.0;
        }
        else {
            throw new RobotSafetyException(
                    "Error: Unsupported machinery state");
        }

        return ((1.0 - armPrecision) * 15.0)
                + (workerDensity * machineRiskFactor);
    }
}
