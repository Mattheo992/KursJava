package Enums;

enum Shapes {
    CIRCLE {
        @Override
        public double areaOfShape(double radius) {
            return Math.PI * Math.pow(radius, 2);
        }
    }, SQUARE {
        @Override
        public double areaOfShape(double side) {
            return Math.pow(side, 2);
        }
    },
    TRIANGLE {
        @Override
        public double areaOfShape(double triangleParameter) {
            return triangleParameter * 0.5;
        }

    };

    public abstract double areaOfShape(double parameter);


    public static void main(String[] args) {

        double base = 10;
        double height = 7.0;
        double radius = 2.0;
        double side = 6;
        double triangleParameter = base * height;

        System.out.println("pole koła wynosi : " + Shapes.CIRCLE.areaOfShape(radius));
        System.out.println("pole kwadratu wynosi " + Shapes.SQUARE.areaOfShape(side));
        System.out.println("pole trójkąta wynosi " + Shapes.TRIANGLE.areaOfShape(triangleParameter));

    }
}