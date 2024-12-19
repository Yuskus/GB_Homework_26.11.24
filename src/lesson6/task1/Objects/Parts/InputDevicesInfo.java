package lesson6.task1.Objects.Parts;

import lesson6.task1.Objects.Parts.Structures.Colors;
import lesson6.task1.Objects.Parts.Structures.KeyboardLanguages;

public class InputDevicesInfo {
    private KeyboardLanguages Language = KeyboardLanguages.EN;
    private Colors KeyboardColor;
    private boolean IsNumPad = false;
    private boolean IsTouchpad = false;
    private boolean IsKeyBacklight = false;
    private boolean IsFingerprint = false;

    public InputDevicesInfo(Colors keyboardColor) {
        KeyboardColor = keyboardColor;
    }

    public InputDevicesInfo(Colors keyboardColor, KeyboardLanguages language) {
        KeyboardColor = keyboardColor;
        Language = language;
    }

    public InputDevicesInfo(Colors keyboardColor, KeyboardLanguages language, boolean isNumPad, boolean isTouchpad) {
        KeyboardColor = keyboardColor;
        Language = language;
        IsNumPad = isNumPad;
        IsTouchpad = isTouchpad;
    }

    public InputDevicesInfo(Colors keyboardColor, KeyboardLanguages language, boolean isNumPad, boolean isTouchpad,
            boolean isKeyBacklight, boolean isFingerprint) {
        KeyboardColor = keyboardColor;
        Language = language;
        IsNumPad = isNumPad;
        IsTouchpad = isTouchpad;
        IsKeyBacklight = isKeyBacklight;
        IsFingerprint = isFingerprint;
    }

    public KeyboardLanguages getLanguage() {
        return Language;
    }

    public Colors getKeyboardColor() {
        return KeyboardColor;
    }

    public boolean getIsNumPad() {
        return IsNumPad;
    }

    public boolean getIsTouchpad() {
        return IsTouchpad;
    }

    public boolean getIsKeyBacklight() {
        return IsKeyBacklight;
    }

    public boolean getIsFingerprint() {
        return IsFingerprint;
    }

    public InputDevicesInfo getCopy() {
        return new InputDevicesInfo(KeyboardColor, Language, IsNumPad, IsTouchpad, IsKeyBacklight, IsFingerprint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Keyboard Color: ")
                .append(KeyboardColor)
                .append(", Keyboard Language: ")
                .append(Language)
                .append(", ");

        sb.append("NumPad: " + (IsNumPad ? "yes, " : "no, "));
        sb.append("Touchpad: " + (IsTouchpad ? "yes, " : "no, "));
        sb.append("KeyBacklight: " + (IsKeyBacklight ? "yes, " : "no, "));
        sb.append("Fingerprint: " + (IsFingerprint ? "yes " : "no "));

        return Language.toString();
    }
}
