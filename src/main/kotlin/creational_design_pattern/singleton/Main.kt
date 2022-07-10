package creational_design_pattern.singleton

import creational_design_pattern.singleton.java.Singleton
import creational_design_pattern.singleton.kotlin.Singleton as KotlinSingleton

fun main() {
    //Java implementation
    val javaInstance = Singleton.getInstance()
    javaInstance.text = "Save text"
    //Kotlin implementation
    KotlinSingleton.text = "Save text"

}