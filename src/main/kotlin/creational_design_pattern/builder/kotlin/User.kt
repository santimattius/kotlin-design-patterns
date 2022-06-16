package creational_design_pattern.builder.kotlin

fun userBuilder(
    firstName: String,
    lastName: String, builder: User.Builder.() -> Unit = {}
): User {
    return User.Builder(firstName, lastName).apply(builder).build()
}

data class User private constructor(
    val firstName: String,
    val lastName: String,
    val age: Int? = null,
    val phone: String? = null,
    val address: String? = null
) {

    data class Builder(
        private val firstName: String,
        private val lastName: String
    ) {
        private var age: Int? = null
        private var phone: String? = null
        private var address: String? = null

        fun withAge(age: Int) = apply {
            this.age = age
        }

        fun withPhone(phone: String) = apply {
            this.phone = phone
        }

        fun withAddress(address: String) = apply {
            this.address = address
        }

        fun build() = User(firstName, lastName, age, phone, address)
    }
}

