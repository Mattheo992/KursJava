package Enums;

import java.util.List;
import java.util.Scanner;

public enum Size {
    EXTRA_SMALL(List.of(35, 36, 37), "bardzo nały"), SMALL(List.of(38, 39, 40),"mały" ), MEDIUM(List.of(41, 42, 43), "średni"), LARGE(List.of(44, 45), "duży"), EXTRA_LARGE(List.of(46, 47, 48), "bardzo duży");
    private final List<Integer> sizes;
    private final String opis;

    Size(List<Integer> sizes, String opis) {
        this.sizes = sizes;
        this.opis = opis;
    }

    public List<Integer> getSizes() {
        return sizes;
    }

    public String getOpis() {
        return opis;
    }

    public static Size fromDescription(String description) {
        Size[] values = values();
        for (Size size : values) {
            if (size.sizes.equals(description))
                return size;
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz rozmiar butów:  " + " Extra_small: " + EXTRA_SMALL.getSizes() + " Small:  " + SMALL.getSizes() + " Medium : " + MEDIUM.getSizes() + " Large: " + LARGE.getSizes() + " Extra_large: " +EXTRA_LARGE.getSizes());
        int userSize = sc.nextInt();
        try {
            int size = userSize;
            switch (size) {
                case 35, 36, 37-> System.out.println("Wybrano rozmiar " + EXTRA_SMALL.getOpis());
                case 38, 39, 40 -> System.out.println("Wybrano rozmiar " + SMALL.getOpis());
                case 41, 42, 43 -> System.out.println("Wybrano rozmiar " + MEDIUM.getOpis());
                case 44, 45 -> System.out.println("Wybrano rozmiar :" + LARGE.getOpis());
                case 46, 47, 48 -> System.out.println("Wybrano rozmiar " + EXTRA_LARGE.getOpis());
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Wybrano błędny rozmiar");
        }
        sc.close();
    }
}










