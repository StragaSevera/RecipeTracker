package ru.ought.recipe_tracker

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.collections.shouldContainExactly
import ru.ought.recipe_tracker.models.Item
import ru.ought.recipe_tracker.models.ItemRepository

class ItemRepositoryTest : DescribeSpec({
    describe("ItemService") {
        it("can add and retrieve items") {
            val sut = ItemRepository()
            sut.addItem(Item("Dirt"))
            sut.getItems().shouldContainExactly(Item("Dirt"))
        }
    }
})