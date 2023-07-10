package Kategorien.Unterkategorien

open class Artikel(
    var marke:String,
    var name:String,
    var preis:Double,
    var kundenrezesion:Int,
    var anzahl:Int,
    var farbe:String) {

    override fun toString(): String {
        return "Marke:$marke Name:$name Preis:$preis€ Bewertung:$kundenrezesion Farbe:$farbe "
    }


}