package Kategorien.Unterkategorien.Produkte

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

        fun pro():String{
            var protek = ""

            if (protektoren){
                protek="Ja"
            }else{
                protek="Nein"
            }
            return protek
        }
    override fun toString(): String {
        return super.toString()+" Größe:[$groeße] ,Protektoren:[${pro()}]"
    }
}
