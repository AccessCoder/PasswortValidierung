import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswortTest {
    // Eingabe des Users einlesen (scanner) V
    // Vergleich mit Datenbank der nicht erlaubten Passwörter
    // Gegenchecken ob Sicherheitsstandards erfüllt sind (ein Großbuchstabe, ein Kleinbuchstabe, eine Zahl und ein Sonderzeichen. Min 8 Zeichen lang) -> pro Check eine einzelfunktion

    @Test
    void isAllowedTestVerbotenePW(){
        assertEquals(false, Passwort.isAllowed("12345678"));
    }
    @Test
    void isAllowedTestKeinSonderzeichenUndZahlUndKurz(){
        assertEquals(false, Passwort.isAllowed("Banane"));
    }
    @Test
    void isAllowedTestOhneSonderzeichen(){
        assertEquals(false, Passwort.isAllowed("IrgendwasOhneSonderzeichen213"));
    }
    @Test
    void isAllowedTestZuKurz(){
        assertEquals(false, Passwort.isAllowed("Al!35"));
    }
    @Test
    void isAllowedTestKeinKlein(){
        assertEquals(false, Passwort.isAllowed("YAYPASSWOR123!!"));
    }
    @Test
    void isAllowedTestkeinGroß(){
        assertFalse(Passwort.isAllowed("flüsterpasswort123!"));
    }
    @Test
    void isAllowedTestKorrekt(){
        assertEquals(true, Passwort.isAllowed("VorblidlichesPasswort123!§%"));
    }





}