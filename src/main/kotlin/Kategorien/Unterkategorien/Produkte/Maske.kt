package Kategorien.Unterkategorien.Produkte

import Kategorien.Unterkategorien.Ausrüstung

class Maske(
    marke:String,
    name:String,
    preis:Double,
    kundenrezesion:Int,
    anzahl:Int,
    farbe:String,
    groeße:String,
    var glasfarbe:String, ): Ausrüstung(marke,name,preis,kundenrezesion,anzahl,farbe,groeße) {
    override fun toString(): String {
        return super.toString()+" ,Größe:[$groeße] ,Glas Farbe:[$glasfarbe]"
    }
}