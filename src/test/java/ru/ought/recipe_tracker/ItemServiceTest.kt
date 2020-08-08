package ru.ought.recipe_tracker

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.collections.shouldContainExactly
import org.springframework.test.context.ContextConfiguration
import ru.ought.recipe_tracker.models.ItemService
import ru.ought.recipe_tracker.models.SpringConfiguration

@ContextConfiguration(classes = [SpringConfiguration::class])
class ItemServiceTest(service: ItemService) : ShouldSpec() {
    init {
        should("retreive items by prefix") {
            service.addItem("Dirt")
            service.addItem("Dragon Egg")
            service.addItem("Lava")

            service.getMatchingItemNames("D").shouldContainExactly("Dirt", "Dragon Egg")
        }
    }
}