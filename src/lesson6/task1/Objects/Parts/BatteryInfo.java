package lesson6.task1.Objects.Parts;

import lesson6.task1.Objects.Parts.Structures.BatteryTypes;

public class BatteryInfo {
    private BatteryTypes Type;
    private Integer PowerWH;
    private boolean IsSpeedCharge;

    public BatteryInfo() {
        Type = BatteryTypes.UNKNOWN;
    }

    public BatteryInfo(BatteryTypes type, Integer powerWH) {
        this(type, powerWH, false);
    }

    public BatteryInfo(BatteryTypes type, Integer powerWH, boolean isSpeedCharge) {
        Type = type;
        PowerWH = powerWH;
        IsSpeedCharge = isSpeedCharge;
    }

    public BatteryTypes getBatteryType() {
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
