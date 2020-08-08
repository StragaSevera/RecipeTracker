package ru.ought.recipe_tracker.models

import org.springframework.stereotype.Component

@Component
class ItemRepository {
    private val _items = mutableListOf<Item>()
    fun getItems(): List<Item> = _items

    fun addItem(item: Item) {
        _items.add(item)
    }
}