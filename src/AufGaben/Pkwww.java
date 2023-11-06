package AufGaben;

//Aufgabe 6
public class Pkw {
	 String name = "Kein Name";
}

class Storyy {
    public static void main(String[] args) {
    	Pkw meinErstesAuto = new Pkw();
        System.out.println("Der Name des Autos (Standardwert) ist: " + meinErstesAuto.name);
        
        meinErstesAuto.name = "911 turbo"; // Aktualisieren Sie den Wert des Attributs "name".
        System.out.println("Der Name des Autos (nach Aktualisierung) ist: " + meinErstesAuto.name);
    }
}