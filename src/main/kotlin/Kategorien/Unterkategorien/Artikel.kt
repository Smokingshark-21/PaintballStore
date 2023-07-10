package Kategorien.Unterkategorien

import Kategorien.Unterkategorien.artikel.RC
import Kategorien.Unterkategorien.artikel.fg

open class Artikel(
    var marke:String,
    var name:String,
    var preis:Double,
    var kundenrezesion:Int,
    var anzahl:Int,
    var farbe:String) {

    override fun toString(): String {
        return "${fg(45)}Marke:$RC[$marke] ,${fg(51)}Name:$RC[$name] ,${fg(47)}Preis:$RC[$preis€] ,${fg(87)}Bewertung:$RC[$kundenrezesion von 100] ,${fg(123)}Farbe:$RC[$farbe] "
    }


}