package Kategorien.Unterkategorien



open class Ausrüstung(
    marke:String,
    name:String,
    preis:Double,
    kundenrezesion:Int,
    anzahl:Int,
    farbe:String,
    var groeße:String,): Artikel(marke,name,preis,kundenrezesion,anzahl,farbe) {}