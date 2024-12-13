package lesson6.task1.Objects.Parts.Structures;

public class Vector3 {
    private final Float X;
    private final Float Y;
    private final Float Z;

    public Vector3(Float x, Float y, Float z) {
        X = x;
        Y = y;
        Z = z;
    }

    public Float GetX() {
        return X;
    }

    public Float GetY() {
        return Y;
    }

    public Float GetZ() {
        return Z;
    }

    @Override
    public String toString() {
        return "[ " + X + " x " + Y + " x " + Z + " ]";
    }
}
