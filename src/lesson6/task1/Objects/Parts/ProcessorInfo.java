package lesson6.task1.Objects.Parts;

public class ProcessorInfo {
    private String Brand;
    private String Model;
    private Float MiddleFrequency;
    private Float MaxFrequency;
    private Integer AllCores;
    private Integer EnergyEfficientCores;
    private Integer HighPerformanceCores;
    private Integer MaxThreads;

    public ProcessorInfo(String brand, String model) {
        Brand = brand;
        Model = model;
    }

    public ProcessorInfo(String brand, String model, Integer allCores) {
        Brand = brand;
        Model = model;
        AllCores = allCores;
    }

    public ProcessorInfo(String brand, String model, Integer allCores, Float middleFrequency, Float maxFrequency) {
        Brand = brand;
        Model = model;
        AllCores = allCores;
        MiddleFrequency = middleFrequency;
        MaxFrequency = maxFrequency;
    }

    public ProcessorInfo(String brand, String model, Integer allCores, Float middleFrequency, Float maxFrequency,
            Integer energyEfficientCores, Integer highPerformanceCores) {
        Brand = brand;
        Model = model;
        AllCores = allCores;
        MiddleFrequency = middleFrequency;
        MaxFrequency = maxFrequency;
        EnergyEfficientCores = energyEfficientCores;
        HighPerformanceCores = highPerformanceCores;
    }

    public ProcessorInfo(String brand, String model, Integer allCores, Float middleFrequency, Float maxFrequency,
            Integer energyEfficientCores, Integer highPerformanceCores, Integer maxThreads) {
        Brand = brand;
        Model = model;
        AllCores = allCores;
        MiddleFrequency = middleFrequency;
        MaxFrequency = maxFrequency;
        EnergyEfficientCores = energyEfficientCores;
        HighPerformanceCores = highPerformanceCores;
        MaxThreads = maxThreads;
    }

    public String getBrand() {
        return Brand;
    }

    public String getModel() {
        return Model;
    }

    public Float getMidFreq() {
        return MiddleFrequency;
    }

    public Float getMaxFreq() {
        return MaxFrequency;
    }

    public Integer getAllCores() {
        return AllCores;
    }

    public Integer getEnergyEfficientCores() {
        return EnergyEfficientCores;
    }

    public Integer getHighPerformanceCores() {
        return HighPerformanceCores;
    }

    public Integer getMaxThreads() {
        return MaxThreads;
    }

    public ProcessorInfo getCopy() {
        return new ProcessorInfo(Brand, Model, AllCores, MiddleFrequency, MaxFrequency, EnergyEfficientCores,
                HighPerformanceCores, MaxThreads);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Brand: " + Brand + ", Model: " + Model);

        if (AllCores != null)
            sb.append(", Cores: " + AllCores);

        if (MiddleFrequency != null)
            sb.append(", Middle Frequency: " + MiddleFrequency);

        if (MaxFrequency != null)
            sb.append(", Max Frequency: " + MaxFrequency);

        if (EnergyEfficientCores != null)
            sb.append(", Energy Efficient Cores: " + EnergyEfficientCores);

        if (HighPerformanceCores != null)
            sb.append(", High Performance Cores: " + HighPerformanceCores);

        if (MaxThreads != null)
            sb.append(", Max Threads: " + MaxThreads);

        return sb.toString();
    }
}