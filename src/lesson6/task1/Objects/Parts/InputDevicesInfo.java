package lesson6.task1.Objects.Parts;

import java.awt.Color;
import lesson6.task1.Objects.Parts.Structures.KeyboardLanguages;

public class InputDevicesInfo {
    public KeyboardLanguages Language = KeyboardLanguages.EN;
    public Color KeyboardColor;
    public boolean IsNumPad = false;
    public boolean IsTouchpad = false;
    public boolean IsKeyBacklight = false;
    public boolean IsFingerprint = false;

    public InputDevicesInfo(Color keyboardColor) {
        KeyboardColor = keyboardColor;
    }

    public InputDevicesInfo(Color keyboardColor, KeyboardLanguages language) {
        KeyboardColor = keyboardColor;
        Language = language;
    }

    public InputDevicesInfo(Color keyboardColor, KeyboardLanguages language, boolean isNumPad, boolean isTouchpad) {
        KeyboardColor = keyboardColor;
        Language = language;
        IsNumPad = isNumPad;
        IsTouchpad = isTouchpad;
    }

    public InputDevicesInfo(Color keyboardColor, KeyboardLanguages language, boolean isNumPad, boolean isTouchpad,
            boolean isKeyBacklight, boolean isFingerprint) {
        KeyboardColor = keyboardColor;
        Language = language;
        IsNumPad = isNumPad;
        IsTouchpad = isTouchpad;
        IsKeyBacklight = isKeyBacklight;
        IsFingerprint = isFingerprint;
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
