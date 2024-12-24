package lesson6.task1.Objects.Parts;

public class DisplayInfo {
    private Float Diagonal;
    private Integer HeigthPx;
    private Integer WeigthPx;
    private Integer PPI;
    private String Matrix;
    private Integer RefreshRateHz;
    private boolean IsSurfaceMatte;

    public DisplayInfo(Float diagonal, Integer heigthPx, Integer weigthPx) {
        this(diagonal, heigthPx, weigthPx, null, null, true);
    }

    public DisplayInfo(Float diagonal, Integer heigthPx, Integer weigthPx, String matrix) {
        this(diagonal, heigthPx, weigthPx, matrix, null, true);
    }

    public DisplayInfo(Float diagonal, Integer heigthPx, Integer weigthPx, String matrix, Integer refreshRateHz) {
        this(diagonal, heigthPx, weigthPx, matrix, refreshRateHz, true);
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

    public static int CountPPI(Float diagonal, Integer heigthPx, Integer weigthPx) {
        return (int) (Math.sqrt((weigthPx * weigthPx) + (heigthPx * heigthPx)) / diagonal);
    }

    public Float getDiagonal() {
        return Diagonal;
    }

    public Integer getHeigthPx() {
        return HeigthPx;
    }

    public Integer getWeigthPx() {
        return WeigthPx;
    }

    public Integer getPPI() {
        return PPI;
    }

    public String getMatrix() {
        return Matrix;
    }

    public Integer getRefreshRateHz() {
        return RefreshRateHz;
    }

    public boolean getIsSurfaceMatte() {
        return IsSurfaceMatte;
    }

    public DisplayInfo getCopy() {
        return new DisplayInfo(Diagonal, HeigthPx, WeigthPx, Matrix, RefreshRateHz, IsSurfaceMatte);
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
