package com.yunxian.kotlin.chapter07.sec05.notification3

import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport
import kotlin.reflect.KProperty

class ObservableProperty(val propName: String, var propValue: Int, val changeSupport: PropertyChangeSupport) {

    operator fun getValue(p: Person, prop: KProperty<*>): Int = propValue

    operator fun setValue(p: Person, prop: KProperty<*>, newValue: Int) {
        val oldValue = propValue
        propValue = newValue
        changeSupport.firePropertyChange(propName, oldValue, newValue)
    }

}

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

    var age: Int by ObservableProperty("age", age, changeSupport)

    var salary: Int by ObservableProperty("salary", salary, changeSupport)
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
