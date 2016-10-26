/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package line;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author miguel.camargo
 */
public class Line {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

        String nombreArchivo = "C:\\c_metas_18_10_2016_152832.txt";
        File file = null;
        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fichero = null;
        PrintWriter pw = null;

        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            file = new File(nombreArchivo);
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            fichero = new FileWriter("C:\\Users\\miguel.camargo\\Desktop\\c_metas_18_10_2016_152832-2.txt");
            pw = new PrintWriter(fichero);
            int cont = 0;
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                cont++;
            }
            br.close();
            file = new File(nombreArchivo);
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            System.out.println(cont);
            int a=0;
            while ((linea = br.readLine()) != null) {
                if (a!=cont) {
                    pw.println(linea);
                }else
                    pw.print(linea);
            }

            pw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }
}
