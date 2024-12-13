package lesson6.task1.Objects.Parts;

public class CommunicationInfo {
    private boolean IsWiFi = false;
    private String WiFiType;
    private boolean IsBluetooth = false;
    private Float BluetoothVersion;

    public CommunicationInfo() {

    }

    public CommunicationInfo(String wiFiType) {
        WiFiType = wiFiType;
        IsWiFi = true;
    }

    public CommunicationInfo(Float bluetoothVersion) {
        BluetoothVersion = bluetoothVersion;
        IsBluetooth = true;
    }

    public CommunicationInfo(String wiFiType, Float bluetoothVersion) {
        WiFiType = wiFiType;
        IsWiFi = true;
        BluetoothVersion = bluetoothVersion;
        IsBluetooth = true;
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
