package Optional_Homeworks;

import java.util.Optional;

public class OptionalWithObject {
    public static void main(String[] args) {
        Optional<String>optionalWithObject = Optional.of("Optional nie jest pusty");
        Optional<String>optionalWithoutObject = Optional.empty();
        String wartoscDomyslna = "Coś poszło nie tak";
        System.out.println(getValueOrDefault(optionalWithObject, wartoscDomyslna));
        System.out.println(getValueOrDefault(optionalWithoutObject, wartoscDomyslna));

        Optional<String> optional = Optional.empty();


    }
    public static String getValueOrDefault(Optional<String> optionalWithValue, String defaultValue){
     return optionalWithValue.orElse(defaultValue);
    }
}
