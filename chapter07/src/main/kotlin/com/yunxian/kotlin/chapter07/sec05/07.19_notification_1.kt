package com.yunxian.kotlin.chapter07.sec05.notification

import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport

open class PropertyChangeAware {

    protected val changeSupport: PropertyChangeSupport = PropertyChangeSupport(this)

    fun addPropertyChangeListener(listener: PropertyChangeListener) {
        changeSupport.addPropertyChangeListener(listener)
    }

    fun removePropertyChangeListener(listener: PropertyChangeListener) {
        changeSupport.removePropertyChangeListener(listener)
    }

}

class Person(val name: String, age: Int, salary: Int) : PropertyChangeAware() {

    var age: Int = age
        set(value) {
            val oldValue = field
            field = value
            changeSupport.firePropertyChange("age", oldValue, value)
        }

    var salary: Int = salary
        set(value) {
            val oldValue = field
            field = value
            changeSupport.firePropertyChange("salary", oldValue, value)
        }

}

fun main(args: Array<String>) {
    val person = Person("A", 32, 1000)
    person.addPropertyChangeListener(PropertyChangeListener {
        println("${it.propertyName} changed, from ${it.oldValue} to ${it.newValue}")
    })

    person.age = 40
    person.age = 50

    person.salary = 800
}
