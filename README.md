# oopvizsgaA
Java OOP – A változat
UMFST – Informatika II. év | Java OOP gyakorlati felmérő | 90 perc | 20 pont
Beadás: GitHub/GitLab repository URL az oktató által megadott felületen, a 90 perc lejárta előtt. A
repository tartalmazza a futtatható Java-forrásokat és a README.md fájlt. Papíralapú beadás nincs.
AI használata tilos. Az internetes példakódok másolása sem helyettesíti az önálló munkát. A programot az
oktató fordítja/futtatja, és szóban rákérdezhet bármely részletére.
Kötelező Git-folyamat: legalább 5 értelmes commit, amelyek egyértelműen az 1–5. feladathoz tartoznak.
Például: Task 1 fix constructor ... Task 5 implement logic. Öt üres vagy kizárólag README-t
módosító commit nem felel meg.
Névmegőrzés: a megadott osztály-, mező-, paraméter- és metódusneveket, valamint az előírt
metódusszignatúrákat pontosan meg kell tartani. Új segédmetódusok készíthetők; a meglévő nevek átírása
nem elfogadható.
Kódminőség: Java naming convention (osztályok PascalCase, metódusok és változók camelCase), 4
szóközös következetes behúzás, jól elkülönített felelősségek, értelmes angol nyelvű kommentek a nem
triviális logikához. Nem szükséges minden sorhoz komment.
Levonások a 20 pontból: hiányzó vagy értelmetlen commit: –0,5 pont/db (legfeljebb –2,5); kötelező
nevek/szignatúrák indokolatlan módosítása: –1 pont; rendezetlen kód/konvenciók megsértése: –1 pont;
hiányzó, vagy félrevezető érdemi kommentek: –1 pont; hiányzó README vagy nem használható repository
link: –1 pont. Az összes levonás legfeljebb 5 pont; negatív végső pontszám nincs.
README.md: a futtatás lépései, az elvárt kimenet, valamint 3–5 mondat arról, hol valósul meg öröklés és
polimorfizmus. Minden feladat megoldását Java-ban készítsd el; Java 8+ nyelvi újdonság nem szükséges.
A változat – Csillámpóni-minisztérium
Kiinduló kód: másold a következő osztályokat a projektbe, majd javítsd/kiegészítsd a követelményeknek
megfelelően. A hibák szándékosak. A feladat nem igényel adatbázist, hálózatot vagy GUI-t.
class CsillamPoni {
 public String nev;
 private int csillamPont;
 public CsillamPoni(String nev, int csillamPont) {
 nev = nev;
 this.csillamPont = csillamPont;
 }
 public void adjCsillamot(int mennyiseg) {
 csillamPont += mennyiseg;
 }
 public int getCsillamPont() {
 return csillamPont;
 }
 public String bemutatkozas() {
 return nev + ": " + csillamPont;
 }
}
class RepuloCsillamPoni extends CsillamPoni {
 private String szarnySzin;
 public RepuloCsillamPoni(String nev, int csillamPont,
 String szarnySzin) {
 super(nev, csillamPont);
 this.szarnySzin = szarnySzin;
 }
 @Override
 public String bemutatkozas() {
 return "Repulo poni: " + nev;
 }
}
public class Main {
 public static void main(String[] args) {
 CsillamPoni p = new RepuloCsillamPoni(
 "CsillamKapitan", 7, "lila");
 p.adjCsillamot(3);
 System.out.println(p.bemutatkozas());
 }
}
1. Konstruktor és objektumállapot – 3 pont
Javítsd a CsillamPoni konstruktorát úgy, hogy a nev ténylegesen az átadott értéket tárolja. Az eredeti
konstruktor-paraméterek és nevek maradjanak meg. Írj rövid angol kommentet a javított sorhoz, amely
megmagyarázza a problémát.
2. Adatrejtés és ellenőrzött elérés – 3 pont
A nev mező legyen private. Hozz létre egy public String getNev() metódust. A leszármazott osztály ne
érje el közvetlenül a szülő privát mezőjét; a gettert használja. Ne nevezz át semmilyen meglévő metódust.
3. Validáció és szabályos állapot – 4 pont
A konstruktor ne engedjen negatív csillamPont értéket. A adjCsillamot(int mennyiseg) metódus ne
fogadjon negatív paramétert. Mindkét hibás bemenetnél dobj IllegalArgumentException-t. Null vagy
üres nev se legyen elfogadható. A 0 érvényes.
4. Öröklés, felülírás, polimorfizmus – 6 pont
Javítsd a RepuloCsillamPoni bemutatkozas() metódusát úgy, hogy a saját speciális mezőjét is
megjelenítse. Az alapváltozat adja vissza az azonosítót és a pontszámot; a leszármazott változat
azonosítót, pontszámot és a speciális mezőt. A main-ben készíts egy alap- és egy leszármazott objektumot,
tárold őket CsillamPoni típusú referenciákban és hívd meg mindkettőn a bemutatkozas() metódust. A
hívásnak a valódi objektumtípusnak megfelelő metódust kell futtatnia.
5. Önálló algoritmikus feladat – 4 pont
A csillámpónik 7 egymást követő napon szerzett csillámpontjait egész számok tömbjében tároljuk.
Implementáld pontosan ezt a statikus metódust: public static int leghosszabbCsillamSorozat(int[]
napiPontok, int minimum). Az eredmény: hány egymást követő napon volt a napi érték legalább
minimum. A negatív napérték is lehetséges; ne módosítsd a tömböt. Üres tömbre 0 az eredmény.
// Expected: 3 (days 3, 4 and 5)
int[] napiPontok = {4, 7, 9, 9, 8, 2, 10};
System.out.println(leghosszabbCsillamSorozat(
 napiPontok, 8));
// Expected: 0
System.out.println(leghosszabbCsillamSorozat(
 new int[0], 5));
A logikai feladat önálló: 4/20 pontot ér. A működő megoldás többet ér, mint egy jól hangzó magyarázat.
Készíts hozzá legalább két további tesztesetet; a nem triviális cikluslogikát angol kommenttel magyarázd.
Beadás előtti ellenőrzőlista
□ Fordul és fut a Java-projekt. □ Mind az 5 feladat elkészült. □ Legalább 5 tartalmas commit. □ Változó-,
osztály- és metódusnevek megtartva. □ Angol magyarázó kommentek. □ README és működő repository
URL
