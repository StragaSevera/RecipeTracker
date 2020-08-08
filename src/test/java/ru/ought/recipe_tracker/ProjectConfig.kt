package ru.ought.recipe_tracker

import io.kotest.core.config.AbstractProjectConfig
import io.kotest.core.extensions.Extension
import io.kotest.core.listeners.Listener
import io.kotest.core.spec.IsolationMode
import io.kotest.spring.SpringAutowireConstructorExtension
import io.kotest.spring.SpringListener

class ProjectConfig : AbstractProjectConfig() {
    override val isolationMode: IsolationMode?
        get() = IsolationMode.InstancePerLeaf

    override fun extensions(): List<Extension> = listOf(SpringAutowireConstructorExtension)
}