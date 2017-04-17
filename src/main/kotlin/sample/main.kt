package sample

import org.w3c.dom.HTMLDivElement
import kotlin.browser.document

fun main() {
    val div = document.getElementById("app") as HTMLDivElement
    div.innerHTML = "hello"
}
