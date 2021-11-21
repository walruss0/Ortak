package com.bilgeadam.ortak;

public class OrtakTest {
    public void testBuyukHarfeCevir()
    {
        String kelime = "izmirli İĞDELER";

        System.out.println(Ortak.buyukHarfeCevir(kelime));
    }
    public void testKucukHarfeCevir()
    {
        String kelime = "IĞDIRLI ispanaklar ÖİĞÜŞIÇ";

        System.out.println(Ortak.kucukHarfeCevir(kelime));
    }
    public static void main(String[] args) {
      OrtakTest ortakTest = new OrtakTest();
      ortakTest.testBuyukHarfeCevir();
      ortakTest.testKucukHarfeCevir();
    }
}
