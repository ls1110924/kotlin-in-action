package com.yunxian.kotlin.chapter07.sec05.notification2

import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport

class ObservableProperty(val propName: String, var propValue: Int, val changeSupport: PropertyChangeSupport) {

    fun getValue(): Int = propValue

    fun setValue(newValue: Int) {
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

    val _age = ObservableProperty("age", age, changeSupport)
    var age: Int
        get() = _age.getValue()
        set(value) = _age.setValue(value)

    val _salary = ObservableProperty("salary", salary, changeSupport)
    var salary: Int
        get() = _salary.getValue()
        set(value) = _salary.setValue(value)

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
