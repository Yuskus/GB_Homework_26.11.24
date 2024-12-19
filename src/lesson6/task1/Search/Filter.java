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

    public void startFilter(LaptopCollection collection) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(); // input criteria integer
            if (!scanner.hasNextInt())
                continue;

            switch (scanner.nextInt()) {
                case -1:
                    return;
                case 0:
                    System.out.println(); // all brands and ask input
                    if (!scanner.hasNextInt())
                        break;
                    int brandLap = scanner.nextInt();
                    MainLaptopFilter.SearchingByBrand(collection, Brands.valueOf(brandLap));
                    break;
                case 1:
                    System.out.println(); // all os and ask input
                    if (!scanner.hasNextInt())
                        break;
                    int os = scanner.nextInt();
                    MainLaptopFilter.SearchingByOS(collection, OperationSystem.valueOf(os));
                    break;
                case 2:
                    System.out.println(); // all colors and ask input
                    if (!scanner.hasNextInt())
                        break;
                    int color = scanner.nextInt();
                    MainLaptopFilter.SearchingByColor(collection, Colors.valueOf(color));
                    break;
                case 3:
                    System.out.println(); // ask input
                    if (!scanner.hasNextFloat())
                        break;
                    float minDiagonal = scanner.nextFloat();
                    if (!scanner.hasNextFloat())
                        break;
                    float maxDiagonal = scanner.nextFloat();
                    DisplayFilter.SearchingByDiagonal(collection, minDiagonal, maxDiagonal);
                    break;
                case 4:
                    System.out.println(); // and ask input
                    if (!scanner.hasNextInt())
                        break;
                    int ram = scanner.nextInt();
                    MemoryFilter.SearchingByRam(collection, ram);
                    break;
                case 5:
                    System.out.println(); // and ask input
                    if (!scanner.hasNextInt())
                        break;
                    int rom = scanner.nextInt();
                    MemoryFilter.SearchingByRom(collection, rom);
                    break;
                case 6:
                    System.out.println(); // all brandProc and ask input
                    if (!scanner.hasNextInt())
                        break;
                    int brandProc = scanner.nextInt();
                    ProcessorFilter.SearchingByBrand(collection, Brands.valueOf(brandProc));
                    break;
                case 7:
                    System.out.println(); // and ask input
                    if (!scanner.hasNextInt())
                        break;
                    int cores = scanner.nextInt();
                    ProcessorFilter.SearchingByCores(collection, cores);
                    break;
                case 8:
                    System.out.println(); // and ask input
                    if (!scanner.hasNextBoolean())
                        break;
                    boolean numpad = scanner.nextBoolean();
                    InputDevicesFilter.SearchingByNumPad(collection, numpad);
                    break;
                case 9:
                    System.out.println(); // and ask input
                    if (!scanner.hasNextFloat())
                        break;
                    float minCam = scanner.nextFloat();
                    if (!scanner.hasNextFloat())
                        break;
                    float maxCam = scanner.nextFloat();
                    MultimediaFilter.SearchingByCam(collection, minCam, maxCam);
                    break;
                case 10:
                    System.out.println(); // and ask input
                    if (!scanner.hasNextFloat())
                        break;
                    float bluetooth = scanner.nextFloat();
                    CommunicationFilter.SearchingByBluetooth(collection, bluetooth);
                    break;
                case 11:
                    System.out.println(); // and ask input
                    if (!scanner.hasNextBoolean())
                        break;
                    boolean charge = scanner.nextBoolean();
                    BatteryFilter.SearchingByCharge(collection, charge);
                    break;
                default:
                    System.out.println(); // error
                    break;
            }

            System.out.println(); // do you want to exit? press q/Q + enter
            if (scanner.nextLine().toUpperCase() == "Q")
                break;
        }

        scanner.close();
    }
}
