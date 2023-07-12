package Kategorien.Unterkategorien

open class Markierer(
    marke:String,
    name:String,
    preis:Double,
    kundenrezesion:Int,
    anzahl:Int,
    farbe:String,
    var kaliber:Int,): Artikel(marke,name,preis,kundenrezesion,anzahl,farbe) {

}