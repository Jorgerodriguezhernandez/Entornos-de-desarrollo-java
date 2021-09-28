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
        while((b.readLine())!=null) {
            Nombres.add((b.readLine()));

        }

        for(int i=0; i < Nombres.size(); i++){
            Random rand = new Random();
            int n = rand.nextInt(Nombres.size());
            if(NombresRandom.size() < 10) {
                NombresRandom.add(Nombres.get(n));
            }else{
                break;
            }
        }
        for(int i=0; i < 40; i++){
            Random rand = new Random();
            double n = rand.nextInt(10);
            Notas.add(n);

        }
        b.close();



        FileWriter fichero = null;
        PrintWriter pw = null;
        fichero = new FileWriter("E:/Practica1-1/NotasOficiales.csv");
        pw = new PrintWriter(fichero);

        for(int i=0; i < NombresRandom.size(); i++){
            pw.print("\n" + NombresRandom.get(i));
            pw.print("    | "+ Notas.get(i));
            pw.print("    | "+ Notas.get(i+1));
            pw.print("    | "+ Notas.get(i+2));
            pw.print("    | "+ Notas.get(i+3));
            pw.println("|     La media es: "+ ((Notas.get(i) + Notas.get(i+2) + Notas.get(i+3)))/4);

            System.out.print("\n" + NombresRandom.get(i));
            System.out.print("    | "+ Notas.get(i));
            System.out.print("    | "+ Notas.get(i+1));
            System.out.print("    | "+ Notas.get(i+2));
            System.out.print("    | "+ Notas.get(i+3));
            System.out.print("|     La media es: "+ ((Notas.get(i) + Notas.get(i+2) + Notas.get(i+3)))/4);
        }

        if (null != fichero)
            fichero.close();
    }

    public static void main(String[] args) throws IOException {
        muestraContenido("E:/PGL/Practica1-1/Nombres.csv");
    }

}