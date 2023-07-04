package Kategorien

import Unterkategorien.Artikel

class Kategorie(artikelListe:MutableList<Artikel>) {

    var artikel = artikelListe
    fun filterUnterkategorien(){}

    fun filterAlphabetisch(){}

    fun filterPreis(){}

    fun auswahl(){}
}