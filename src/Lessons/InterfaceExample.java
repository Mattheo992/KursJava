package Lessons;

public interface InterfaceExample {
    void print();
   private void calculateArea(){};

    default boolean isTriangle() {
        return true;
    }

    static void statistics(){};



}
