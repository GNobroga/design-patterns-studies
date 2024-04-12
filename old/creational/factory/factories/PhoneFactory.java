package factories;

import java.util.Objects;

import enums.PhoneType;
import interfaces.IPhone;
import model.Phone11;
import model.PhoneX;

public final class PhoneFactory {

    private PhoneFactory() {}

    public static IPhone create(PhoneType type) {
        if (Objects.isNull(type)) {
            throw new IllegalArgumentException("The type is invalid");
        }

        if (type.equals(PhoneType.PHONEX)) {
            return new PhoneX();
        } 

        return new Phone11();
    }
}