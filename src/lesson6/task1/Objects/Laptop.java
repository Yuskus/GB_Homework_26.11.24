package lesson6.task1.Objects;

import java.util.ArrayList;
import java.util.List;
import lesson6.task1.Objects.Parts.*;
import lesson6.task1.Objects.Parts.Structures.Brands;
import lesson6.task1.Objects.Parts.Structures.Colors;
import lesson6.task1.Objects.Parts.Structures.OperationSystem;
import lesson6.task1.Objects.Parts.Structures.Slots;

public class Laptop {
    private static int UniqId;
    private int Id;
    private Brands Brand;
    private String Model;
    private Integer ReleaseYear;
    private OperationSystem OS = OperationSystem.NONE;
    private String BodyMaterial;
    private Colors Color;
    private DisplayInfo Display;
    private MemoryInfo Memory;
    private GraphicProcessorInfo GraphicProcessor;
    private ProcessorInfo Processor;
    private CommunicationInfo Communication;
    private MultimediaInfo Multimedia;
    private InputDevicesInfo InputDevices;
    private BatteryInfo Battery;
    private SizeInfo Size;
    private List<Slots> SlotsInfo = new ArrayList<>();

    public Laptop(Brands brand, String model) {
        setBrandAndModel(brand, model);
        generateUniqId();
    }

    public Laptop(Brands brand, String model, OperationSystem os) {
        setBrandAndModel(brand, model);
        setOS(os);
        generateUniqId();
    }

    public Laptop(Brands brand, String model, OperationSystem os, String bodyMaterial, Colors color) {
        setBrandAndModel(brand, model);
        setOS(os);
        setMaterialAndColor(bodyMaterial, color);
        generateUniqId();
    }

    public Laptop(Brands brand, String model, Integer releazeYear, OperationSystem os, String bodyMaterial,
            Colors color) {
        setBrandAndModel(brand, model);
        setReleaseYear(releazeYear);
        setOS(os);
        setMaterialAndColor(bodyMaterial, color);
        generateUniqId();
    }

    private synchronized void generateUniqId() {
        UniqId++;
        Id = UniqId;
    }

    public void setBrandAndModel(Brands brand, String model) {
        Brand = brand;
        Model = model;
    }

    public void setReleaseYear(Integer year) {
        ReleaseYear = year;
    }

    public void setOS(OperationSystem os) {
        OS = os;
    }

    public void setMaterialAndColor(String bodyMaterial, Colors color) {
        BodyMaterial = bodyMaterial;
        Color = color;
    }

    public void setDisplay(DisplayInfo display) {
        Display = display;
    }

    public void setMemory(MemoryInfo memory) {
        Memory = memory;
    }

    public void setGraphicProcessor(GraphicProcessorInfo graphicProcessor) {
        GraphicProcessor = graphicProcessor;
    }

    public void setProcessor(ProcessorInfo processor) {
        Processor = processor;
    }

    public void setCommunication(CommunicationInfo communication) {
        Communication = communication;
    }

    public void setMultimedia(MultimediaInfo multimedia) {
        Multimedia = multimedia;
    }

    public void setInputDevices(InputDevicesInfo inputDevices) {
        InputDevices = inputDevices;
    }

    public void setBattery(BatteryInfo battery) {
        Battery = battery;
    }

    public void setSizeInfo(SizeInfo size) {
        Size = size;
    }

    public void addSlot(Slots slot) {
        SlotsInfo.add(slot);
    }

    public void addSlotsRange(List<Slots> slots) {
        for (var slot : slots) {
            SlotsInfo.add(slot);
        }
    }

    public void ClearSlots() {
        SlotsInfo.clear();
    }

    public Integer getId() {
        return Id;
    }

    public Brands getBrand() {
        return Brand;
    }

    public String getModel() {
        return Model;
    }

    public Integer getReleaseYear() {
        return ReleaseYear;
    }

    public OperationSystem getOS() {
        return OS;
    }

    public String getBodyMaterial() {
        return BodyMaterial;
    }

    public Colors getColor() {
        return Color;
    }

    public DisplayInfo getDisplay() {
        return Display;
    }

    public MemoryInfo getMemory() {
        return Memory;
    }

    public GraphicProcessorInfo getGraphicProcessor() {
        return GraphicProcessor;
    }

    public ProcessorInfo getProcessor() {
        return Processor;
    }

    public CommunicationInfo getCommunication() {
        return Communication;
    }

    public MultimediaInfo getMultimedia() {
        return Multimedia;
    }

    public InputDevicesInfo getInputDevices() {
        return InputDevices;
    }

    public BatteryInfo getBattery() {
        return Battery;
    }

    public SizeInfo getSize() {
        return Size;
    }

    public List<Slots> getSlotsInfo() {
        return new ArrayList<Slots>(SlotsInfo);
    }

    public Laptop getCopy() {
        var result = new Laptop(Brand, Model, OS, BodyMaterial, Color);
        result.setDisplay(Display);
        result.setMemory(Memory);
        result.setGraphicProcessor(GraphicProcessor);
        result.setProcessor(Processor);
        result.setCommunication(Communication);
        result.setMultimedia(Multimedia);
        result.setInputDevices(InputDevices);
        result.setBattery(Battery);
        result.setSizeInfo(Size);
        result.addSlotsRange(SlotsInfo);
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("LAPTOP ID: ").append(Id);
        sb.append(", Brand: ").append(Brand);
        sb.append(", Model: ").append(Model);

        if (ReleaseYear != null)
            sb.append(", Release: ").append(ReleaseYear);

        sb.append(", OS: ").append(OS);

        if (Color != null)
            sb.append(", Color").append(Color);
        if (BodyMaterial != null)
            sb.append(", Material: ").append(BodyMaterial);

        if (Display != null)
            sb.append(", Display: ").append(Display);
        if (Memory != null)
            sb.append(", Memory: ").append(Memory);
        if (GraphicProcessor != null)
            sb.append(", Graphic Processor: ").append(GraphicProcessor);
        if (Processor != null)
            sb.append(", Processor: ").append(Processor);
        if (Communication != null)
            sb.append(", Communication: ").append(Communication);
        if (Multimedia != null)
            sb.append(", Multimedia: ").append(Multimedia);
        if (InputDevices != null)
            sb.append(", nputDevices: ").append(InputDevices);
        if (Battery != null)
            sb.append(", Battery: ").append(Battery);
        if (Size != null)
            sb.append(", Size: ").append(Size);

        if (SlotsInfo != null)
            sb.append(", Slots: ").append(SlotsInfo);

        return sb.toString();
    }
}
