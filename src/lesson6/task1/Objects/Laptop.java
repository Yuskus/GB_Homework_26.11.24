package lesson6.task1.Objects;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import lesson6.task1.Objects.Parts.*;
import lesson6.task1.Objects.Parts.Structures.OperationSystem;
import lesson6.task1.Objects.Parts.Structures.Slots;

public class Laptop {
    public String Brand;
    public String Model;
    public Integer ReleaseYear;
    public OperationSystem OS = OperationSystem.NONE;
    public String BodyMaterial;
    public Color Color;
    public DisplayInfo Display;
    public MemoryInfo Memory;
    public GraphicProcessorInfo GraphicProcessor;
    public ProcessorInfo Processor;
    public CommunicationInfo Communication;
    public MultimediaInfo Multimedia;
    public InputDevicesInfo InputDevices;
    public BatteryInfo Battery;
    public SizeInfo Size;
    public List<Slots> SlotsInfo = new ArrayList<>();

    public Laptop() {

    }

    public Laptop(String brand, String model) {
        setBrandAndModel(brand, model);
    }

    public Laptop(String brand, String model, OperationSystem os) {
        setBrandAndModel(brand, model);
        setOS(os);
    }

    public Laptop(String brand, String model, OperationSystem os, String bodyMaterial, Color color) {
        setBrandAndModel(brand, model);
        setOS(os);
        setMaterialAndColor(bodyMaterial, color);
    }

    public void setBrandAndModel(String brand, String model) {
        Brand = brand;
        Model = model;
    }

    public void setReleaseYear(Integer year) {
        ReleaseYear = year;
    }

    public void setOS(OperationSystem os) {
        OS = os;
    }

    public void setMaterialAndColor(String bodyMaterial, Color color) {
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

    public String getBrand() {
        return Brand;
    }

    public String getModel() {
        return Model;
    }

    public OperationSystem getOS() {
        return OS;
    }

    public String getBodyMaterial() {
        return BodyMaterial;
    }

    public Color getColor() {
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

    public Laptop GetCopy() {
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
}
