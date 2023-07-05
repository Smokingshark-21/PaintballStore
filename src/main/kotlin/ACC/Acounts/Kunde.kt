package ACC.Acounts

import ACC.Account

class Kunde(
    benutzername:String,
    passort:Int,
    var zahlungsmethode:String
):Account(benutzername,passort, isadmin = false){

    fun bewerten(){}

    fun warenkorb(){}
}