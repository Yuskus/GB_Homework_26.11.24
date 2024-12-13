package lesson6.task1.Objects.Parts;

public class DisplayInfo {
    public Float Diagonal;
    public Integer HeigthPx;
    public Integer WeigthPx;
    public Integer PPI;
    public String Matrix;
    public Integer RefreshRateHz;
    public boolean IsSurfaceMatte = true;

    public DisplayInfo(Float diagonal, Integer heigthPx, Integer weigthPx) {
        Diagonal = diagonal;
        HeigthPx = heigthPx;
        WeigthPx = weigthPx;
        PPI = CountPPI(diagonal, heigthPx, weigthPx);
    }

    public DisplayInfo(Float diagonal, Integer heigthPx, Integer weigthPx, String matrix) {
        Diagonal = diagonal;
        HeigthPx = heigthPx;
        WeigthPx = weigthPx;
        PPI = CountPPI(diagonal, heigthPx, weigthPx);
        Matrix = matrix;
    }

    public DisplayInfo(Float diagonal, Integer heigthPx, Integer weigthPx, String matrix, Integer refreshRateHz) {
        Diagonal = diagonal;
        HeigthPx = heigthPx;
        WeigthPx = weigthPx;
        PPI = CountPPI(diagonal, heigthPx, weigthPx);
        Matrix = matrix;
        RefreshRateHz = refreshRateHz;
    }

    public DisplayInfo(Float diagonal, Integer heigthPx, Integer weigthPx, String matrix, Integer refreshRateHz,
            boolean isSurfaceMatte) {
        Diagonal = diagonal;
        HeigthPx = heigthPx;
        WeigthPx = weigthPx;
        PPI = CountPPI(diagonal, heigthPx, weigthPx);
        Matrix = matrix;
        RefreshRateHz = refreshRateHz;
        IsSurfaceMatte = isSurfaceMatte;
    }

    int CountPPI(Float diagonal, Integer heigthPx, Integer weigthPx) {
        return (int) (Math.sqrt((weigthPx * weigthPx) + (heigthPx * heigthPx)) / diagonal);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Diagonal: ").append(Diagonal).append("\", ");
        sb.append("Size: ").append(WeigthPx).append('x').append(HeigthPx).append(", ");
        sb.append("PPI: ").append(PPI).append(", ");

        if (Matrix != null)
            sb.append("Matrix: ").append(Matrix).append(", ");

        if (RefreshRateHz != null)
            sb.append("RateHz: ").append(RefreshRateHz).append("Hz, ");

        if (IsSurfaceMatte)
            sb.append("Surface: Matte ");
        else
            sb.append("Surface: Glossy ");

        return sb.toString();
    }
}
