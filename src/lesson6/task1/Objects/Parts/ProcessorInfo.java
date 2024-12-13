package lesson6.task1.Objects.Parts;

public class ProcessorInfo {
    public String Brand;
    public String Model;
    public Float MiddleFrequency;
    public Float MaxFrequency;
    public Integer AllCores;
    public Integer EnergyEfficientCores;
    public Integer HighPerformanceCores;
    public Integer MaxThreads;

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
