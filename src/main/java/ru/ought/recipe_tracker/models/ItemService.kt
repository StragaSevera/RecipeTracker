package ru.ought.recipe_tracker.models

import org.springframework.stereotype.Component

@Component
class ItemService(val repository: ItemRepository) {
    fun addItem(name: String) {
        repository.addItem(Item(name))
    }

    fun getMatchingItemNames(prefix: String): List<String> {
        return repository.getItems().map { it.name }.filter { it.startsWith(prefix) }
    }

}