package lesson6.task1.Objects.Parts;

public class MemoryInfo {
    public Integer RAM;
    public Integer ROM;
    public boolean CanUpgradeRAM = false;
    public boolean CanUpgradeROM = false;
    public String ROMType;

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
