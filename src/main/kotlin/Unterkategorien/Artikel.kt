package Unterkategorien

open class Artikel(
    var marke:String,
    var name:String,
    var preis:Double,
    var kundenrezesion:Int,
    var anzahl:Int,
    var farbe:String) {

    override fun toString(): String {
        return "$marke $name $kundenrezesion $farbe $preis $anzahl"
    }
}