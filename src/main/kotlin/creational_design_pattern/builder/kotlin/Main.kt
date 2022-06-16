package creational_design_pattern.builder.kotlin

fun main() {
    //Kotlin
    val firstUser = User.Builder("Santiago", "Mattiauda")
        .withAge(29)
        .build()

    println("$firstUser")

    val secondUser = userBuilder("Santiago", "Mattiauda") {
        withAge(29)
    }

    println("$secondUser")


}