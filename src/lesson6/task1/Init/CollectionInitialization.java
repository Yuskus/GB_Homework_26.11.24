package lesson6.task1.Init;

import java.awt.Color;
import lesson6.task1.Objects.Laptop;
import lesson6.task1.Objects.LaptopCollection;
import lesson6.task1.Objects.Parts.DisplayInfo;
import lesson6.task1.Objects.Parts.Structures.OperationSystem;

public class CollectionInitialization {
    public LaptopCollection Initialization() {
        LaptopCollection collection = new LaptopCollection();

        collection.add(CreateHuaweiMatebook16());
        collection.add(CreateHuaweiMatebook14());
        collection.add(CreateAppleMacbookPro());
        collection.add(CreateHonorMagicbook14());
        collection.add(CreateAsusVivobook());
        collection.add(CreateAcerExtensa15());
        collection.add(CreateHP15s());
        collection.add(CreateMSImodern15H());

        return collection;
    }

    private Laptop CreateHuaweiMatebook16() { // OK
        Laptop laptop = new Laptop("Huawei", "MateBook D 16", 2023, OperationSystem.NONE, "metall", Color.gray);

        DisplayInfo display = new DisplayInfo(16f, 1200, 1920, "IPS", 60, true);
        laptop.setDisplay(display);

        // MemoryInfo memory = new MemoryInfo();
        // laptop.setMemory(memory);

        // GraphicProcessorInfo graphicProcessor = new GraphicProcessorInfo();
        // laptop.setGraphicProcessor(graphicProcessor);

        // ProcessorInfo processor = new ProcessorInfo();
        // laptop.setProcessor(processor);

        // CommunicationInfo communication = new CommunicationInfo();
        // laptop.setCommunication(communication);

        // MultimediaInfo multimedia = new MultimediaInfo();
        // laptop.setMultimedia(multimedia);

        // InputDevicesInfo inputDevices = new InputDevicesInfo();
        // laptop.setInputDevices(inputDevices);

        // BatteryInfo battery = new BatteryInfo();
        // laptop.setBattery(battery);

        // SizeInfo size = new SizeInfo();
        // laptop.setSizeInfo(size);

        // laptop.addSlot(null); // ???

        return laptop;
    }

    private Laptop CreateHuaweiMatebook14() { // OK
        Laptop laptop = new Laptop("Huawei", "MateBook D 14", 2024, OperationSystem.NONE, "metall", Color.gray);

        DisplayInfo display = new DisplayInfo(14f, 1080, 1920, "IPS", 60, true);
        laptop.setDisplay(display);

        // MemoryInfo memory = new MemoryInfo();
        // laptop.setMemory(memory);

        // GraphicProcessorInfo graphicProcessor = new GraphicProcessorInfo();
        // laptop.setGraphicProcessor(graphicProcessor);

        // ProcessorInfo processor = new ProcessorInfo();
        // laptop.setProcessor(processor);

        // CommunicationInfo communication = new CommunicationInfo();
        // laptop.setCommunication(communication);

        // MultimediaInfo multimedia = new MultimediaInfo();
        // laptop.setMultimedia(multimedia);

        // InputDevicesInfo inputDevices = new InputDevicesInfo();
        // laptop.setInputDevices(inputDevices);

        // BatteryInfo battery = new BatteryInfo();
        // laptop.setBattery(battery);

        // SizeInfo size = new SizeInfo();
        // laptop.setSizeInfo(size);

        // laptop.addSlot(null); // ???

        return laptop;
    }

    private Laptop CreateAppleMacbookPro() { // OK
        Laptop laptop = new Laptop("Apple", "MacBook Pro A2780", 2023, OperationSystem.MAC_OS, "aluminum", Color.gray);

        DisplayInfo display = new DisplayInfo(16.2f, 2234, 3456, "IPS", 120, false);
        laptop.setDisplay(display);

        // MemoryInfo memory = new MemoryInfo();
        // laptop.setMemory(memory);

        // GraphicProcessorInfo graphicProcessor = new GraphicProcessorInfo();
        // laptop.setGraphicProcessor(graphicProcessor);

        // ProcessorInfo processor = new ProcessorInfo();
        // laptop.setProcessor(processor);

        // CommunicationInfo communication = new CommunicationInfo();
        // laptop.setCommunication(communication);

        // MultimediaInfo multimedia = new MultimediaInfo();
        // laptop.setMultimedia(multimedia);

        // InputDevicesInfo inputDevices = new InputDevicesInfo();
        // laptop.setInputDevices(inputDevices);

        // BatteryInfo battery = new BatteryInfo();
        // laptop.setBattery(battery);

        // SizeInfo size = new SizeInfo();
        // laptop.setSizeInfo(size);

        // laptop.addSlot(null); // ???

        return laptop;
    }

    private Laptop CreateHonorMagicbook14() { // OK
        Laptop laptop = new Laptop("Honor", "MagicBook 14 NMH-WDQ9HN", 2021, OperationSystem.FREE_DOS, "metall",
                Color.gray);

        DisplayInfo display = new DisplayInfo(14f, 1080, 1920, "IPS", 60, true);
        laptop.setDisplay(display);

        // MemoryInfo memory = new MemoryInfo();
        // laptop.setMemory(memory);

        // GraphicProcessorInfo graphicProcessor = new GraphicProcessorInfo();
        // laptop.setGraphicProcessor(graphicProcessor);

        // ProcessorInfo processor = new ProcessorInfo();
        // laptop.setProcessor(processor);

        // CommunicationInfo communication = new CommunicationInfo();
        // laptop.setCommunication(communication);

        // MultimediaInfo multimedia = new MultimediaInfo();
        // laptop.setMultimedia(multimedia);

        // InputDevicesInfo inputDevices = new InputDevicesInfo();
        // laptop.setInputDevices(inputDevices);

        // BatteryInfo battery = new BatteryInfo();
        // laptop.setBattery(battery);

        // SizeInfo size = new SizeInfo();
        // laptop.setSizeInfo(size);

        // laptop.addSlot(null); // ???

        return laptop;
    }

