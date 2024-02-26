package Lessons;

import java.util.Objects;

public class Rower {
    private String name;
    private String frameColor;
    private int productionYear;

    public Rower(String name, String frameColor, int productionYear) {
        this.name = name;
        this.frameColor = frameColor;
        this.productionYear = productionYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFrameColor() {
        return frameColor;
    }

    public void setFrameColor(String frameColor) {
        this.frameColor = frameColor;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rower rower = (Rower) o;
        return productionYear == rower.productionYear && Objects.equals(name, rower.name) && Objects.equals(frameColor, rower.frameColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, frameColor, productionYear);
    }
}
