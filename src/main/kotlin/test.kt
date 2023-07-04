import Unterkategorien.*
import artikel.*
import Kategorien.*

fun main(){

    var kategorienliste= mutableListOf<Artikel>(
        Maske("HK-Army","Skull Punisher",109.90,5,15,"Schwarz","Variable","klar"),
        Maske("Dye","I5",179.95,3,50,"Weiß","variable","klar"),
        Supairhose("Planet Eclipse","Program Pant FANTM",149.95,5,30,"Schwarz","L",false),
        Supairhose("Dye","LT Pan",139.95,5,20,"Weiß","Xl",true),
        Jersey("Mayhem","Camo B/C",69.95,3,30,"Schwarz","XL","Mayhem"),
        Jersey("Valken","V-Tac Zulu V-Cam",57.17,3,10,"Flecktarn","XS","/"),
        Tacticalhose("Delta Six","Spec-Ops",89.95,4,30,"Multicam","XXL",true),
        Tacticalhose("Invader Gear","Feldhose",87.99,3,20,"Flecktarn","M",false),
        Tacticalshirt("Helikon-Tex","MCDU Combat",59.90,5,100,"Flecktarn","XL",false),
        Tacticalshirt("Defcon 5","Lycra Combat",41.89,3,120,"Multicam","M",false),
    )

    var t1 = Kategorie(kategorienliste)

//    ""println(t1.artikel.toString())""
    for (i in t1.artikel){
        if (i is Jersey){
            println(i.toString())
        }
    }
}