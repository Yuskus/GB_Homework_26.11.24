package lesson6.task1.Init;

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

    private Laptop CreateHuaweiMatebook16() {
        Laptop laptop = new Laptop(Brands.HUAWEI, "MateBook D 16", 2023, OperationSystem.NONE, "metall", Colors.GRAY);

        DisplayInfo display = new DisplayInfo(16f, 1200, 1920, "IPS", 60, true);
        laptop.setDisplay(display);

        MemoryInfo memory = new MemoryInfo(16, 1024, "SSD");
        laptop.setMemory(memory);

        GraphicProcessorInfo graphicProcessor = new GraphicProcessorInfo(Brands.INTEL, "UHD Graphics");
        laptop.setGraphicProcessor(graphicProcessor);

        ProcessorInfo processor = new ProcessorInfo(Brands.INTEL, "Core i5 12450H", 8, 2f, 4.4f, 4, 4, 12);
        laptop.setProcessor(processor);

        CommunicationInfo communication = new CommunicationInfo("802.11 a/b/g/n/ac/ax", 5.1f);
        laptop.setCommunication(communication);

        MultimediaInfo multimedia = new MultimediaInfo(0.9f, true, 2);
        laptop.setMultimedia(multimedia);

        InputDevicesInfo inputDevices = new InputDevicesInfo(Colors.BLACK, KeyboardLanguages.EN_RU, true, true, true,
                true);
        laptop.setInputDevices(inputDevices);

        BatteryInfo battery = new BatteryInfo(BatteryTypes.LI_POL, 56, true);
        laptop.setBattery(battery);

        SizeInfo size = new SizeInfo(new Vector3(356.7f, 248.7f, 17f), 1.72f, new Vector3(520f, 320f, 61f), 2.5f);
        laptop.setSizeInfo(size);

        laptop.addSlot(Slots.USB_2_0_TypeA);
        laptop.addSlot(Slots.USB_3_0_TypeA);
        laptop.addSlot(Slots.USB_3_0_TypeC);
        laptop.addSlot(Slots.HDMI);
        laptop.addSlot(Slots.TRRS_MINI_JACK);

        return laptop;
    }

    private Laptop CreateHuaweiMatebook14() {
        Laptop laptop = new Laptop(Brands.HUAWEI, "MateBook D 14", 2024, OperationSystem.NONE, "metall", Colors.GRAY);

        DisplayInfo display = new DisplayInfo(14f, 1080, 1920, "IPS", 60, true);
        laptop.setDisplay(display);

        MemoryInfo memory = new MemoryInfo(16, 512, "SSD");
        laptop.setMemory(memory);

        GraphicProcessorInfo graphicProcessor = new GraphicProcessorInfo(Brands.INTEL, "UHD Graphics");
        laptop.setGraphicProcessor(graphicProcessor);

        ProcessorInfo processor = new ProcessorInfo(Brands.INTEL, "Core i5 12450H", 8, 2f, 4.4f, 4, 4, 12);
        laptop.setProcessor(processor);

        CommunicationInfo communication = new CommunicationInfo("802.11 a/b/g/n/ac/ax", 5.1f);
        laptop.setCommunication(communication);

        MultimediaInfo multimedia = new MultimediaInfo(0.9f, true, 2);
        laptop.setMultimedia(multimedia);

        InputDevicesInfo inputDevices = new InputDevicesInfo(Colors.BLACK, KeyboardLanguages.EN_RU, false, true, false,
                true);
        laptop.setInputDevices(inputDevices);

        BatteryInfo battery = new BatteryInfo(BatteryTypes.LI_POL, 56, true);
        laptop.setBattery(battery);

        SizeInfo size = new SizeInfo(new Vector3(322.5f, 214.8f, 15.9f), 1.38f, new Vector3(475f, 280f, 70f), 2.5f);
        laptop.setSizeInfo(size);

        laptop.addSlot(Slots.USB_2_0_TypeA);
        laptop.addSlot(Slots.USB_3_0_TypeA);
        laptop.addSlot(Slots.USB_3_0_TypeC);
        laptop.addSlot(Slots.HDMI);
        laptop.addSlot(Slots.TRRS_MINI_JACK);

        return laptop;
    }

    private Laptop CreateAppleMacbookPro() {
        Laptop laptop = new Laptop(Brands.APPLE, "MacBook Pro A2780", 2023, OperationSystem.MAC_OS, "aluminum",
                Colors.GRAY);

        DisplayInfo display = new DisplayInfo(16.2f, 2234, 3456, "IPS", 120, false);
        laptop.setDisplay(display);

        MemoryInfo memory = new MemoryInfo(16, 1024, "SSD");
        laptop.setMemory(memory);

        GraphicProcessorInfo graphicProcessor = new GraphicProcessorInfo(Brands.APPLE);
        laptop.setGraphicProcessor(graphicProcessor);

        ProcessorInfo processor = new ProcessorInfo(Brands.APPLE, "M2 Pro 12 core", 12, 3.49f, 3.49f, 4, 8, 12);
        laptop.setProcessor(processor);

        CommunicationInfo communication = new CommunicationInfo("802.11 a/b/g/n/ac/ax", 5.3f);
        laptop.setCommunication(communication);

        MultimediaInfo multimedia = new MultimediaInfo(2f, true, 3);
        laptop.setMultimedia(multimedia);

        InputDevicesInfo inputDevices = new InputDevicesInfo(Colors.BLACK, KeyboardLanguages.EN_RU, false, true, true,
                false);
        laptop.setInputDevices(inputDevices);

        BatteryInfo battery = new BatteryInfo(BatteryTypes.LI_POL, 70, false);
        laptop.setBattery(battery);

        SizeInfo size = new SizeInfo(new Vector3(355.7f, 248.1f, 16.8f), 2.15f, new Vector3(445f, 335f, 80f), 3.5f);
        laptop.setSizeInfo(size);

        laptop.addSlot(Slots.THUNDERBOLT_4);
        laptop.addSlot(Slots.THUNDERBOLT_4);
        laptop.addSlot(Slots.THUNDERBOLT_4);
        laptop.addSlot(Slots.THUNDERBOLT_4);
        laptop.addSlot(Slots.HDMI);

        return laptop;
    }

    private Laptop CreateHonorMagicbook14() {
        Laptop laptop = new Laptop(Brands.HONOR, "MagicBook 14 NMH-WDQ9HN", 2021, OperationSystem.FREE_DOS, "metall",
                Colors.GRAY);

        DisplayInfo display = new DisplayInfo(14f, 1080, 1920, "IPS", 60, true);
        laptop.setDisplay(display);

        MemoryInfo memory = new MemoryInfo(8, 512, "SSD");
        laptop.setMemory(memory);

        GraphicProcessorInfo graphicProcessor = new GraphicProcessorInfo(Brands.AMD, "Radeon");
        laptop.setGraphicProcessor(graphicProcessor);

        ProcessorInfo processor = new ProcessorInfo(Brands.AMD, "Ryzen 5 5500U", 6, 2.1f, 4.0f, 0, 6, 12);
        laptop.setProcessor(processor);

        CommunicationInfo communication = new CommunicationInfo("802.11 a/b/g/n/ac/ax", 5.1f);
        laptop.setCommunication(communication);

        MultimediaInfo multimedia = new MultimediaInfo(0.9f, true, 2);
        laptop.setMultimedia(multimedia);

        InputDevicesInfo inputDevices = new InputDevicesInfo(Colors.BLACK, KeyboardLanguages.EN_RU, false, true, true,
                true);
        laptop.setInputDevices(inputDevices);

        BatteryInfo battery = new BatteryInfo(BatteryTypes.LI_POL, 56, true);
        laptop.setBattery(battery);

        SizeInfo size = new SizeInfo(new Vector3(322.5f, 214.8f, 15.9f), 1.38f, new Vector3(425f, 300f, 86f), 2.1f);
        laptop.setSizeInfo(size);

        laptop.addSlot(Slots.USB_2_0_TypeA);
        laptop.addSlot(Slots.USB_3_0_TypeA);
        laptop.addSlot(Slots.USB_3_0_TypeC);
        laptop.addSlot(Slots.HDMI);
        laptop.addSlot(Slots.TRRS_MINI_JACK);

        return laptop;
    }

    private Laptop CreateAsusVivobook() {
        Laptop laptop = new Laptop(Brands.ASUS, "VivoBook X1502ZA-BQ2345", 2022, OperationSystem.NONE, "plastic",
                Colors.BLUE);

        DisplayInfo display = new DisplayInfo(15.6f, 1080, 1920, "IPS", 60, true);
        laptop.setDisplay(display);

        MemoryInfo memory = new MemoryInfo(16, 512, "SSD");
        laptop.setMemory(memory);

        GraphicProcessorInfo graphicProcessor = new GraphicProcessorInfo(Brands.INTEL, "Iris Xe graphics");
        laptop.setGraphicProcessor(graphicProcessor);

        ProcessorInfo processor = new ProcessorInfo(Brands.INTEL, "Core i7 12700H", 14, 2.3f, 4.7f, 8, 6, 20);
        laptop.setProcessor(processor);

        CommunicationInfo communication = new CommunicationInfo("802.11 a/b/g/n/ac/ax", 5.3f);
        laptop.setCommunication(communication);

        MultimediaInfo multimedia = new MultimediaInfo(0.9f, true, 1);
        laptop.setMultimedia(multimedia);

        InputDevicesInfo inputDevices = new InputDevicesInfo(Colors.BLACK, KeyboardLanguages.EN_RU, true, true, true,
                false);
        laptop.setInputDevices(inputDevices);

        BatteryInfo battery = new BatteryInfo(BatteryTypes.LI_ION, 42, false);
        laptop.setBattery(battery);

        SizeInfo size = new SizeInfo(new Vector3(359.7f, 232.5f, 19.9f), 1.7f, new Vector3(480f, 285f, 70f), 3f);
        laptop.setSizeInfo(size);

        laptop.addSlot(Slots.USB_2_0_TypeA);
        laptop.addSlot(Slots.USB_3_0_TypeA);
        laptop.addSlot(Slots.USB_3_0_TypeA);
        laptop.addSlot(Slots.USB_3_0_TypeC);
        laptop.addSlot(Slots.HDMI);
        laptop.addSlot(Slots.TRRS_MINI_JACK);

        return laptop;
    }

    private Laptop CreateAcerExtensa15() {
        Laptop laptop = new Laptop(Brands.ACER, "Extensa 15 EX215-23-R62L", 2022, OperationSystem.NONE, "plastic",
                Colors.GRAY);

        DisplayInfo display = new DisplayInfo(15.6f, 1080, 1920, "IPS", 60, true);
        laptop.setDisplay(display);

        MemoryInfo memory = new MemoryInfo(16, 512, "SSD");
        laptop.setMemory(memory);

        GraphicProcessorInfo graphicProcessor = new GraphicProcessorInfo(Brands.AMD, "Radeon");
        laptop.setGraphicProcessor(graphicProcessor);

        ProcessorInfo processor = new ProcessorInfo(Brands.AMD, "Ryzen 3 7320U", 4, 2.4f, 4.1f, 0, 4, 8);
        laptop.setProcessor(processor);

        CommunicationInfo communication = new CommunicationInfo("802.11 a/b/g/n/ac/ax", 5.2f);
        laptop.setCommunication(communication);

        MultimediaInfo multimedia = new MultimediaInfo(0.9f, true, 2);
        laptop.setMultimedia(multimedia);

        InputDevicesInfo inputDevices = new InputDevicesInfo(Colors.BLACK, KeyboardLanguages.EN_RU, true, true, false,
                false);
        laptop.setInputDevices(inputDevices);

        BatteryInfo battery = new BatteryInfo(BatteryTypes.LI_ION, 40, false);
        laptop.setBattery(battery);

        SizeInfo size = new SizeInfo(new Vector3(362.9f, 237.5f, 18.9f), 1.78f, new Vector3(500f, 310f, 70f), 3.3f);
        laptop.setSizeInfo(size);

        laptop.addSlot(Slots.USB_3_0_TypeA);
        laptop.addSlot(Slots.USB_3_0_TypeA);
        laptop.addSlot(Slots.USB_3_0_TypeC);
        laptop.addSlot(Slots.HDMI);
        laptop.addSlot(Slots.TRRS_MINI_JACK);

        return laptop;
    }

    private Laptop CreateHP15s() {
        Laptop laptop = new Laptop(Brands.HP, "15s-fq5035ny", 2022, OperationSystem.FREE_DOS, "plastic", Colors.BLACK);

        DisplayInfo display = new DisplayInfo(15.6f, 1080, 1920, "IPS", 60, true);
        laptop.setDisplay(display);

        MemoryInfo memory = new MemoryInfo(8, 512, "SSD");
        laptop.setMemory(memory);

        GraphicProcessorInfo graphicProcessor = new GraphicProcessorInfo(Brands.INTEL, "Iris Xe graphics");
        laptop.setGraphicProcessor(graphicProcessor);

        ProcessorInfo processor = new ProcessorInfo(Brands.INTEL, "Core i7 1255U", 10, 1.7f, 4.7f, 8, 2, 12);
        laptop.setProcessor(processor);

        CommunicationInfo communication = new CommunicationInfo("802.11 a/b/g/n/ac", 4.2f);
        laptop.setCommunication(communication);

        MultimediaInfo multimedia = new MultimediaInfo(0.9f, true, 2);
        laptop.setMultimedia(multimedia);

        InputDevicesInfo inputDevices = new InputDevicesInfo(Colors.BLACK, KeyboardLanguages.EN_RU, true, true, false,
                false);
        laptop.setInputDevices(inputDevices);

        BatteryInfo battery = new BatteryInfo(BatteryTypes.LI_ION, 41, false);
        laptop.setBattery(battery);

        SizeInfo size = new SizeInfo(new Vector3(358.5f, 242f, 17.9f), 1.69f, new Vector3(480f, 305f, 67f), 3.2f);
        laptop.setSizeInfo(size);

        laptop.addSlot(Slots.USB_3_0_TypeA);
        laptop.addSlot(Slots.USB_3_0_TypeA);
        laptop.addSlot(Slots.USB_3_0_TypeC);
        laptop.addSlot(Slots.HDMI);
        laptop.addSlot(Slots.TRRS_MINI_JACK);

        return laptop;
    }

    private Laptop CreateMSImodern15H() {
        Laptop laptop = new Laptop(Brands.MSI, "Modern 15 H B13M-099RU", 2024, OperationSystem.WINDOWS11, "plastic",
                Colors.BLACK);

        DisplayInfo display = new DisplayInfo(15.6f, 1080, 1920, "IPS", 60, true);
        laptop.setDisplay(display);

        MemoryInfo memory = new MemoryInfo(16, 512, "SSD");
        laptop.setMemory(memory);

        GraphicProcessorInfo graphicProcessor = new GraphicProcessorInfo(Brands.INTEL, "Iris Xe graphics");
        laptop.setGraphicProcessor(graphicProcessor);

        ProcessorInfo processor = new ProcessorInfo(Brands.INTEL, "Core i7 13700H", 14, 2.4f, 5f, 8, 6, 20);
        laptop.setProcessor(processor);

        CommunicationInfo communication = new CommunicationInfo("802.11 a/b/g/n/ac/ax", 5.3f);
        laptop.setCommunication(communication);

        MultimediaInfo multimedia = new MultimediaInfo(0.9f, true, 1);
        laptop.setMultimedia(multimedia);

        InputDevicesInfo inputDevices = new InputDevicesInfo(Colors.BLACK, KeyboardLanguages.EN_RU, true, true, true,
                false);
        laptop.setInputDevices(inputDevices);

        BatteryInfo battery = new BatteryInfo(BatteryTypes.LI_POL, 53, true);
        laptop.setBattery(battery);

        SizeInfo size = new SizeInfo(new Vector3(359f, 241f, 19.9f), 1.9f, new Vector3(470f, 300f, 80f), 3.06f);
        laptop.setSizeInfo(size);

        laptop.addSlot(Slots.USB_3_1_TypeA);
        laptop.addSlot(Slots.USB_3_1_TypeA);
        laptop.addSlot(Slots.USB_3_1_TypeA);
        laptop.addSlot(Slots.USB_3_1_TypeC);
        laptop.addSlot(Slots.HDMI);
        laptop.addSlot(Slots.TRRS_MINI_JACK);

        return laptop;
    }
}
