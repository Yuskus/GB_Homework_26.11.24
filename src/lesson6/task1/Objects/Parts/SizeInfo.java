package lesson6.task1.Objects.Parts;

import lesson6.task1.Objects.Parts.Structures.Vector3;

public class SizeInfo {
    private Vector3 VolumeNetto;
    private Vector3 VolumeBrutto;
    private Float WeigthNetto;
    private Float WeigthBrutto;

    public SizeInfo(Vector3 volumeNetto) {
        VolumeNetto = volumeNetto;
    }

    public SizeInfo(Vector3 volumeNetto, Float weigthNetto) {
        this(volumeNetto, weigthNetto, null, null);
    }

    public SizeInfo(Vector3 volumeNetto, Vector3 volumeBrutto) {
        this(volumeNetto, null, volumeBrutto, null);
    }

    public SizeInfo(Vector3 volumeNetto, Float weigthNetto, Vector3 volumeBrutto) {
        this(volumeNetto, weigthNetto, volumeBrutto, null);
    }

    public SizeInfo(Vector3 volumeNetto, Float weigthNetto, Vector3 volumeBrutto, Float weigthBrutto) {
        VolumeNetto = volumeNetto;
        WeigthNetto = weigthNetto;
        VolumeBrutto = volumeBrutto;
        WeigthBrutto = weigthBrutto;
    }

    public Vector3 getVolumeNetto() {
        return VolumeNetto;
    }

    public Vector3 getVolumeBrutto() {
        return VolumeBrutto;
    }

    public Float getWeigthNetto() {
        return WeigthNetto;
    }

    public Float getWeigthBrutto() {
        return WeigthBrutto;
    }

    public SizeInfo getCopy() {
        return new SizeInfo(VolumeNetto, WeigthNetto, VolumeBrutto, WeigthBrutto);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Volume Netto: " + VolumeNetto);

        if (VolumeBrutto != null)
            sb.append("Volume Brutto: " + VolumeBrutto);

        if (WeigthNetto != null)
            sb.append("Weigth Netto: " + WeigthNetto);

        if (WeigthBrutto != null)
            sb.append("Weigth Brutto: " + WeigthBrutto);

        return sb.toString();
    }
}
