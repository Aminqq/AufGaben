package AufGaben;

public class AutoKostenBerechnung {

	public static void main(String[] args) {
        double gesamtfahrleistung = 150000; // Gesamtfahrleistung in km

        // Benzin-Pkw-Daten
        double benzinAnschaffungswert = 25000; // in Euro
        double benzinKfzSteuer = 500; // in Euro pro Jahr
        double benzinVerbrauch = 8.6; // Verbrauch in l/100km
        double benzinpreis = 1.80; // Benzinpreis in Euro pro Liter

        // Diesel-Pkw-Daten
        double dieselAnschaffungswert = 30000; // in Euro
        double dieselKfzSteuer = 1240; // in Euro pro Jahr
        double dieselVerbrauch = 5.4; // Verbrauch in l/100km
        double dieselpreis = 1.75; // Dieselpreis in Euro pro Liter

        // Elektro-Pkw-Daten
        double elektroAnschaffungswert = 60000; // in Euro
        double elektroKfzSteuer = 0; // keine Kfz-Steuer
        double elektroVerbrauch = 21.25; // Verbrauch in kWh/100km
        double strompreis = 0.35; // Strompreis in Euro pro kWh

        // Gesamtkostenberechnung für jeden Fahrzeugtyp
        double benzinKosten = (benzinAnschaffungswert + gesamtfahrleistung * (benzinVerbrauch / 100) * benzinpreis + benzinKfzSteuer);
        double dieselKosten = (dieselAnschaffungswert + gesamtfahrleistung * (dieselVerbrauch / 100) * dieselpreis + dieselKfzSteuer);
        double elektroKosten = (elektroAnschaffungswert + gesamtfahrleistung * (elektroVerbrauch / 100) * strompreis + elektroKfzSteuer);

        // Ausgabe der Gesamtkosten
        System.out.println("Gesamtkosten für Benzin-Pkw: " + benzinKosten + " Euro");
        System.out.println("Gesamtkosten für Diesel-Pkw: " + dieselKosten + " Euro");
        System.out.println("Gesamtkosten für Elektro-Pkw: " + elektroKosten + " Euro");

        // Kaufentscheidung basierend auf den Gesamtkosten
        if (benzinKosten < dieselKosten && benzinKosten < elektroKosten) {
            System.out.println("Herr Fuchs sollte den Benzin-Pkw kaufen.");
        } else if (dieselKosten < benzinKosten && dieselKosten < elektroKosten) {
            System.out.println("Herr Fuchs sollte den Diesel-Pkw kaufen.");
        } else {
            System.out.println("Herr Fuchs sollte den Elektro-Pkw kaufen.");
        }
    }
}
