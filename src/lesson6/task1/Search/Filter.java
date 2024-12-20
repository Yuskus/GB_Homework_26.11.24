package lesson6.task1.Search;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import lesson6.task1.Objects.LaptopCollection;
import lesson6.task1.Objects.Parts.Structures.Brands;
import lesson6.task1.Objects.Parts.Structures.Colors;
import lesson6.task1.Objects.Parts.Structures.OperationSystem;

public class Filter {
    private Map<Integer, String> criteria = new HashMap<>() {
        {
            put(-1, "No Filter");
            put(0, "Main Filter: by Brand");
            put(1, "Main Filter: by OS");
            put(2, "Main Filter: by Color");
            put(3, "Display Filter: by Diagonal");
            put(4, "Memory Filter: by RAM");
            put(5, "Memory Filter: by ROM");
            put(6, "Processor Filter: by Brand");
            put(7, "Processor Filter: by Cores");
            put(8, "Input Devices Filter: by NumPad");
            put(9, "Multimedia Filter: by Web Camera");
            put(10, "Communication Filter: by Bluetooth");
            put(11, "Battery Filter: by Fast Charge");
        }
    };

    public HashMap<Integer, String> getCriteria() {
        return new HashMap<Integer, String>(criteria);
    }

    public void printAllCriteria() {
        System.out.println("All filter criteria:");
        for (var item : criteria.entrySet()) {
            System.out.println(item.getValue() + " has number " + item.getKey());
        }
    }

    public void startFilter(LaptopCollection collection) {
        Scanner scanner = new Scanner(System.in);

        printAllCriteria();

        Boolean filtering = true;

        while (filtering) {
            System.out.println("Input the criterion number below. If you want to exit, enter \"-1.\"");

            switch (scanner.nextLine()) {
                case "-1":
                    System.out.println("Stop filter.");
                    filtering = false;
                    break;
                case "0":
                    Brands.print();
                    System.out.println("Please, enter number of brand you need."); // all brands and ask input
                    if (!scanner.hasNextInt())
                        break;
                    int brandLap = scanner.nextInt();
                    scanner.nextLine();
                    MainLaptopFilter.SearchingByBrand(collection, Brands.valueOf(brandLap));
                    break;
                case "1":
                    OperationSystem.print();
                    System.out.println("Please, enter number of operation system you need."); // all os and ask input
                    if (!scanner.hasNextInt())
                        break;
                    int os = scanner.nextInt();
                    scanner.nextLine();
                    MainLaptopFilter.SearchingByOS(collection, OperationSystem.valueOf(os));
                    break;
                case "2":
                    Colors.print();
                    System.out.println("Please, enter number of color you need."); // all colors and ask input
                    if (!scanner.hasNextInt())
                        break;
                    int color = scanner.nextInt();
                    scanner.nextLine();
                    MainLaptopFilter.SearchingByColor(collection, Colors.valueOf(color));
                    break;
                case "3":
                    System.out.println("Please, enter minimum and maximum diagonal of the laptop display.");
                    if (!scanner.hasNextFloat())
                        break;
                    float minDiagonal = scanner.nextFloat();
                    scanner.nextLine();
                    if (!scanner.hasNextFloat())
                        break;
                    float maxDiagonal = scanner.nextFloat();
                    scanner.nextLine();
                    DisplayFilter.SearchingByDiagonal(collection, minDiagonal, maxDiagonal);
                    break;
                case "4":
                    System.out.println("Please, enter minimum RAM."); // and ask input
                    if (!scanner.hasNextInt())
                        break;
                    int ram = scanner.nextInt();
                    scanner.nextLine();
                    MemoryFilter.SearchingByRam(collection, ram);
                    break;
                case "5":
                    System.out.println("Please, enter minimum ROM."); // and ask input
                    if (!scanner.hasNextInt())
                        break;
                    int rom = scanner.nextInt();
                    scanner.nextLine();
                    MemoryFilter.SearchingByRom(collection, rom);
                    break;
                case "6":
                    Brands.print();
                    System.out.println("Please, enter number of brand you need."); // all brandProc and ask input
                    if (!scanner.hasNextInt())
                        break;
                    int brandProc = scanner.nextInt();
                    scanner.nextLine();
                    ProcessorFilter.SearchingByBrand(collection, Brands.valueOf(brandProc));
                    break;
                case "7":
                    System.out.println("Please, enter cores count."); // and ask input
                    if (!scanner.hasNextInt())
                        break;
                    int cores = scanner.nextInt();
                    scanner.nextLine();
                    ProcessorFilter.SearchingByCores(collection, cores);
                    break;
                case "8":
                    System.out.println("Does the laptop have numpad (boolean)?");
                    if (!scanner.hasNextBoolean())
                        break;
                    boolean numpad = scanner.nextBoolean();
                    scanner.nextLine();
                    InputDevicesFilter.SearchingByNumPad(collection, numpad);
                    break;
                case "9":
                    System.out.println("Please, enter minimum and maximum value"
                            + " of web camera megapixels (min float, max float).");
                    if (!scanner.hasNextFloat())
                        break;
                    float minCam = scanner.nextFloat();
                    scanner.nextLine();
                    if (!scanner.hasNextFloat())
                        break;
                    float maxCam = scanner.nextFloat();
                    scanner.nextLine();
                    MultimediaFilter.SearchingByCam(collection, minCam, maxCam);
                    break;
                case "10":
                    System.out.println("Please, enter minimal bluetooth version (float).");
                    if (!scanner.hasNextFloat())
                        break;
                    float bluetooth = scanner.nextFloat();
                    scanner.nextLine();
                    CommunicationFilter.SearchingByBluetooth(collection, bluetooth);
                    break;
                case "11":
                    System.out.println("Does the laptop have fast charge (boolean)?");
                    if (!scanner.hasNextBoolean())
                        break;
                    boolean charge = scanner.nextBoolean();
                    scanner.nextLine();
                    BatteryFilter.SearchingByCharge(collection, charge);
                    break;
                default:
                    System.out.println("It was the wrong code."); // error
                    break;
            }
        }

        scanner.close();
    }
}
