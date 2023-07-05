package ACC.Acounts

import ACC.Account

class Betreiber(
    benutzername:String,
    passwort:Int

):Account(benutzername,passwort, isadmin = true) {

    fun produktBearbeiten(){}

}