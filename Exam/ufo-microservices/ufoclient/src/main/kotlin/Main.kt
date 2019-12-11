import com.rabbitmq.client.ConnectionFactory
import java.util.*

const val QUEUE_ADD = "ADD"
const val QUEUE_SUBTRACT = "SUBTRACT"
const val QUEUE_MULTIPLY = "MULTIPLY"
const val QUEUE_DIVIDE = "DIVIDE"

fun main() {
    val factory = ConnectionFactory()
    factory.host = "mom"

    println("""Choose what to do:
        | 1. Add
        | 2. Subtract
        | 3. Multiply
        | 4. Divide
    """.trimMargin())

    val scan = Scanner(System.`in`)

    when(scan.nextLine()) {
        "1" -> {
            println("Choose number one:")
            val number1 = scan.nextLine()
            println("Choose number two:")
            val number2 = scan.nextLine()

            val message = "$number1|$number2"
            factory.newConnection().use { connection ->
                connection.createChannel().use {
                    it.queueDeclare(QUEUE_ADD, false, false, false, null)
                    it.basicPublish("", QUEUE_ADD, null, message.toByteArray())
                    println("Client send message: $message")

                }
            }
        }
        "2" -> {
            println("Choose number one:")
            val number1 = scan.nextLine()
            println("Choose number two:")
            val number2 = scan.nextLine()

            val message = "$number1|$number2"
            factory.newConnection().use { connection ->
                connection.createChannel().use {
                    it.queueDeclare(QUEUE_SUBTRACT, false, false, false, null)
                    it.basicPublish("", QUEUE_SUBTRACT, null, message.toByteArray())
                    println("Client send message: $message")

                }
            }
        }
        "3" -> {
            println("Choose number one:")
            val number1 = scan.nextLine()
            println("Choose number two:")
            val number2 = scan.nextLine()

            val message = "$number1|$number2"
            factory.newConnection().use { connection ->
                connection.createChannel().use {
                    it.queueDeclare(QUEUE_MULTIPLY, false, false, false, null)
                    it.basicPublish("", QUEUE_MULTIPLY, null, message.toByteArray())
                    println("Client send message: $message")

                }
            }
        }
        "4" -> {
            println("Choose number one:")
            val number1 = scan.nextLine()
            println("Choose number two:")
            val number2 = scan.nextLine()

            val message = "$number1|$number2"
            factory.newConnection().use { connection ->
                connection.createChannel().use {
                    it.queueDeclare(QUEUE_DIVIDE, false, false, false, null)
                    it.basicPublish("", QUEUE_DIVIDE, null, message.toByteArray())
                    println("Client send message: $message")

                }
            }
        }
    }

}