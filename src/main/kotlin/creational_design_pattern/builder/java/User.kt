package creational_design_pattern.builder.java

class User private constructor(
    val firstName: String,
    val lastName: String,
    val age: Int? = null,
    val phone: String? = null,
    val address: String? = null
) {

    constructor(builder: UserBuilder) : this(
        firstName = builder.firstName,
        lastName = builder.lastName,
        age = builder.age,
        phone = builder.phone,
        address = builder.address
    )

    override fun toString(): String {
        return """
            FirstName: $firstName
            LastName: $lastName
            Age: $age
            Phone: $phone
            Address: $address
        """.trimIndent()
    }

    class UserBuilder(
        val firstName: String,
        val lastName: String
    ) {
        var age: Int? = null
        var phone: String? = null
        var address: String? = null


        fun withAge(age: Int): UserBuilder {
            this.age = age
            return this
        }

        fun withPhone(phone: String): UserBuilder {
            this.phone = phone
            return this
        }

        fun withAddress(address: String): UserBuilder {
            this.address = address
            return this
        }
    }
}

