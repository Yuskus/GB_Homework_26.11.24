package lesson6.task1.Objects.Parts;

public class BatteryInfo {
    private String Type;
    private Integer PowerWH;
    private boolean IsSpeedCharge = false;

    public BatteryInfo() {

    }

    public BatteryInfo(String type, Integer powerWH) {
        Type = type;
        PowerWH = powerWH;
    }

    public BatteryInfo(String type, Integer powerWH, boolean isSpeedCharge) {
        Type = type;
        PowerWH = powerWH;
        IsSpeedCharge = isSpeedCharge;
    }

    public String getBatteryType() {
        return Type;
    }

    public Integer getPowerWH() {
        return PowerWH;
    }

    public boolean getIsSpeedCharge() {
        return IsSpeedCharge;
    }

    public BatteryInfo getCopy() {
        return new BatteryInfo(Type, PowerWH, IsSpeedCharge);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Battery ");

        if (Type != null) {
            sb.append(" Type: ")
                    .append(Type)
                    .append(", ")
                    .append(" Power: ")
                    .append(PowerWH)
                    .append("Wh, ");
        }

        sb.append("Has Speed Charge: " + (IsSpeedCharge ? " yes " : " no "));

        return Type + " " + PowerWH + "Wh";
    }
}