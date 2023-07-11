package Kategorien.Unterkategorien

import Kategorien.Unterkategorien.Produkte.RC
import Kategorien.Unterkategorien.Produkte.fg

open class Artikel(
    var marke:String,
    var name:String,
    var preis:Double,
    var kundenrezesion:Int,
    var anzahl:Int,
    var farbe:String) {

    override fun toString(): String {
        var first = "|${fg(45)}Marke:$RC[$marke]".padEnd(37)
        first+="|${fg(51)}Name:$RC[$name]".padEnd(40)
        first+="|${fg(47)}Preis:$RC[$preis€]".padEnd(30)
        first+="|${fg(87)}Bewertung:$RC[$kundenrezesion von 100]".padEnd(40)
        first+="|${fg(123)}Farbe:$RC[$farbe]".padEnd(28)
        return  first

    }


}