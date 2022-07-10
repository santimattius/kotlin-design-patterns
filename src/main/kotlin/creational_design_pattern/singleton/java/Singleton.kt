package creational_design_pattern.singleton.java

class Singleton {

    var text: String = ""

    companion object {

        @Volatile
        private var instance: Singleton? = null

        fun getInstance(): Singleton {
            synchronized(this) {
                return instance ?: create()
            }
        }

        private fun create(): Singleton {
            val newInstance = Singleton()
            instance = newInstance
            return newInstance
        }

    }
}