package creational_design_pattern.builder

import creational_design_pattern.builder.java.User

fun main() {
    //Java
    val userBuilder = User.UserBuilder("Santiago", "Mattiauda")
        .withAge(29)

    val user = User(userBuilder)

    println("$user")
}