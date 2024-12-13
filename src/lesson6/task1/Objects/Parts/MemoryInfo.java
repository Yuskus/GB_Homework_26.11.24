package lesson6.task1.Objects.Parts;

public class MemoryInfo {
    private Integer RAM;
    private Integer ROM;
    private boolean CanUpgradeRAM = false;
    private boolean CanUpgradeROM = false;
    private String ROMType;

    public MemoryInfo(Integer ram, Integer rom) {
        RAM = ram;
        ROM = rom;
    }

    public MemoryInfo(Integer ram, Integer rom, String romType) {
        RAM = ram;
        ROM = rom;
        ROMType = romType;
    }

    public MemoryInfo(Integer ram, Integer rom, String romType, boolean canUpgradeRAM, boolean canUpgradeROM) {
        RAM = ram;
        ROM = rom;
        ROMType = romType;
        CanUpgradeRAM = canUpgradeRAM;
        CanUpgradeROM = canUpgradeROM;
    }

    public Integer getRAM() {
        return RAM;
    }

    public Integer getROM() {
        return ROM;
    }

    public boolean getCanUpgradeRAM() {
        return CanUpgradeRAM;
    }

    public boolean getCanUpgradeROM() {
        return CanUpgradeROM;
    }

    public String getROMType() {
        return ROMType;
    }

    public MemoryInfo getCopy() {
        return new MemoryInfo(RAM, ROM, ROMType, CanUpgradeRAM, CanUpgradeROM);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("RAM: ")
                .append(RAM)
                .append(", Upgrade: " + (CanUpgradeRAM ? "available, " : "not available, "))
                .append(", ROM: ")
                .append(ROM)
                .append(", Upgrade: " + (CanUpgradeROM ? "available" : "not available"));

        if (ROMType != null)
            sb.append(", Type: ").append(ROMType);

        return super.toString();
    }
}
