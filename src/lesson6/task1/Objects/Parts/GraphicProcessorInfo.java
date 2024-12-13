package lesson6.task1.Objects.Parts;

public class GraphicProcessorInfo {
    private String Brand;
    private String Model;

    public GraphicProcessorInfo() {

    }

    public GraphicProcessorInfo(String brand) {
        Brand = brand;
    }

    public GraphicProcessorInfo(String brand, String model) {
        Brand = brand;
        Model = model;
    }

    public String getBrand() {
        return Brand;
    }

    public String getModel() {
        return Model;
    }

    public GraphicProcessorInfo getCopy() {
        return new GraphicProcessorInfo(Brand, Model);
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
