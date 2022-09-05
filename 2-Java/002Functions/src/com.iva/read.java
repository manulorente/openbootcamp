package com.iva;
import java.io.*;

public class read {
    public static double dataDouble() {
        try {
            double myDouble = Double.parseDouble(readData());
            return myDouble;
        } catch (NumberFormatException i) {
            System.out.print("Invalid data. Try again: ");
            return dataDouble();
        } catch (NullPointerException i) {
            return Double.NaN;
        }
    }

    public static String readData() {
        String vread = "";
        try {
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(System.in));
            vread = reader.readLine();
        } catch (IOException i) {
            System.err.println("Error: " + i.getMessage());
        }
        return vread;
    }
}
