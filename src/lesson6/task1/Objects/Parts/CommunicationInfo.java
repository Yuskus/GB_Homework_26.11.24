package lesson6.task1.Objects.Parts;

public class CommunicationInfo {
    private boolean IsWiFi;
    private String WiFiType;
    private boolean IsBluetooth;
    private Float BluetoothVersion;

    public CommunicationInfo() {

    }

    public CommunicationInfo(String wiFiType) {
        setWiFiType(wiFiType);
    }

    public CommunicationInfo(Float bluetoothVersion) {
        setBluetoothVersion(bluetoothVersion);
    }

    public CommunicationInfo(String wiFiType, Float bluetoothVersion) {
        setWiFiType(wiFiType);
        setBluetoothVersion(bluetoothVersion);
    }

    private void setBluetoothVersion(Float bluetoothVersion) {
        BluetoothVersion = bluetoothVersion;
        IsBluetooth = bluetoothVersion != null;
    }

    private void setWiFiType(String wiFiType) {
        WiFiType = wiFiType;
        IsWiFi = wiFiType != null;
    }

    public boolean getIsWiFi() {
        return IsWiFi;
    }

    public String getWiFiType() {
        return WiFiType;
    }

    public boolean getIsBluetooth() {
        return IsBluetooth;
    }

    public Float getBluetoothVersion() {
        return BluetoothVersion;
    }

    public CommunicationInfo getCopy() {
        return new CommunicationInfo(WiFiType, BluetoothVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (IsWiFi) {
            sb.append("WiFi: " + WiFiType);
        }
        if (IsBluetooth) {
            sb.append(sb.isEmpty() ? ", Bluetooth: " : " Bluetooth: ")
                    .append(BluetoothVersion)
                    .append(' ');
        }
        return sb.toString();
    }
}