    private Laptop CreateAsusVivobook() { // OK
        Laptop laptop = new Laptop("ASUS", "VivoBook X1502ZA-BQ2345", 2022, OperationSystem.NONE, "plastic",
                Color.blue);

        DisplayInfo display = new DisplayInfo(15.6f, 1080, 1920, "IPS", 60, true);
        laptop.setDisplay(display);

        // MemoryInfo memory = new MemoryInfo();
        // laptop.setMemory(memory);

        // GraphicProcessorInfo graphicProcessor = new GraphicProcessorInfo();
        // laptop.setGraphicProcessor(graphicProcessor);

        // ProcessorInfo processor = new ProcessorInfo();
        // laptop.setProcessor(processor);

        // CommunicationInfo communication = new CommunicationInfo();
        // laptop.setCommunication(communication);

        // MultimediaInfo multimedia = new MultimediaInfo();
        // laptop.setMultimedia(multimedia);

        // InputDevicesInfo inputDevices = new InputDevicesInfo();
        // laptop.setInputDevices(inputDevices);

        // BatteryInfo battery = new BatteryInfo();
        // laptop.setBattery(battery);

        // SizeInfo size = new SizeInfo();
        // laptop.setSizeInfo(size);

        // laptop.addSlot(null); // ???

        return laptop;
    }

    private Laptop CreateAcerExtensa15() { // OK
        Laptop laptop = new Laptop("Acer", "Extensa 15 EX215-23-R62L", 2022, OperationSystem.NONE, "plastic",
                Color.gray);

        DisplayInfo display = new DisplayInfo(15.6f, 1080, 1920, "IPS", 60, true);
        laptop.setDisplay(display);

        // MemoryInfo memory = new MemoryInfo();
        // laptop.setMemory(memory);

        // GraphicProcessorInfo graphicProcessor = new GraphicProcessorInfo();
        // laptop.setGraphicProcessor(graphicProcessor);

        // ProcessorInfo processor = new ProcessorInfo();
        // laptop.setProcessor(processor);

        // CommunicationInfo communication = new CommunicationInfo();
        // laptop.setCommunication(communication);

        // MultimediaInfo multimedia = new MultimediaInfo();
        // laptop.setMultimedia(multimedia);

        // InputDevicesInfo inputDevices = new InputDevicesInfo();
        // laptop.setInputDevices(inputDevices);

        // BatteryInfo battery = new BatteryInfo();
        // laptop.setBattery(battery);

        // SizeInfo size = new SizeInfo();
        // laptop.setSizeInfo(size);

        // laptop.addSlot(null); // ???

        return laptop;
    }

    private Laptop CreateHP15s() { // OK
        Laptop laptop = new Laptop("HP", "15s-fq5035ny", 2022, OperationSystem.FREE_DOS, "plastic", Color.black);

        DisplayInfo display = new DisplayInfo(15.6f, 1080, 1920, "IPS", 60, true);
        laptop.setDisplay(display);

        // MemoryInfo memory = new MemoryInfo();
        // laptop.setMemory(memory);

        // GraphicProcessorInfo graphicProcessor = new GraphicProcessorInfo();
        // laptop.setGraphicProcessor(graphicProcessor);

        // ProcessorInfo processor = new ProcessorInfo();
        // laptop.setProcessor(processor);

        // CommunicationInfo communication = new CommunicationInfo();
        // laptop.setCommunication(communication);

        // MultimediaInfo multimedia = new MultimediaInfo();
        // laptop.setMultimedia(multimedia);

        // InputDevicesInfo inputDevices = new InputDevicesInfo();
        // laptop.setInputDevices(inputDevices);

        // BatteryInfo battery = new BatteryInfo();
        // laptop.setBattery(battery);

        // SizeInfo size = new SizeInfo();
        // laptop.setSizeInfo(size);

        // laptop.addSlot(null); // ???

        return laptop;
    }

    private Laptop CreateMSImodern15H() { // OK
        Laptop laptop = new Laptop("MSI", "Modern 15 H B13M-099RU", 2024, OperationSystem.WINDOWS11, "plastic",
                Color.black);

        DisplayInfo display = new DisplayInfo(15.6f, 1080, 1920, "IPS", 60, true);
        laptop.setDisplay(display);

        // MemoryInfo memory = new MemoryInfo();
        // laptop.setMemory(memory);

        // GraphicProcessorInfo graphicProcessor = new GraphicProcessorInfo();
        // laptop.setGraphicProcessor(graphicProcessor);

        // ProcessorInfo processor = new ProcessorInfo();
        // laptop.setProcessor(processor);

        // CommunicationInfo communication = new CommunicationInfo();
        // laptop.setCommunication(communication);

        // MultimediaInfo multimedia = new MultimediaInfo();
        // laptop.setMultimedia(multimedia);

        // InputDevicesInfo inputDevices = new InputDevicesInfo();
        // laptop.setInputDevices(inputDevices);

        // BatteryInfo battery = new BatteryInfo();
        // laptop.setBattery(battery);

        // SizeInfo size = new SizeInfo();
        // laptop.setSizeInfo(size);

        // laptop.addSlot(null); // ???

        return laptop;
    }
}
