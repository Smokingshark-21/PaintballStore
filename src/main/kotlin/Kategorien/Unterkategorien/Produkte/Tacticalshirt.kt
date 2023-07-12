package Kategorien.Unterkategorien.Produkte

import Kategorien.Unterkategorien.Ausrüstung

class Tacticalshirt(
    marke:String,
    name:String,
    preis:Double,
    kundenrezesion:Int,
    anzahl:Int,
    farbe:String,
    groeße:String,
    var kurz:Boolean): Ausrüstung(marke,name,preis,kundenrezesion,anzahl,farbe,groeße) {

        fun kurzlang():String{
            var armlänge = ""
             if (kurz){
                 armlänge = "Kurz"
            }else{
                armlänge = "Lang"
            }
            return armlänge
        }
    override fun toString(): String {
        return super.toString()+"|${fg(14)}Größe:$RC[$groeße]".padEnd(31) +
                "|${fg(33)}Armlänge:$RC[${kurzlang()}]"
    }
}
