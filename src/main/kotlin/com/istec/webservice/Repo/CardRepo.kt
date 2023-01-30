package com.istec.webservice.Repo

import com.istec.webservice.Model.Card

class CardRepo {
    private var AllCards = mutableListOf<Card>()
    init {
        val card1 = Card(57835716,"Orcust Harp Horror",false)
        val card2 = Card(42632209,"Geomathmech Final Sigma",true)
        AllCards.add(card1)
        AllCards.add(card2)
    }
    //CRUD OPERATIONS
    //CREATE
    fun addCard(std:Card):String{
        AllCards.add(std)
        return "Foi adicionada a Carta ${std.nome}"
    }
    //READ
    fun retrieveAllCards():List<Card>{
        return AllCards
    }
    //RETRIEVE INFO
    fun retrieveCardById(id: Int): Card?{
        return AllCards.find { std ->
            std.id==id
        }
    }

    //DELETE
    fun deleteCard(id: Int):List<Card>{
        var std:Card? = retrieveCardById(id)
        AllCards.remove(std)
        return AllCards
    }
}