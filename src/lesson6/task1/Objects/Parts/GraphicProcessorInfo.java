package lesson6.task1.Objects.Parts;

import lesson6.task1.Objects.Parts.Structures.Brands;

public class GraphicProcessorInfo {
    private Brands Brand;
    private String Model;

    public GraphicProcessorInfo() {
        Brand = Brands.UNKNOWN;
    }

    public GraphicProcessorInfo(Brands brand) {
        Brand = brand;
    }

    public GraphicProcessorInfo(Brands brand, String model) {
        Brand = brand;
        Model = model;
    }

    public Brands getBrand() {
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
