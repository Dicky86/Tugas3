package tugaspraktikum3;

import suhu.KonversiSuhu2;

class DemoKonversiSuhu {
    public static void main(String[] args) {
        KonversiSuhu2 konversi2 = new KonversiSuhu2();

        double celcius = 33.0;
        double fahrenheit = konversi2.celciusToFahrenheit(celcius);
        double reamur = konversi2.celciusToReamur(celcius);
        double fahrenheitToReamur = konversi2.fahrenheitToReamur(fahrenheit);

        System.out.println("Hasil Konversi Suhu:");
        System.out.println(celcius + " Celsius       = " + fahrenheit + " Fahrenheit");
        System.out.println(celcius + " Celsius       = " + reamur + " Reamur");
        System.out.println(fahrenheit + " Fahrenheit    = " + fahrenheitToReamur + " Reamur");
    }
}