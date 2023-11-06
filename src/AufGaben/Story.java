package AufGaben;

//Aufgabe 5
class Story {
    public static void main(String[] args) {
        Pkw smart = new Pkw();  // Instanziieren Sie ein Objekt der Klasse Pkw mit dem Namen "smart".
        smart.farbe = "brilliantweiss metallic";  // Weisen Sie das Attribut "farbe" den gewünschten Wert zu.
        System.out.println("Die Farbe des PKW ist: " + smart.farbe);  // Geben Sie die Farbe des PKW aus.
    }
}

class Pkw {
    String farbe;  // Attribut "farbe" vom Datentyp String in der Klasse Pkw.
}
