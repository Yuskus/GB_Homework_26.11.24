package lesson6.task1.Objects.Parts;

import lesson6.task1.Objects.Parts.Structures.Vector3;

public class SizeInfo {
    public Vector3 VolumeNetto;
    public Vector3 VolumeBrutto;
    public Float WeigthNetto;
    public Float WeigthBrutto;

    public SizeInfo(Vector3 volumeNetto) {
        VolumeNetto = volumeNetto;
    }

    public SizeInfo(Vector3 volumeNetto, Float weigthNetto) {
        VolumeNetto = volumeNetto;
        WeigthNetto = weigthNetto;
    }

    public SizeInfo(Vector3 volumeNetto, Vector3 volumeBrutto) {
        VolumeNetto = volumeNetto;
        VolumeBrutto = volumeBrutto;
    }

    public SizeInfo(Vector3 volumeNetto, Float weigthNetto, Vector3 volumeBrutto) {
        VolumeNetto = volumeNetto;
        WeigthNetto = weigthNetto;
        VolumeBrutto = volumeBrutto;
    }

    public SizeInfo(Vector3 volumeNetto, Float weigthNetto, Vector3 volumeBrutto, Float weigthBrutto) {
        VolumeNetto = volumeNetto;
        WeigthNetto = weigthNetto;
        VolumeBrutto = volumeBrutto;
        WeigthBrutto = weigthBrutto;
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
