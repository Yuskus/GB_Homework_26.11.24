package lesson6.task1.Objects.Parts;

public class CommunicationInfo {
    public boolean IsWiFi = false;
    public String WiFiType;
    public boolean IsBluetooth = false;
    public Float BluetoothVersion;

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
