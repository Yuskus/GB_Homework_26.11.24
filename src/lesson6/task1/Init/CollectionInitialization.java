package lesson6.task1.Init;

import java.awt.Color;
import lesson6.task1.Objects.*;
import lesson6.task1.Objects.Parts.*;
import lesson6.task1.Objects.Parts.Structures.*;

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

        MemoryInfo memory = new MemoryInfo(16, 1024, "SSD");
        laptop.setMemory(memory);

        GraphicProcessorInfo graphicProcessor = new GraphicProcessorInfo("Intel", "UHD Graphics");
        laptop.setGraphicProcessor(graphicProcessor);

        ProcessorInfo processor = new ProcessorInfo("Intel", "Core i5 12450H", 8, 2f, 4.4f, 4, 4, 12);
        laptop.setProcessor(processor);

        CommunicationInfo communication = new CommunicationInfo("802.11 a/b/g/n/ac/ax", 5.1f);
        laptop.setCommunication(communication);

        MultimediaInfo multimedia = new MultimediaInfo(0.9f, true, 2);
        laptop.setMultimedia(multimedia);

        InputDevicesInfo inputDevices = new InputDevicesInfo(Color.black, KeyboardLanguages.EN_RU, true, true, false,
                true);
        laptop.setInputDevices(inputDevices);

        BatteryInfo battery = new BatteryInfo("Li-Pol", 56, true);
        laptop.setBattery(battery);

        SizeInfo size = new SizeInfo(new Vector3(356.7f, 248.7f, 17f), 1.72f, new Vector3(520f, 320f, 61f), 2.5f);
        laptop.setSizeInfo(size);

        laptop.addSlot(Slots.TRRS_MINI_JACK);
        laptop.addSlot(Slots.HDMI);
        laptop.addSlot(Slots.USB_2_0_TypeA);
        laptop.addSlot(Slots.USB_3_0_TypeA);
        laptop.addSlot(Slots.USB_3_0_TypeC);

        return laptop;
    }

    private Laptop CreateHuaweiMatebook14() { // OK
        Laptop laptop = new Laptop("Huawei", "MateBook D 14", 2024, OperationSystem.NONE, "metall", Color.gray);

        DisplayInfo display = new DisplayInfo(14f, 1080, 1920, "IPS", 60, true);
        laptop.setDisplay(display);

        MemoryInfo memory = new MemoryInfo(16, 512, "SSD");
        laptop.setMemory(memory);

        GraphicProcessorInfo graphicProcessor = new GraphicProcessorInfo("Intel", "UHD Graphics");
        laptop.setGraphicProcessor(graphicProcessor);

        ProcessorInfo processor = new ProcessorInfo("Intel", "Core i5 12450H", 8, 2f, 4.4f, 4, 4, 12);
        laptop.setProcessor(processor);

        CommunicationInfo communication = new CommunicationInfo("802.11 a/b/g/n/ac/ax", 5.1f);
        laptop.setCommunication(communication);

        MultimediaInfo multimedia = new MultimediaInfo(0.9f, true, 2);
        laptop.setMultimedia(multimedia);

        InputDevicesInfo inputDevices = new InputDevicesInfo(Color.black, KeyboardLanguages.EN_RU, false, true, false,
                true);
        laptop.setInputDevices(inputDevices);

        BatteryInfo battery = new BatteryInfo("Li-Pol", 56, true);
        laptop.setBattery(battery);

        SizeInfo size = new SizeInfo(new Vector3(322.5f, 214.8f, 15.9f), 1.38f, new Vector3(475f, 280f, 70f), 2.5f);
        laptop.setSizeInfo(size);

        laptop.addSlot(Slots.TRRS_MINI_JACK);
        laptop.addSlot(Slots.HDMI);
        laptop.addSlot(Slots.USB_2_0_TypeA);
        laptop.addSlot(Slots.USB_3_0_TypeA);
        laptop.addSlot(Slots.USB_3_0_TypeC);

        return laptop;
    }

    private Laptop CreateAppleMacbookPro() { // OK
        Laptop laptop = new Laptop("Apple", "MacBook Pro A2780", 2023, OperationSystem.MAC_OS, "aluminum", Color.gray);

        DisplayInfo display = new DisplayInfo(16.2f, 2234, 3456, "IPS", 120, false);
        laptop.setDisplay(display);

        MemoryInfo memory = new MemoryInfo(16, 1024, "SSD");
        laptop.setMemory(memory);

        GraphicProcessorInfo graphicProcessor = new GraphicProcessorInfo("Apple");
        laptop.setGraphicProcessor(graphicProcessor);

        ProcessorInfo processor = new ProcessorInfo("Apple", "M2 Pro 12 core", 12, 3.49f, 3.49f, 4, 8, 12);
        laptop.setProcessor(processor);

        CommunicationInfo communication = new CommunicationInfo("802.11 a/b/g/n/ac/ax", 5.3f);
        laptop.setCommunication(communication); 

        MultimediaInfo multimedia = new MultimediaInfo(2f, true, 3);
        laptop.setMultimedia(multimedia);

        InputDevicesInfo inputDevices = new InputDevicesInfo(Color.black, KeyboardLanguages.EN_RU, false, true, true,
                false);
        laptop.setInputDevices(inputDevices);

        BatteryInfo battery = new BatteryInfo("Li-Pol", 70, false);
        laptop.setBattery(battery);

        SizeInfo size = new SizeInfo(new Vector3(355.7f, 248.1f, 16.8f), 2.15f, new Vector3(445f, 335f, 80f), 3.5f);
        laptop.setSizeInfo(size);

        laptop.addSlot(Slots.TRS_MINI_JACK); //Thunderbolt 4 - 4
        laptop.addSlot(Slots.HDMI);
        laptop.addSlot(Slots.THUNDERBOLT_4);
        laptop.addSlot(Slots.THUNDERBOLT_4);
        laptop.addSlot(Slots.THUNDERBOLT_4);
        laptop.addSlot(Slots.THUNDERBOLT_4);

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
