import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MeterDatos {

    public static void muestraContenido(String archivo) throws FileNotFoundException, IOException {
        ArrayList<Double> Notas = new ArrayList<>();
        ArrayList<String> Nombres = new ArrayList<>();
        ArrayList<String> NombresRandom = new ArrayList<>();
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while ((b.readLine()) != null) {
            Nombres.add((b.readLine()));

        }
    }
    public static void main(String[] args) throws IOException {
        muestraContenido("E:/PGL/Practica1-1/Nombres.csv");
    }

}