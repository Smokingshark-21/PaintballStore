import ACC.Account
import ACC.Acounts.Kunde
import Kategorien.Kategorie
import Kategorien.Unterkategorien.artikel.*


class Paintballstore() {

    var kategorie = Kategorie()
    var acc = Account()


    fun loginRegister() {
        do {
            try {

                val auswahlListe = listOf<String>("Login", "Registrieren")

                println("Wähle sie anhand der Ziffern aus\n")
                for (i in auswahlListe.indices) {
                    println("[${i + 1}] ${auswahlListe[i]}\n")
                }

                val lrInput = readln().toInt()

                when (lrInput) {
                    1 -> {
                        acc.einlogen()
                        for (i in acc.accountliste)

                            if (i.eingelogt) {

                                if (i.isAdmin){
                                    adminMenue(i.benutzername) //ToDo Fertigstellen
                                }else {
                                    kundenMenue(i.benutzername)
                                }
                            }
                    }

                    2 -> {
                        acc.accountErstellen()
                        continue
                    }
                }


            } catch (e: Exception) {
                println("Falsche eingabe Probieren sie es noch einmal")
                continue
            }

        } while (true)

    }

    fun adminMenue(benutzername: String){
        while (true){
            try {

                println("\n" +
                        "${fg(34)}██╗░░░██╗███████╗██████╗░░██╗░░░░░░░██╗░█████╗░██╗░░░░░████████╗██╗░░░██╗███╗░░██╗░██████╗░$RC\n" +
                        "${fg(34)}██║░░░██║██╔════╝██╔══██╗░██║░░██╗░░██║██╔══██╗██║░░░░░╚══██╔══╝██║░░░██║████╗░██║██╔════╝░$RC\n" +
                        "${fg(34)}╚██╗░██╔╝█████╗░░██████╔╝░╚██╗████╗██╔╝███████║██║░░░░░░░░██║░░░██║░░░██║██╔██╗██║██║░░██╗░$RC\n" +
                        "${fg(34)}░╚████╔╝░██╔══╝░░██╔══██╗░░████╔═████║░██╔══██║██║░░░░░░░░██║░░░██║░░░██║██║╚████║██║░░╚██╗$RC\n" +
                        "${fg(34)}░░╚██╔╝░░███████╗██║░░██║░░╚██╔╝░╚██╔╝░██║░░██║███████╗░░░██║░░░╚██████╔╝██║░╚███║╚██████╔╝$RC\n" +
                        "${fg(34)}░░░╚═╝░░░╚══════╝╚═╝░░╚═╝░░░╚═╝░░░╚═╝░░╚═╝░░╚═╝╚══════╝░░░╚═╝░░░░╚═════╝░╚═╝░░╚══╝░╚═════╝░$RC")

                val aListe = listOf<String>("Produkt hinzufügen","Produkt entfernen","Warenbestand","Auslogen")
                println("Was möchten sie erledigen wählen sie anhand der Ziffern")

                for (i in aListe.indices){
                    println("[${i+1}] ${aListe[i]}")
                }

                val aIput = readln().toInt()

                when (aIput){
                    1 ->{produktHinzufuegen()}
                    2 ->{produktEntfernen()} // ToDo anfangen
                    3 ->{warenBestand()} // Todo anfangen
                    4 ->{acc.auslogen(benutzername)
                         break}
                }

            }catch (e:Exception){
                println("Falsche eingabe Probieren sie es noch einmal")
                continue
            }
        }


    }


