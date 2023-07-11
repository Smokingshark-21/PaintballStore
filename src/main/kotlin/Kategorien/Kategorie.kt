package Kategorien


import Kategorien.Unterkategorien.Artikel
import Kategorien.Unterkategorien.Ausrüstung
import Kategorien.Unterkategorien.Makierer
import Kategorien.Unterkategorien.Produkte.*



class Kategorie() {

    var artikel = mutableListOf<Artikel>(
        Maske("HK-Army","Skull Punisher",109.90,5,15,"Schwarz","Variable","klar"),
        Maske("Dye","I5",179.95,3,50,"Weiß","variable","klar"),
        Supairhose("Planet Eclipse","Program Pant FANTM",149.95,5,30,"Schwarz","L",false),
        Supairhose("Dye","LT Pan",139.95,5,20,"Weiß","Xl",true),
        Jersey("Mayhem","Camo B/C",69.95,3,30,"Schwarz","XL","Mayhem"),
        Jersey("Valken","V-Tac Zulu V-Cam",57.17,3,10,"Flecktarn","XS","/"),
        Tacticalhose("Delta Six","Spec-Ops",89.95,95,30,"Multicam","XXL",true),
        Tacticalhose("Invader Gear","Feldhose",87.99,3,20,"Flecktarn","M",false),
        Tacticalshirt("Helikon-Tex","MCDU Combat",59.90,5,100,"Flecktarn","XL",false),
        Tacticalshirt("Defcon 5","Lycra Combat",41.89,3,120,"Multicam","M",false),
        Magfed("Rap4","468",800.0,95,10,"Schwarz",68,5),
        PneumatTunier("Planet Eclipse","ETHA 3",599.95,5,100,"Schwarz",68,15)
    )

    fun filterUnterkategorien() {

        print("\nAusrüstung\n")
        for (i in artikel){
            if (i is Ausrüstung) {
                val j = artikel.indexOf(i)
                println("[${j + 1}] ${artikel[j].toString()}")
            }
            else continue
        }
        print("\nMakierer\n")
        for (i in artikel) {
            if (i is Makierer) {
                val j = artikel.indexOf(i)
                println("[${j + 1}] ${artikel[j].toString()}")
            }
        }

    }

    fun filterproduct(){


                    println("\nMagfed Makierer")
                    for (i in artikel){
                        if (i is Magfed){
                            val j = artikel.indexOf(i)
                            println("[${j + 1}] ${artikel[j].toString()}")
                        }
                    }

                    println("\nPneumatTunier Makierer")
                    for (i in artikel){
                        if (i is PneumatTunier){
                            val j = artikel.indexOf(i)
                            println("[${j + 1}] ${artikel[j].toString()}")
                        }
                    }

                    println("\nSupairhosen")
                    for (i in artikel){
                        if (i is Supairhose){
                            val j = artikel.indexOf(i)
                            println("[${j + 1}] ${artikel[j].toString()}")
                        }
                    }

                    println("\nMasken")
                    for (i in artikel) {
                        if (i is Maske) {
                            val j = artikel.indexOf(i)
                            println("[${j + 1}] ${artikel[j].toString()}")
                        }
                    }

                    println("\nTacticalshirts")
                    for (i in artikel) {
                        if (i is Tacticalshirt) {
                            val j = artikel.indexOf(i)
                            println("[${j + 1}] ${artikel[j].toString()}")
                        }
                    }

                    println("\nTacticalhosen")
                    for (i in artikel) {
                        if (i is Tacticalhose) {
                            val j = artikel.indexOf(i)
                            println("[${j + 1}] ${artikel[j].toString()}")
                        }
                    }

                    println("\nJerseys")
                    for (i in artikel) {
                        if (i is Jersey) {
                            val j = artikel.indexOf(i)
                            println("[${j + 1}] ${artikel[j].toString()}")
                        }
                    }


    }


    fun sortAlphabetischmarke(){
        this.artikel = artikel.sortedBy { it.marke }.toMutableList()
        for (i in artikel.indices){
            println("[${i+1}] ${artikel[i]}")
        }
    }

    fun sortPreis(){
        this.artikel = artikel.sortedBy { it.preis }.toMutableList()
        for (i in artikel.indices){
            println("[${i+1}] ${artikel[i]}")
        }
    }
}