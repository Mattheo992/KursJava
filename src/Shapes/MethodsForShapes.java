package Shapes;

import java.util.List;

public class MethodsForShapes {
    public static IFigura znajdzNajwiekszePole(List<IFigura> figury) {
        IFigura figuraZNajwiększymPolem = figury.get(0);
        for (IFigura figura : figury) {
            if (figuraZNajwiększymPolem.obliczPole() < figura.obliczPole()) {
                figuraZNajwiększymPolem = figura;
            }
        }

        return figuraZNajwiększymPolem;
    }
    public IFigura znajdźNajiekszyObwód(List<IFigura> figury){
        IFigura figuraZNajwiększymObwodem = figury.get(0);
        for(IFigura figura : figury){
            if(figuraZNajwiększymObwodem.obliczObwod() > figura.obliczObwod()){;
                figuraZNajwiększymObwodem = figura;
            }
        }
        return figuraZNajwiększymObwodem;
    }
}

