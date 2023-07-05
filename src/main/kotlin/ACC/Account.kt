package ACC

open class Account(
    var benutzerName:String,
    var passwort:Int,
    var isadmin:Boolean
) {
    var accountliste = mutableListOf<Account>()

    fun einlogen(){}

    fun auslogen(){}

    fun accountErstellen(){

        do {
            try {
                println("Wilkommen bei der Erstellung ihren Kontos\n")

                println("Geben sie ihren benutzernamen ein")
                var bInput = readln()



            }catch (e:Exception){
                println("Falsche eingabe probiere es noch einmal")
                continue
            }
        }while (true)

    }
}