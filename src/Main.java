public class Main {
    public static void main(String[] args) {

        // Declare and initialize maintenance costs for each season
        double springMaintenanceCost = 350.75; // Fixed cost as per instructions
        double summerMaintenanceCost = 280.54;  // Fixed cost as per instructions
        double autumnMaintenanceCost = 410.23;  // Fixed cost as per instructions
        double winterMaintenanceCost = 520.94;  // Fixed cost as per instructions

        // Calculate the total yearly maintenance cost
        double totalYearlyMaintenanceCost = springMaintenanceCost + summerMaintenanceCost + autumnMaintenanceCost + winterMaintenanceCost;

        // Display the individual seasonal costs and the total yearly cost
        System.out.println("--- Home Maintenance Costs ---");

        System.out.println("Spring Maintenance Cost: $" + springMaintenanceCost);

        System.out.println("Summer Maintenance Cost: $" + summerMaintenanceCost);

        System.out.println("Autumn Maintenance Cost: $" + autumnMaintenanceCost); // Can we agree autumn is a better name than fall?

        System.out.println("Winter Maintenance Cost: $" + winterMaintenanceCost);

        System.out.println("----------------------------");

        System.out.println("Total Yearly Maintenance Cost: $" + totalYearlyMaintenanceCost);
    }
}