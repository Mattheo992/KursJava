package Lessons;
import java.util.Optional;
public class OptionalLesson {
    public static void main(String[] args) {
        String input1 = "text";
        String input2 ="";
Optional<String> optional1 = optional(input1);
Optional<String> optional2 = optional(input2);

    }
    public static Optional<String> optional (String text){
        if(text != null && !text.isEmpty()){
          return Optional.of(text);
        }
        else {
            return Optional.empty();
        }
    }
}
