package lesson6.task1.Objects.Parts;

public class GraphicProcessorInfo {
    public String Brand;
    public String Model;

    public GraphicProcessorInfo() {

    }

    public GraphicProcessorInfo(String brand) {
        Brand = brand;
    }

    public GraphicProcessorInfo(String brand, String model) {
        Brand = brand;
        Model = model;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (Brand != null)
            sb.append("Brand: ")
                    .append(Brand);
        if (Model != null)
            sb.append(", Model: ")
                    .append(Model)
                    .append(' ');

        return sb.toString();
    }
}
