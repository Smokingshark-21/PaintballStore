package ACC

import ACC.Acounts.Betreiber
import ACC.Acounts.Konto
import ACC.Acounts.Kunde


class Account() {


    val accountliste = mutableListOf<Konto>(
        Betreiber("admin",1997),
        Kunde("max12@gmail.com","max",1912,"Payapal")
    )

    var zahlungsMethodenliste = mutableListOf<String>("Payapal","Klaruna","Sofort überweisung",)


    fun einlogen(){

        do {
            try {


                println("Geben sie ihren Benutzernamen ein")
                val bInput = readln().lowercase()


                println("Geben sie ihr Passwort ein")
                val pInput = readln().toInt()



                if (check(bInput,pInput)){
                    println("Willkommen $bInput")
                    Thread.sleep(1000)
                    break
                }else{
                    println("Falsche eingabe probieren sie es noch einmal")
                    continue
                }



            } catch (e: Exception) {
                println("Falsche eingabe probieren sie es noch einmal")
                continue
            }
        } while (true)
    }


    private fun check(input:String,passwort:Int):Boolean {

        var ceckBenutzerpasswort = false
        for (i in accountliste)
                if (i.benutzername == input && i.passwort == passwort){
                    ceckBenutzerpasswort = true
                    i.eingelogt=true
                }

        return ceckBenutzerpasswort
    }
    fun auslogen(benutzername:String){
        for (i in accountliste){
            if (i.benutzername == benutzername){
                i.eingelogt = false
            }
        }
    }

    fun accountErstellen(){

        do {
            try {
                var passwort = 0
                var zahlungsMehtode = ""
                var email = ""
                var benutzerName = ""


                println("Wilkommen bei der Erstellung ihren Kontos\n")

                println("Geben sie ihr alter ein")
                val ageInput = readln().toInt()

                if (ageInput < 12){
                    println("Registrieren nicht möglich")
                    break
                }

                do {
                    println("Geben sie ihre Email ein, es sind nur Google Email Adressen erlaubt")
                    val eInput = readln().lowercase()
                    if (eInput.contains("@gmail.com")){
                        email=eInput
                        break
                    }else{
                        println("Die eingabe[$eInput] ist keine Google Email Adresse")
                        continue
                    }
                }while (true)

                    println("Geben sie ihren benutzernamen ein:")
                    benutzerName = readln().lowercase()


                do {
                    println("Geben sie ein Passwort ein min 4 maximal 5 ziffern ein")
                    val pInput = readln().toInt()

                    if (pInput in 1000..99999){
                        passwort = pInput
                        break
                    } else{
                        println("Ihre eingabe[$pInput] war nicht richtig Probieren sie es noch einmal\n ")
                        Thread.sleep(1000)
                    }

                }while (true)

                zahlungsMehtode=zahlungsmethode()


                accountliste.add(Kunde(email,benutzerName,passwort,zahlungsMehtode))
                println("Ihr Konto wurde erfolgreich angelegt")
                break

            }catch (e:Exception){
                println("Falsche eingabe probieren sie es noch einmal")
                continue
            }
        }while (true)

    }

    fun zahlungsmethode():String{
        var zahlungsMehtode = ""
        do {
            println("Wählen sie eine zahlungsmethode aus anhand der ziffer\n")
            for (i in zahlungsMethodenliste.indices){
                println("[${i+1}] ${zahlungsMethodenliste[i]}")
            }
            val zInput = readln().toInt()

            when (zInput){
                1 -> {println("Sie haben erfolgreich ${zahlungsMethodenliste[0]} ausgewählt als ihre Zahlungsmethode")
                    zahlungsMehtode = zahlungsMethodenliste[0]
                    break
                }
                2 -> {println("Sie haben erfolgreich ${zahlungsMethodenliste[1]} ausgewählt als ihre Zahlungsmethode")
                    zahlungsMehtode = zahlungsMethodenliste[1]
                    break
                }
                3 -> {println("Sie haben erfolgreich ${zahlungsMethodenliste[2]} ausgewählt als ihre Zahlungsmethode")
                    zahlungsMehtode = zahlungsMethodenliste[2]
                    break
                }
                4 -> {
                    println("Sie haben erfolgreich ${zahlungsMethodenliste[3]} ausgewählt als ihre Zahlungsmethode")
                    zahlungsMehtode = zahlungsMethodenliste[3]
                    break
                }
                5 -> {
                    println("Sie haben erfolgreich ${zahlungsMethodenliste[4]} ausgewählt als ihre Zahlungsmethode")
                    zahlungsMehtode = zahlungsMethodenliste[4]
                    break
                }
            }
        }while (true)

        return zahlungsMehtode
    }
}