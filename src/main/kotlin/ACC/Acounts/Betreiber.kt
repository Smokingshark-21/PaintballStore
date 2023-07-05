package ACC.Acounts

import Kategorien.*
import Kategorien.Unterkategorien.artikel.Magfed

class Betreiber(
    benutzername:String,
    passwort:Int

):Konto(benutzername,passwort, isAdmin = true, eingelogt = false) {

    fun produktBearbeiten(){
        var aufgabenliste = listOf<String>("Produkt Hinzufügen","Produkt entfernen","Bestand prüfen")

        while (true) {
            try {
                println("Was möchten sie erledigen")

                for (i in aufgabenliste.indices){
                    println("[${i+1}] ${aufgabenliste[i]}")
                }

                var input = readln().toInt()

                when (input){
                    1 -> {produktHinzufügen()}
                }
            }catch (e:Exception){
                println("Falsche eingabe")
                continue
            }

        }

    }

    private fun produktHinzufügen(){
        while (true) {

            try {
                println("Wie ist die Marke des Artikels?")
                val mInput = readln()
                println("Wie ist der Name des Artikels?")
                val nInput = readln()
                println("Was für einen Preis hat der Artikel")
                val pInput = readln().toDouble()
                println("Wie viel ist davon auf Lager?")
                val lInput = readln().toInt()
                println("was für eine Farbe hat der Artikel?")
                val fInput = readln()
                println("um was für ein Artikel handelt es sich")
                val aInput = readln().lowercase()

                when(aInput){
                   "magfed" -> {
                       println("Was für ein Kaliber hat der Makierer?")
                       val kInput = readln().toInt()
                       println("Wie viele Magazine hat der Makierer?")
                       val maInput = readln().toInt()

                        var kategorie = Kategorie()
                       kategorie.artikel.add(Magfed(mInput,nInput,pInput,0,lInput,fInput,kInput,maInput))
                   }
                }
            }catch (e:Exception){
                println("Probieren sie es noch einmal")
                continue
            }
        }
    }

}