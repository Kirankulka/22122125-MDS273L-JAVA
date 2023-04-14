
import java.io.*;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
class Iris{
    private double sepalLengthCm;
    private double sepalWidthCm;
    private double petalLengthCm;
    private double petalWidthCm;
    private String species;

    public void Iris(double sepalLengthCm, double sepalWidthCm, double petalLengthCm, double petalWidthCm, String species) {
        this.sepalLengthCm = sepalLengthCm;
        this.sepalWidthCm = sepalWidthCm;
        this.petalLengthCm = petalLengthCm;
        this.petalWidthCm = petalWidthCm;
        this.species = species;
    }

    public double getSepalLengthCm() {
        return sepalLengthCm;
    }

    public double getSepalWidthCm() {
        return sepalWidthCm;
    }

    public double getPetalLengthCm() {
        return petalLengthCm;
    }

    public double getPetalWidthCm() {
        return petalWidthCm;
    }

    public String getSpecies() {
        return species;
    }
}

public class lab7 {

   public static void main(String[] args) {
       System.out.println("Kiran");
     }
 }
        

      