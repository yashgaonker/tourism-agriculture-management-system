import java.util.Scanner;

/**
 * Menu-driven demonstration of Java inheritance using Tourism and Agriculture.
 * <p>Demonstrates single, multilevel, hierarchical, multiple-style (interfaces),
 * and hybrid inheritance. Java does not support extending multiple classes;
 * interfaces are used to demonstrate multiple inheritance of type.</p>
 *
 * @author yash_gaonkar
 * @version 1.0
 */
public class TourismAgricultureManagementSystem {
    /** Starts the menu and runs the selected inheritance demonstration. */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int choice;
            do {
                printMenu();
                System.out.print("Enter your choice: ");
                while (!scanner.hasNextInt()) {
                    System.out.print("Please enter a number (0-5): ");
                    scanner.next();
                }
                choice = scanner.nextInt();
                System.out.println();
                switch (choice) {
                    case 1 -> demonstrateSingle();
                    case 2 -> demonstrateMultilevel();
                    case 3 -> demonstrateHierarchical();
                    case 4 -> demonstrateMultiple();
                    case 5 -> demonstrateHybrid();
                    case 0 -> System.out.println("Thank you for using the system!");
                    default -> System.out.println("Invalid choice. Please select 0-5.");
                }
                System.out.println();
            } while (choice != 0);
        }
    }

    /** Prints all available menu choices. */
    private static void printMenu() {
        System.out.println("===============================================");
        System.out.println(" TOURISM AND AGRICULTURE MANAGEMENT SYSTEM");
        System.out.println("===============================================");
        System.out.println("1. Single Inheritance (Tourism)");
        System.out.println("2. Multilevel Inheritance (Tourism)");
        System.out.println("3. Hierarchical Inheritance (Tourism)");
        System.out.println("4. Multiple Inheritance using Interfaces (Agriculture)");
        System.out.println("5. Hybrid Inheritance (Agriculture)");
        System.out.println("0. Exit");
        System.out.println("-----------------------------------------------");
    }

    /** Demonstrates a child class inheriting from one parent class. */
    private static void demonstrateSingle() {
        System.out.println("--- SINGLE INHERITANCE ---");
        TourGuide guide = new TourGuide();
        guide.showService();
        guide.guideTour();
    }

    /** Demonstrates a three-level inheritance chain. */
    private static void demonstrateMultilevel() {
        System.out.println("--- MULTILEVEL INHERITANCE ---");
        AdventureTour tour = new AdventureTour();
        tour.showService();
        tour.planTravel();
        tour.offerAdventure();
    }

    /** Demonstrates two child classes inheriting from the same parent. */
    private static void demonstrateHierarchical() {
        System.out.println("--- HIERARCHICAL INHERITANCE ---");
        TourGuide guide = new TourGuide();
        HotelService hotel = new HotelService();
        guide.showService();
        guide.guideTour();
        hotel.showService();
        hotel.bookRoom();
    }

    /** Demonstrates a class implementing two interfaces. */
    private static void demonstrateMultiple() {
        System.out.println("--- MULTIPLE INHERITANCE USING INTERFACES ---");
        OrganicFarmer farmer = new OrganicFarmer();
        farmer.manageCrops();
        farmer.useSustainableMethods();
        farmer.sellProduce();
    }

    /** Demonstrates class inheritance combined with interface implementation. */
    private static void demonstrateHybrid() {
        System.out.println("--- HYBRID INHERITANCE ---");
        SmartFarm farm = new SmartFarm();
        farm.describeFarm();
        farm.manageCrops();
        farm.useSustainableMethods();
        farm.monitorSoil();
    }
}

/** Base class shared by tourism service providers. */
class TourismService {
    /** Displays the common tourism service. */
    public void showService() {
        System.out.println("Tourism service: helping visitors plan a safe, enjoyable trip.");
    }
}

/** A tourism employee who guides visitors; demonstrates single inheritance. */
class TourGuide extends TourismService {
    /** Displays a guided-tour activity. */
    public void guideTour() {
        System.out.println("Tour guide: explaining local history and leading a heritage walk.");
    }
}

/** A travel agency extends TourismService, forming level two of a chain. */
class TravelAgency extends TourismService {
    /** Displays travel-planning activity. */
    public void planTravel() {
        System.out.println("Travel agency: arranging transport, tickets and itineraries.");
    }
}

/** An adventure tour extends TravelAgency, demonstrating multilevel inheritance. */
class AdventureTour extends TravelAgency {
    /** Displays an adventure-tour activity. */
    public void offerAdventure() {
        System.out.println("Adventure tour: offering a guided trek with safety equipment.");
    }
}

/** A hotel service is another TourismService child for hierarchical inheritance. */
class HotelService extends TourismService {
    /** Displays hotel booking activity. */
    public void bookRoom() {
        System.out.println("Hotel service: booking an eco-friendly room for tourists.");
    }
}

/** Interface for crop-related operations. */
interface CropManagement {
    /** Describes how crops are managed. */
    void manageCrops();
}

/** Interface for environmentally responsible farming operations. */
interface SustainableFarming {
    /** Describes a sustainable farming method. */
    void useSustainableMethods();
}

/** A farmer implementing two interfaces demonstrates multiple inheritance of type. */
class OrganicFarmer implements CropManagement, SustainableFarming {
    /** {@inheritDoc} */
    @Override
    public void manageCrops() {
        System.out.println("Crop management: planning seasonal vegetables and checking crop health.");
    }

    /** {@inheritDoc} */
    @Override
    public void useSustainableMethods() {
        System.out.println("Sustainable farming: using compost, crop rotation and water conservation.");
    }

    /** Displays how harvested produce is sold. */
    public void sellProduce() {
        System.out.println("Produce sales: supplying fresh organic vegetables to local markets.");
    }
}

/**
 * Base class for agriculture systems. The class also implements CropManagement.
 * Its child SmartFarm adds a second interface, creating a hybrid structure.
 */
class Farm implements CropManagement {
    /** Displays basic farm information. */
    public void describeFarm() {
        System.out.println("Farm: a small farm growing vegetables for the local community.");
    }

    /** {@inheritDoc} */
    @Override
    public void manageCrops() {
        System.out.println("Crop management: scheduling sowing, irrigation and harvesting.");
    }
}

/** A smart farm extends Farm and implements another interface: hybrid inheritance. */
class SmartFarm extends Farm implements SustainableFarming {
    /** {@inheritDoc} */
    @Override
    public void useSustainableMethods() {
        System.out.println("Sustainable farming: composting and drip irrigation reduce resource use.");
    }

    /** Displays a smart-farming soil monitoring activity. */
    public void monitorSoil() {
        System.out.println("Smart farm: soil sensors monitor moisture before irrigation.");
    }
}
