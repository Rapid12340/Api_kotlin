package com.istec.webservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.awt.Image
import java.io.IOException
import java.net.URL
import javax.imageio.ImageIO
import javax.swing.ImageIcon
import javax.swing.JFrame
import javax.swing.JLabel

@SpringBootApplication
class ProjetoIstecWebserviceApplication

fun main(args: Array<String>) {
	runApplication<ProjetoIstecWebserviceApplication>(*args)

	val urlcard: String = "https://db.ygoprodeck.com/api/v7/cardinfo.php?"
	val fname: String = "Maiden"
	val att: String = "light"
	val type: String = "spellcaster"
	val typin: String = "tuner%20monster"
	val arch: String = "blue-eyes"

	val resp = URL("${urlcard}fname=${fname}&attribute=${att}&race=${type}&type=${typin}&archetype=${arch}")
	println("")
	println("")
	println("")
	println(resp.readText())



}

