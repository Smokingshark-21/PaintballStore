package ACC.Acounts

class Betreiber(
    benutzername:String,
    passwort:Int

):Konto(benutzername,passwort, isAdmin = true, eingeloggt = false) {}