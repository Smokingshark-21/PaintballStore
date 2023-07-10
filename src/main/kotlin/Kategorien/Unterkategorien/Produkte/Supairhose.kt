package Kategorien.Unterkategorien.Produkte

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

        fun slider():String{
            var slider= ""
            if (slide){
                slider="Ja"
            }else{
                slider="Nein"
            }
            return slider
        }
    override fun toString(): String {
        return super.toString()+" ,Größe:[$groeße] ,Slide Hose:[${slider()}]"
    }
}