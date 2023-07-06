import ACC.Account
import ACC.Acounts.Kunde
import Kategorien.Kategorie

class Paintballstore() {

    var kategorie = Kategorie()
    var acc = Account()


    fun loginRegister() {
        do {
            try {

                var auswahlListe = listOf<String>("Login", "Registrieren")

                println("Wähle sie anhand der Ziffern aus\n")
                for (i in auswahlListe.indices) {
                    println("[${i + 1}] ${auswahlListe[i]}\n")
                }

                var lrInput = readln().toInt()

                when (lrInput) {
                    1 -> {
                        var benutzer = acc.einlogen()
                        for (i in acc.accountliste)

                            if (i.eingelogt) {

                                if (i.isAdmin){
                                    adminMenue() //ToDo Fertigstellen
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

    fun adminMenue(){}
    fun kundenMenue(benutzername:String) {

        while (true) {
            try {
                println(
                    "\n" +
                            "██████╗░░█████╗░██╗███╗░░██╗████████╗██████╗░░█████╗░██╗░░░░░██╗░░░░░░██████╗████████╗░█████╗░██████╗░███████╗\n" +
                            "██╔══██╗██╔══██╗██║████╗░██║╚══██╔══╝██╔══██╗██╔══██╗██║░░░░░██║░░░░░██╔════╝╚══██╔══╝██╔══██╗██╔══██╗██╔════╝\n" +
                            "██████╔╝███████║██║██╔██╗██║░░░██║░░░██████╦╝███████║██║░░░░░██║░░░░░╚█████╗░░░░██║░░░██║░░██║██████╔╝█████╗░░\n" +
                            "██╔═══╝░██╔══██║██║██║╚████║░░░██║░░░██╔══██╗██╔══██║██║░░░░░██║░░░░░░╚═══██╗░░░██║░░░██║░░██║██╔══██╗██╔══╝░░\n" +
                            "██║░░░░░██║░░██║██║██║░╚███║░░░██║░░░██████╦╝██║░░██║███████╗███████╗██████╔╝░░░██║░░░╚█████╔╝██║░░██║███████╗\n" +
                            "╚═╝░░░░░╚═╝░░╚═╝╚═╝╚═╝░░╚══╝░░░╚═╝░░░╚═════╝░╚═╝░░╚═╝╚══════╝╚══════╝╚═════╝░░░░╚═╝░░░░╚════╝░╚═╝░░╚═╝╚══════╝"
                )

                Thread.sleep(3000)

                println("\nDas sind unsere derzeitigen Artikel:\n")

                for (i in kategorie.artikel.indices){
                    println(kategorie.artikel[i].toString())
                }
                println()
                var auswahlListe = listOf<String>("Filtern","Warenkorb","Auslogen")
                println("Wählen sie anhand der Ziffern")
                for (i in auswahlListe.indices){
                    println("[${i+1}] ${auswahlListe[i]}")
                }

                var aInput = readln().toInt()

                when (aInput){
                    1 -> {filterMenue()} //ToDo fertigstellen
                    2 -> {warenkorb(benutzername)}
                    3 -> {acc.auslogen(benutzername)
                          loginRegister()}
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
            try {
                val auswahlListe = mutableListOf<String>("zurück zum Menü")
                println("\n" +
                        "░██╗░░░░░░░██╗░█████╗░██████╗░███████╗███╗░░██╗██╗░░██╗░█████╗░██████╗░██████╗░\n" +
                        "░██║░░██╗░░██║██╔══██╗██╔══██╗██╔════╝████╗░██║██║░██╔╝██╔══██╗██╔══██╗██╔══██╗\n" +
                        "░╚██╗████╗██╔╝███████║██████╔╝█████╗░░██╔██╗██║█████═╝░██║░░██║██████╔╝██████╦╝\n" +
                        "░░████╔═████║░██╔══██║██╔══██╗██╔══╝░░██║╚████║██╔═██╗░██║░░██║██╔══██╗██╔══██╗\n" +
                        "░░╚██╔╝░╚██╔╝░██║░░██║██║░░██║███████╗██║░╚███║██║░╚██╗╚█████╔╝██║░░██║██████╦╝\n" +
                        "░░░╚═╝░░░╚═╝░░╚═╝░░╚═╝╚═╝░░╚═╝╚══════╝╚═╝░░╚══╝╚═╝░░╚═╝░╚════╝░╚═╝░░╚═╝╚═════╝░\n")

                Thread.sleep(1000)
                if (kunde(benutzername)!!.warenkorb.isNotEmpty()) {
                    println("Ihre derzeitigen Produkte im Warenkorb\n")
                    var gesamtpreis = 0.0
                    for (i in kunde(benutzername)!!.warenkorb) {
                        println("[${i.toString()}")
                        gesamtpreis += i.preis

                    }
                    auswahlListe.add("Bezahlen",)
                    auswahlListe.add("Produkt entfernen")

                    println("Gesamtpreis $gesamtpreis€\n")
                }else{
                    println("Ihr Warenkorb ist leer\n")
                }
                for (i in auswahlListe.indices){
                    println("[${i+1}] ${auswahlListe[i]}")
                }

                println("\nWas möchten sie erledigen")
                val aInput = readln().toInt()

                when (aInput){
                   1 ->{kundenMenue(benutzername) }
                   2 ->{bezahlen(benutzername)} //ToDo Fertigstellen
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
               val auswahlListe= listOf<String>("Produkt entfernen","Zurück zum Warenkorb")
               println("\n" +
                       "██████╗░██████╗░░█████╗░██████╗░██╗░░░██╗██╗░░██╗████████╗ ███████╗███╗░░██╗████████╗███████╗███████╗██████╗░███╗░░██╗███████╗███╗░░██╗\n" +
                       "██╔══██╗██╔══██╗██╔══██╗██╔══██╗██║░░░██║██║░██╔╝╚══██╔══╝ ██╔════╝████╗░██║╚══██╔══╝██╔════╝██╔════╝██╔══██╗████╗░██║██╔════╝████╗░██║\n" +
                       "██████╔╝██████╔╝██║░░██║██║░░██║██║░░░██║█████═╝░░░░██║░░░ █████╗░░██╔██╗██║░░░██║░░░█████╗░░█████╗░░██████╔╝██╔██╗██║█████╗░░██╔██╗██║\n" +
                       "██╔═══╝░██╔══██╗██║░░██║██║░░██║██║░░░██║██╔═██╗░░░░██║░░░ ██╔══╝░░██║╚████║░░░██║░░░██╔══╝░░██╔══╝░░██╔══██╗██║╚████║██╔══╝░░██║╚████║\n" +
                       "██║░░░░░██║░░██║╚█████╔╝██████╔╝╚██████╔╝██║░╚██╗░░░██║░░░ ███████╗██║░╚███║░░░██║░░░██║░░░░░███████╗██║░░██║██║░╚███║███████╗██║░╚███║\n" +
                       "╚═╝░░░░░╚═╝░░╚═╝░╚════╝░╚═════╝░░╚═════╝░╚═╝░░╚═╝░░░╚═╝░░░ ╚══════╝╚═╝░░╚══╝░░░╚═╝░░░╚═╝░░░░░╚══════╝╚═╝░░╚═╝╚═╝░░╚══╝╚══════╝╚═╝░░╚══╝\n")
                    Thread.sleep(2000)

               println("Was möchten sie Erledigen")
               for (i in auswahlListe.indices){
                   println("[${i+1}] ${auswahlListe[i]}")
               }
               val aInput = readln().toInt()

               when (aInput){
                   1 -> {
                       if (kunde(benutzername)!!.warenkorb.isNotEmpty()) {
                           for (i in kunde(benutzername)!!.warenkorb.indices) {
                               println("[${i + 1}] ${kunde(benutzername)!!.warenkorb[i].toString()}")
                           }

                           println("\nWelches Produkt möchten sie entfernen wählen sie anhand der Ziffer")
                           val pInput = readln().toInt()

                           println("\n Sind sie sicher das sie ${kunde(benutzername)!!.warenkorb[pInput - 1]} entfernen möchten\nJa=entfernen || Nein=nicht entfernen\n")
                           val chek = readln().lowercase()

                           when (chek) {
                               "ja" -> {
                                   kunde(benutzername)!!.warenkorb.removeAt(pInput - 1)
                                   println("${kunde(benutzername)!!.warenkorb[pInput - 1]} wurde entfernt aus ihrem Warenkorb")
                               }

                               "nein" -> {
                                   produktentfernen(benutzername)
                               }
                           }
                       }else {
                           println("Der Warenkorb ist leer sie werden zum menü zurück geleitet")
                           Thread.sleep(2000)
                           kundenMenue(benutzername)
                       }}
                   2 -> {warenkorb(benutzername)}
               }


           }catch (e:Exception){
               println("Probieren sie es noch einmal")
               continue
           }
       }


    }

    fun bezahlen(benutzername: String){

    }
    fun filterMenue(){}

}