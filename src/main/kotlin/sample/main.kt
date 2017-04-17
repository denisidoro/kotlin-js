package sample

import org.w3c.dom.HTMLDivElement
import kotlin.browser.document

fun main() {
    val div = document.getElementById("app") as HTMLDivElement
    val names = arrayOf("hello", "kotlin", "js")

    names.forEach {
        val paragraph = document.createElement("p")
        paragraph.innerHTML = it
        div.appendChild(paragraph)
    }
}