    private fun produktHinzufuegen() {

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
                val artikelList = listOf<String>(
                    "Jersey",
                    "Magfed Makierer",
                    "Maske",
                    "Pneumat-Tunier Makierer",
                    "Supair Hose",
                    "Tactical Hose",
                    "Tactical Shirt"
                )
                for (i in artikelList.indices) {
                    println("[${i + 1}] ${artikelList[i]}")
                }
                val aInput = readln().toInt()

                when (aInput) {
                    1 -> {
                        println("Was für eine Größe hat das Jersey")
                        val grInput = readln()
                        println("Was für eine Aufschrift hat das Jersey")
                        val auInput = readln()

                        kategorie.artikel.add(Jersey(mInput, nInput, pInput, 0, lInput, fInput, grInput, auInput))
                        println("Der Artikel Wurde erfolgreich hinzugefügt")
                        break
                    }

                    2 -> {
                        println("Was für ein Kaliber hat der Makierer?")
                        val kInput = readln().toInt()
                        println("Wie viele Magazine hat der Makierer?")
                        val maInput = readln().toInt()

                        kategorie.artikel.add(Magfed(mInput, nInput, pInput, 0, lInput, fInput, kInput, maInput))
                        println("Der Artikel Wurde erfolgreich hinzugefügt")
                        break
                    }

                    3 -> {
                        println("Was für eine Größe hat die Maske")
                        val grInput = readln()
                        println("Was für eine Glasfarbe hat die Maske")
                        val gfInput = readln()

                        kategorie.artikel.add(Maske(mInput, nInput, pInput, 0, lInput, fInput, grInput, gfInput))
                        println("Der Artikel Wurde erfolgreich hinzugefügt")
                        break
                    }

                    4 -> {
                        println("Was für ein Kaliber hat der Makierer?")
                        val kInput = readln().toInt()
                        println("Wie Schnell kann er pro sekunde ein paintball abfeuern?")
                        val maInput = readln().toInt()

                        kategorie.artikel.add(Magfed(mInput, nInput, pInput, 0, lInput, fInput, kInput, maInput))
                        println("Der Artikel Wurde erfolgreich hinzugefügt")
                        break
                    }

                    5 -> {
                        println("Was für eine Größe hat die Supair Hose")
                        val grInput = readln()
                        println("Kann mann mit der Hose Sliden true/false ?")
                        val gfInput = readln().toBoolean()

                        kategorie.artikel.add(Supairhose(mInput, nInput, pInput, 0, lInput, fInput, grInput, gfInput))
                        println("Der Artikel Wurde erfolgreich hinzugefügt")
                        break
                    }

                    6 -> {
                        println("Was für eine Größe hat das Tactical Hose")
                        val grInput = readln()
                        println("Ist das Shirt Kurzärmlig  true/false ?")
                        val gfInput = readln().toBoolean()

                        kategorie.artikel.add(Tacticalhose(mInput, nInput, pInput, 0, lInput, fInput, grInput, gfInput))
                        println("Der Artikel Wurde erfolgreich hinzugefügt")
                        break
                    }

                    7 -> {
                        println("Was für eine Größe hat die Tactical Shirt")
                        val grInput = readln()
                        println("Hat die Hose Protektoren true/false ?")
                        val gfInput = readln().toBoolean()

                        kategorie.artikel.add(Tacticalhose(mInput, nInput, pInput, 0, lInput, fInput, grInput, gfInput))
                        println("Der Artikel Wurde erfolgreich hinzugefügt")
                        break
                    }
                }
            }catch (e:Exception){
                println("Probieren sie es noch einmal")
                continue
            }
        }
    }

    fun produktEntfernen(){}

    fun warenBestand(){}

    fun kundenMenue(benutzername:String) {

        while (true) {
            try {
                println(
                    "\n" +
                            "${fg(34)}██████╗░░█████╗░██╗███╗░░██╗████████╗██████╗░░█████╗░██╗░░░░░██╗░░░░░░██████╗████████╗░█████╗░██████╗░███████╗$RC\n" +
                            "${fg(34)}██╔══██╗██╔══██╗██║████╗░██║╚══██╔══╝██╔══██╗██╔══██╗██║░░░░░██║░░░░░██╔════╝╚══██╔══╝██╔══██╗██╔══██╗██╔════╝$RC\n" +
                            "${fg(34)}██████╔╝███████║██║██╔██╗██║░░░██║░░░██████╦╝███████║██║░░░░░██║░░░░░╚█████╗░░░░██║░░░██║░░██║██████╔╝█████╗░░$RC\n" +
                            "${fg(34)}██╔═══╝░██╔══██║██║██║╚████║░░░██║░░░██╔══██╗██╔══██║██║░░░░░██║░░░░░░╚═══██╗░░░██║░░░██║░░██║██╔══██╗██╔══╝░░$RC\n" +
                            "${fg(34)}██║░░░░░██║░░██║██║██║░╚███║░░░██║░░░██████╦╝██║░░██║███████╗███████╗██████╔╝░░░██║░░░╚█████╔╝██║░░██║███████╗$RC\n" +
                            "${fg(34)}╚═╝░░░░░╚═╝░░╚═╝╚═╝╚═╝░░╚══╝░░░╚═╝░░░╚═════╝░╚═╝░░╚═╝╚══════╝╚══════╝╚═════╝░░░░╚═╝░░░░╚════╝░╚═╝░░╚═╝╚══════╝$RC"
                )

                Thread.sleep(3000)

                println("\n${U}Das sind unsere derzeitigen Artikel:$RC\n")

                for (i in kategorie.artikel.indices){
                    println(kategorie.artikel[i].toString())
                }
                println()
                val auswahlListe = listOf<String>("Produkte Filtern","Warenkorb","Auslogen")
                println("Wählen sie anhand der ${U}Ziffern$RC")
                for (i in auswahlListe.indices){
                    println("[${i+1}] ${auswahlListe[i]}")
                }

                val aInput = readln().toInt()

                when (aInput){
                    1 -> {filterMenue(benutzername)}
                    2 -> {warenkorb(benutzername)}
                    3 -> {acc.auslogen(benutzername)
                          break}
                }
            }catch (e:Exception){
                println("Probieren sie es noch einmal")
                continue
            }

        }

    }

    private fun kunde(benutzername: String):Kunde?{
        for (i in acc.accountliste)
            if (i is Kunde){
                if (i.benutzername == benutzername){
                    return i
                }
            }
        return null
    }

    fun warenkorb(benutzername: String){

        while (true){
            var gesamtpreis = 0.0
            try {
                val auswahlListe = mutableListOf<String>("zurück zum Menü")
                println("\n" +
                        "${fg(34)}░██╗░░░░░░░██╗░█████╗░██████╗░███████╗███╗░░██╗██╗░░██╗░█████╗░██████╗░██████╗░$RC\n" +
                        "${fg(34)}░██║░░██╗░░██║██╔══██╗██╔══██╗██╔════╝████╗░██║██║░██╔╝██╔══██╗██╔══██╗██╔══██╗$RC\n" +
                        "${fg(34)}░╚██╗████╗██╔╝███████║██████╔╝█████╗░░██╔██╗██║█████═╝░██║░░██║██████╔╝██████╦╝$RC\n" +
                        "${fg(34)}░░████╔═████║░██╔══██║██╔══██╗██╔══╝░░██║╚████║██╔═██╗░██║░░██║██╔══██╗██╔══██╗$RC\n" +
                        "${fg(34)}░░╚██╔╝░╚██╔╝░██║░░██║██║░░██║███████╗██║░╚███║██║░╚██╗╚█████╔╝██║░░██║██████╦╝$RC\n" +
                        "${fg(34)}░░░╚═╝░░░╚═╝░░╚═╝░░╚═╝╚═╝░░╚═╝╚══════╝╚═╝░░╚══╝╚═╝░░╚═╝░╚════╝░╚═╝░░╚═╝╚═════╝░$RC\n")




                Thread.sleep(1000)
                if (kunde(benutzername)!!.warenkorb.isNotEmpty()) {
                    println("Ihre derzeitigen Produkte im Warenkorb\n")

                    for (i in kunde(benutzername)!!.warenkorb) {
                        println("[${i.toString()}")
                        gesamtpreis += i.preis

                    }
                    auswahlListe.add("Bezahlen",)
                    auswahlListe.add("Produkt entfernen")

                    println("\nGesamtpreis: $B%.2f€$RC\n".format(gesamtpreis))
                }else{
                    println("Ihr Warenkorb ist leer\n")
                }
                println("\nWas möchten sie erledigen")
                for (i in auswahlListe.indices){
                    println("[${i+1}] ${auswahlListe[i]}")
                }


                val aInput = readln().toInt()

                when (aInput){
                   1 ->{kundenMenue(benutzername) }
                   2 ->{bezahlen(benutzername,gesamtpreis)}
                   3 ->{produktentfernen(benutzername)}
                }

            }catch (e:Exception){
                println("Probieren sie es noch einmal")
                continue
            }
        }

    }

    fun produktentfernen(benutzername: String){
       while (true){
           try {

                       if (kunde(benutzername)!!.warenkorb.isNotEmpty()) {
                           for (i in kunde(benutzername)!!.warenkorb.indices) {
                               println("[${i + 1}] ${kunde(benutzername)!!.warenkorb[i].toString()}")
                           }

                           println("\nWelches Produkt möchten sie entfernen wählen sie anhand der Ziffer")
                           val pInput = readln().toInt()

                           println("\nSind sie sicher das sie ${kunde(benutzername)!!.warenkorb[pInput - 1]} entfernen möchten\nJa/Nein\n")



                           val chek = readln().lowercase()

                           when (chek) {
                               "ja" -> {

                                   val i =kategorie.artikel.indexOf(kunde(benutzername)!!.warenkorb[pInput-1])
                                   kategorie.artikel[i].anzahl+=1

                                   kunde(benutzername)!!.warenkorb.removeAt(pInput - 1)

                                   println("${kunde(benutzername)!!.warenkorb[pInput - 1]} wurde entfernt aus ihrem Warenkorb")




                                   println("\nMöchten sie einen weiteren artikel entfernen Ja/nein")
                                   val wInput = readln().lowercase()
                                   when (wInput){
                                       "ja" -> continue
                                       "nein" -> {println("Zurück zum Warenkorb")
                                                  Thread.sleep(1000)
                                                  break}
                                   }
                               }

                               "nein" -> {
                                   continue
                               }
                           }
                       }


           }catch (e:Exception){
               println("Probieren sie es noch einmal")
               continue
           }
       }


    }

    private fun bezahlen(benutzername: String, gesamtpreis:Double){

        var preis = gesamtpreis
        while (true){
            try {
                val vList = listOf<String>("Dul [+1,99€]","Lps [+3,99€]","Paintballstore Lime lieferung bis Morgen [+5,99€]")
                println("\nWählen sie den versand aus\n")

                for (i in vList.indices){
                    println("[${i+1}] ${vList[i]}")
                }

                val vIput = readln().toInt()

                when (vIput){
                    1 -> preis+=1.99
                    2 -> preis+=3.99
                    3 -> preis+=5.99
                }

                println("Sie haben sich für ${vList[vIput-1]} entschieden\n")

                println("Bei Ihrer Registrierung haben sie angegeben das sie mit ${kunde(benutzername)!!.zahlungsmethode} Zahlen wollen ist das Richtig Ja/Nein")
                val aInput = readln().lowercase()
                val bezahlenList = listOf<String>("bezahlen","Später bezahlen")
                when (aInput){
                    "ja" -> {
                        println("\nWählen sie aus")
                        for (i in bezahlenList.indices){
                            println("[${i+1}] ${bezahlenList[i]}")
                        }
                        val bInput = readln().toInt()
                        when (bInput){
                            1 -> {println("der zu bezahlenter Preis ist $B%.2f€$RC\n".format(preis))

                                println("sie werden zu ${kunde(benutzername)!!.zahlungsmethode} weitergeleitet.....")
                                Thread.sleep(1000)
                                repeat(5){ println() }

                                println("Willkommen bei ${kunde(benutzername)!!.zahlungsmethode}\n")

                                println("Benutzername:")
                                val bname = readln()
                                println("Passwort:")
                                val passw = readln().toInt()

                                if (bname == kunde(benutzername)!!.benutzername && passw == kunde(benutzername)!!.passwort){
                                    println("Sie sind erfolgreich bei ${kunde(benutzername)!!.zahlungsmethode} Eingelogt\n")
                                    println("betrag von $B%.2f€$RC bezahlen Ja/Nein".format(preis))
                                    val bezInput = readln().lowercase()
                                    when(bezInput){
                                        "ja"-> {
                                            println()
                                        println("Bezahlung War erfolgreich sie werden zum PaintballStore zurück geleitet")
                                            repeat(10){ println() }

                                            println(
                                                "\n" +
                                                        "${fg(34)}██████╗░░█████╗░██╗███╗░░██╗████████╗██████╗░░█████╗░██╗░░░░░██╗░░░░░░██████╗████████╗░█████╗░██████╗░███████╗$RC\n" +
                                                        "${fg(34)}██╔══██╗██╔══██╗██║████╗░██║╚══██╔══╝██╔══██╗██╔══██╗██║░░░░░██║░░░░░██╔════╝╚══██╔══╝██╔══██╗██╔══██╗██╔════╝$RC\n" +
                                                        "${fg(34)}██████╔╝███████║██║██╔██╗██║░░░██║░░░██████╦╝███████║██║░░░░░██║░░░░░╚█████╗░░░░██║░░░██║░░██║██████╔╝█████╗░░$RC\n" +
                                                        "${fg(34)}██╔═══╝░██╔══██║██║██║╚████║░░░██║░░░██╔══██╗██╔══██║██║░░░░░██║░░░░░░╚═══██╗░░░██║░░░██║░░██║██╔══██╗██╔══╝░░$RC\n" +
                                                        "${fg(34)}██║░░░░░██║░░██║██║██║░╚███║░░░██║░░░██████╦╝██║░░██║███████╗███████╗██████╔╝░░░██║░░░╚█████╔╝██║░░██║███████╗$RC\n" +
                                                        "${fg(34)}╚═╝░░░░░╚═╝░░╚═╝╚═╝╚═╝░░╚══╝░░░╚═╝░░░╚═════╝░╚═╝░░╚═╝╚══════╝╚══════╝╚═════╝░░░░╚═╝░░░░╚════╝░╚═╝░░╚═╝╚══════╝$RC"
                                            )

                                            println("Vielen Dank für ihren kauf von\n")
                                            for (i in kunde(benutzername)!!.warenkorb.indices){
                                                println("${kunde(benutzername)!!.warenkorb[i]}")
                                            }
                                            println("\nMöchten sie eine Bewertung für ein Produkt ab geben Ja/Nein")
                                            val yesno = readln().lowercase()

                                            when (yesno){
                                                "ja" ->{
                                                    println("Für welche Produkt möchten sie eine Bewertung abgeben wählen sie anhand der Ziffern ?")
                                                    for (i in kunde(benutzername)!!.warenkorb.indices){
                                                        println("[${i+1}] ${kunde(benutzername)!!.warenkorb[i]}")
                                                    }
                                                    val bewertung = readln().toInt()
                                                    val index = kategorie.artikel.indexOf(kunde(benutzername)!!.warenkorb[bewertung-1])
                                                    println("\nwas für eine Bewertung geben sie ${kunde(benutzername)!!.warenkorb[bewertung-1]} von 1-10")
                                                    val beInput = readln().toInt()
                                                    if (kategorie.artikel[index].kundenrezesion <= beInput){
                                                        kategorie.artikel[index].kundenrezesion+=beInput
                                                    }
                                                    println("Vielen dank für ihre Bewertung")
                                                    kunde(benutzername)!!.warenkorb.clear()
                                                    break
                                                }
                                                "nein" ->{kunde(benutzername)!!.warenkorb.clear()
                                                          break}
                                            }
                                        }"nein" -> {
                                                    println("Sie werden zum PaintballStore zurück geleitet")
                                                    break}
                                    }
                                }

                            }
                            2-> {break}
                        }
                    }
                }


            }catch (e:Exception){
                println("Probieren sie es noch einmal")
                continue
            }

        }

    }
    fun filterMenue(benutzername: String){
        do {
            try {
                repeat(10){
                    println()
                }
                println("${B}Was Möchten sie erledigen \nWählen sie anhand der Ziffern$RC\n")

                val auswahlListe = listOf<String>("Nach Kategorie","Nach Produkt Kategorie","Nach Preis sortieren","Alphabetich Sotieren","Zurück")

                for (i in auswahlListe.indices){
                    println("[${i+1}] ${auswahlListe[i]}")
                }
                val aInput = readln().toInt()

                when (aInput){

                    1 ->{kategorie.filterUnterkategorien()
                         produktWarenkorbhinzufuegen(benutzername)}
                    2 ->{kategorie.filterproduct()
                         produktWarenkorbhinzufuegen(benutzername)}
                    3 ->{kategorie.sortPreis()
                         produktWarenkorbhinzufuegen(benutzername)}
                    4 ->{kategorie.sortAlphabetischmarke()
                         produktWarenkorbhinzufuegen(benutzername)}
                    5 ->{kundenMenue(benutzername)}
                }



            }catch (e:Exception){
                println("Falsche eingabe Probieren sie es noch einmal")
                continue
            }

        }while (true)
    }

    private fun produktWarenkorbhinzufuegen(benutzername: String){
        do {
            try {
                val auswahlListe = listOf<String>("Produkt auswählen","Zurück")
                println("\n${B}Wählen sie aus anhand der Ziffern$RC")
                for (i in auswahlListe.indices){
                    println("[${i+1}] ${auswahlListe[i]}")
                }
                val aInput = readln().toInt()
                when (aInput){
                    1 -> {
                        println("Wählen sie ihr Produkt anhand der Ziffer")
                        val pInput = readln().toInt()-1
                        println("\nSie haben Produkt: ${kategorie.artikel[pInput]} ausgewählt möchten sie es dem Warenkorb hinzufügen  Ja/Nein")
                        val wHinput = readln().lowercase()

                        when (wHinput){
                            "ja"->{kunde(benutzername)!!.warenkorb.add(kategorie.artikel[pInput])
                                   kategorie.artikel[pInput].anzahl-=1
                                   println("\nDas Produkt ${kategorie.artikel[pInput]} wurde ihrem Warenkorb hinzugefügt\n")
                                continue
                            }
                            "nein"->{continue}
                        }

                    }
                    2 -> {
                        break
                    }
                }
            }catch (e:Exception) {
                println("Falsche eingabe Probieren sie es noch einmal")
                continue
            }
        }while (true)


    }
}