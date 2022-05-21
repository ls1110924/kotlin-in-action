class User(val id: Int, val name: String, val phone: String)

fun saveUser(user: User) {
    fun validate(value: String, name: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("couldn't save user ${user.id}, the $name is empty")
        }
    }
    validate(user.name, "name")
    validate(user.phone, "phone")
    println("save success")
}

fun User.validateBeforeSave() {
    fun validate(value: String, name: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("couldn't save user ${this.id}, the $name is empty")
        }
    }
    validate(this.name, "name")
    validate(this.phone, "phone")
}

fun main(args: Array<String>) {
    val user = User(0, "AShuai", "123")
    try {
        saveUser(user)
    } catch (e: Exception) {
        println("occur exception")
        e.printStackTrace()
    }

    val user1 = User(1, "AShuai", "")
    try {
        saveUser(user1)
    } catch (e: Exception) {
        println("occur exception")
        e.printStackTrace()
    }

    try {
        user.validateBeforeSave()
    } catch (e: Exception) {
        println("occur exception")
        e.printStackTrace()
    }
    try {
        user1.validateBeforeSave()
    } catch (e: Exception) {
        println("occur exception")
        e.printStackTrace()
    }
}