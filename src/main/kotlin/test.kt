import ACC.Account
import ACC.Acounts.Konto
import Kategorien.*

fun main(){



    var t1 = Kategorie()
    var a = Account()
  /*  t1.filterUnterkategorien()
    println()
    t1.filterproduct()
    println()
    t1.sortAlphabetischmarke()
    println()
    t1.sortPreis()

*/
    a.einlogen()
    a.auslogen("admin")

}