package ACC.Acounts

import ACC.Account
import Kategorien.Unterkategorien.Artikel

class Kunde(
    var email:String,
        benutzername:String,
        passwort:Int,
    var zahlungsmethode:String,
):Konto(benutzername,passwort, isAdmin =false, eingeloggt = false){


    var warenkorb= mutableListOf<Artikel>()
}