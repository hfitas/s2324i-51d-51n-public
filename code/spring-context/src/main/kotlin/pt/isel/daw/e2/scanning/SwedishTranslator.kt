package pt.isel.daw.e2.scanning

import org.springframework.stereotype.Component

@Component
class SwedishTranslator : LanguageTranslator {

    override fun translate(englishWord: String): String? = map[englishWord]
    override val targetLanguage: String = "sv"

    companion object {
        private val map = mapOf(
            "Hello" to "Hej"
        )
    }
}