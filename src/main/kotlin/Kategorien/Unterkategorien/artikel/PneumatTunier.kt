package Kategorien.Unterkategorien.artikel

import Kategorien.Unterkategorien.Makierer

class PneumatTunier(
    marke:String,
    name:String,
    preis:Double,
    kundenrezesion:Int,
    anzahl:Int,
    farbe:String,
    kaliber:Int,
    var schussprosekunde:Int): Makierer(marke,name,preis,kundenrezesion,anzahl,farbe,kaliber) {
    override fun toString(): String {
        return "$marke $name $preis€ $kundenrezesion $farbe $kaliber $schussprosekunde"
    }
}