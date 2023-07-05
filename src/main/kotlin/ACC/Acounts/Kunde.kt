package ACC.Acounts

import ACC.Account

class Kunde(
    var email:String,
        benutzername:String,
        passwort:Int,
    var zahlungsmethode:String
):Konto(benutzername,passwort, isAdmin =false, eingelogt = false){

    fun bewerten(){}

    fun warenkorb(){}
}