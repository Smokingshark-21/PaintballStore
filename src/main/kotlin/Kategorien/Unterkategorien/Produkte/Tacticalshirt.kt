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
        return super.toString()+" ,Größe:[$groeße] ,Armlänge:[${kurzlang()}]"
    }
}