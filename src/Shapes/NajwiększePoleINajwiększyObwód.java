package Shapes;

import java.util.ArrayList;
import java.util.List;

public class NajwiększePoleINajwiększyObwód {
    public static void main(String[] args) {
        List<IFigura> kształty = new ArrayList<>();
        kształty.add(new Kwadrat(5));
        kształty.add(new Kwadrat(8));
        kształty.add(new Protstokąt(3, 7));
        kształty.add(new Protstokąt(2, 9));
        kształty.add(new Koło(6));
        kształty.add(new Koło(5.5));
        MethodsForShapes methods = new MethodsForShapes();
        System.out.println("Figura o największym polu to: " + methods.znajdzNajwiekszePole(kształty));
        System.out.println("Figura o największym obwodzie to: " + methods.znajdźNajiekszyObwód(kształty));
    }

}
