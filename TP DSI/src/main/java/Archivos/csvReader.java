package Archivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class csvReader {

    public static void main(String[] args) {
        String path = "C:\\Users\\3erAnio\\diseno\\Diseno-de-Sistemas-de-Informacion-2025\\desastres_naturales_argentina.csv";
        String lineaArchivo = "";
        String[] listaDeValores;

        try {
            BufferedReader bufferlector = new BufferedReader(new FileReader(path));

            while (!Objects.equals(lineaArchivo = bufferlector.readLine(), null)) {

                listaDeValores = lineaArchivo.split(",");
                System.out.println("El titulo es: " + listaDeValores[0] + " descripcion: " + listaDeValores[1] + " Categoria: " + listaDeValores[2] + " Latitud " + listaDeValores[3] + " Longitud " + listaDeValores[4] + "Fecha del hecho: " + listaDeValores[5]);

            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
