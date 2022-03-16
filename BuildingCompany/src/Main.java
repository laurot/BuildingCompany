public class Main {
    public static void main(String[] args) {
        Input input1 = new Input();
        Calculate calc1 = new Calculate();
        int buildType;
        int serviceType;
        int weather;
        int floors;
        float sqMeters;
        do {
            buildType = input1.askBuildingType();

            if (buildType != 0) {
                serviceType = input1.askServiceType();
                floors = input1.askFloors();
                sqMeters = input1.askSqMetres();
                weather =input1.askWeather();
                calc1.calculate(buildType, weather, serviceType, floors, sqMeters);

            }
        } while (buildType != 0);
        
    }
}
