package com.bilgeadam.ortak;

import java.util.Locale;

public class Ortak {
   private static Locale localeTR = new Locale("tr","TR");

    public static String buyukHarfeCevir(String p_kelime)
    {
        return p_kelime.toUpperCase(localeTR);
    }

    public static String kucukHarfeCevir(String p_kelime)
    {
        return p_kelime.toLowerCase(localeTR);
    }
}
