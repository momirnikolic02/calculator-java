LOC

- "calculator.java": 28 LOC
- "start.java": 24 LOC

Total LOC: 52

---

Staticka analiza

calculator.java
- Linija 3 – Naziv klase treba da pocinje velikim slovom po Java konvenciji (predlog: "Calculator").
- Linija 7 – Magicni broj 2 u izrazu "num1 + num2" nije problematican sam po sebi, ali ako logika postane slozenija, trebalo bi refaktorisati.
- Linija 13 – Nema provere deljenja nulom – moze izazvati izuzetak ("ArithmeticException").
- Linija 24 – "break" nedostaje u "default" grani, sto moze dovesti do nezeljenog ponasanja.
- Linija 30 – Nedostaje dokumentacija metode "calculate", nije jasno koji su validni operatori.
- Linija 36 – "default" grana vraca "0", sto moze dovesti do pogresnih rezultata – preporuceno je bacanje izuzetka za nepoznat operator.

start.java
- Linija 5 – Klasa nije deo nijednog paketa; dodavanje "package" deklaracije preporuceno.
- Linija 9 – "Scanner" objekat nije zatvoren; moze izazvati upozorenja i curenje resursa.
- Linija 13 – Unos operatora nije validiran; korisnik moze uneti nevazeci karakter.
- Linija 15 – Nema obrade izuzetaka za nevalidan unos brojeva ("InputMismatchException").
- Linija 20 – Ispis rezultata je direktan; preporuceno formatiranje rezultata kroz posebnu metodu.

---

Preporuke
- Postovati Java konvencije (imenovanje, struktura).
- Dodati "try-catch" blokove gde je unos korisnika u pitanju.
- Refaktorisati "calculate" metodu kako bi bila robusnija.
- Dodati komentare i dokumentaciju metoda za bolju citljivost.
- Zatvarati otvorene resurse (npr. "Scanner").
