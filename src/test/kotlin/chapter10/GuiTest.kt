package chapter10

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class GuiTest {
    @Test
    fun testTextView() {
        val textView = TextView("tv1", "Hello, World!")

        assertEquals("tv1", textView.id)

        textView.text = "Welcome to Kotlin!"
        assertEquals("Welcome to Kotlin!", textView.text)
        assertEquals(true, textView.isVisible)

        textView.hide()
        assertEquals(false, textView.isVisible)
    }

    @Test
    fun testToggle() {
        val toggle = Toggle("toggle1")

        assertEquals("toggle1", toggle.id)

        assertEquals(false, toggle.isOn)
        toggle.click()
        assertEquals(true, toggle.isOn)

        assertEquals(true, toggle.isVisible)
        toggle.hide()
        assertEquals(false, toggle.isVisible)
    }
}
