package com.istec.webservice.Controller

import com.istec.webservice.Model.Card
import com.istec.webservice.Repo.CardRepo
import org.springframework.web.bind.annotation.*

@RestController
class ECon {
    var cardsRepo = CardRepo()

    @GetMapping("/getCards") // localhost:8080/getCards
    fun getCards():List<Card>{
        return cardsRepo.retrieveAllCards()
    }

    @PostMapping(value=["/createCard"], consumes = ["application/json"]) // curl -x post -h "content-type:application/json" -d "{'id':1000,'nome':test,'collected':false}" localhost:8080/createCard
    fun createCard(@RequestBody std:Card):String{
        return cardsRepo.addCard(std)
    }

    @DeleteMapping(value=["/destroyCard/{id}"], consumes = ["application/json"])
    fun destroyCard(@PathVariable("id") @RequestBody id:Int): List<Card> {
        return  cardsRepo.deleteCard(id)
    }

    @GetMapping("/thetruename/{true}")
    fun onecard(@PathVariable("true") @RequestBody id:Int):Card?{
        return cardsRepo.retrieveCardById(id)
    }


}