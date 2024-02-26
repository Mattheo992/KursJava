package Enums;

public enum DirectionsOfTheWorld {
    NORTH("Północ"), SOUTH("Południe"), EAST("Wschód"), WEST("Zachód");
    private final String directions;

    DirectionsOfTheWorld(String directions) {
        this.directions = directions;
    }

    public String getDirections() {
        return directions;
    }
    public static boolean isItTheEast(DirectionsOfTheWorld directions){
        return directions == DirectionsOfTheWorld.EAST;
    }

    public static void main(String[] args) {
        DirectionsOfTheWorld direction = DirectionsOfTheWorld.EAST;
        if(isItTheEast(direction)){
            System.out.println("Kierunek jest zgodny ze wschodem");
        }
        else {
            System.out.println("Kierunek jest niezgodny ze wschodem");
        }
    }
}
