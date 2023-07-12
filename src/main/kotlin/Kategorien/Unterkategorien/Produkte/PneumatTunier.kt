package Kategorien.Unterkategorien.Produkte

import Kategorien.Unterkategorien.Markierer

class PneumatTunier(
    marke:String,
    name:String,
    preis:Double,
    kundenrezesion:Int,
    anzahl:Int,
    farbe:String,
    kaliber:Int,
    var schussprosekunde:Int): Markierer(marke,name,preis,kundenrezesion,anzahl,farbe,kaliber) {
    override fun toString(): String {
        return super.toString()+"|${fg(14)}Kaliber:$RC[$kaliber]".padEnd(31) +
                "|${fg(33)}Schuss pro Sekunde:$RC[$schussprosekunde]"
    }
}