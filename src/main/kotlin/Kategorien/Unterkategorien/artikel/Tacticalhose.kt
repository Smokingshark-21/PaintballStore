package Kategorien.Unterkategorien.artikel

import Kategorien.Unterkategorien.Ausrüstung

class Tacticalhose(
    marke:String,
    name:String,
    preis:Double,
    kundenrezesion:Int,
    anzahl:Int,
    farbe:String,
    groeße:String,
    var protektoren:Boolean): Ausrüstung(marke,name,preis,kundenrezesion,anzahl,farbe,groeße) {
    override fun toString(): String {
        return "$marke $name $preis€ $kundenrezesion $anzahl $farbe $groeße $protektoren "
    }
}
