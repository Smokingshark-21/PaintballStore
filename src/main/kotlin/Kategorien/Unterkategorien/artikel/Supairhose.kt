package Kategorien.Unterkategorien.artikel

import Kategorien.Unterkategorien.Ausrüstung

class Supairhose(
    marke:String,
    name:String,
    preis:Double,
    kundenrezesion:Int,
    anzahl:Int,
    farbe:String,
    groeße:String,
    var slide:Boolean, ): Ausrüstung(marke,name,preis,kundenrezesion,anzahl,farbe,groeße) {
    override fun toString(): String {
        return "$marke $name $preis€ $kundenrezesion $farbe $groeße $slide "
    }
}