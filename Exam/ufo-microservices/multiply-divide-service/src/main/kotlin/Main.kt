import com.rabbitmq.client.ConnectionFactory
import java.nio.charset.Charset

val QUEUE_MULTIPLY = "MULTIPLY"
val QUEUE_DIVIDE = "DIVIDE"

fun main() {
    val factory = ConnectionFactory()
    factory.host = "mom"
    val connection = factory.newConnection()
    val addChannel = connection.createChannel()

    val subtractChannel = connection.createChannel()

    addChannel.queueDeclare(QUEUE_MULTIPLY, false, false, false, null)

    addChannel.basicConsume(QUEUE_MULTIPLY, true, { _, delivery ->
        val message = String(delivery.body, Charset.forName("UTF-8"))
        println(" [x] Received '$message'")
    }, { _ -> {}})

    subtractChannel.queueDeclare(QUEUE_DIVIDE, false, false, false, null)

    subtractChannel.basicConsume(QUEUE_DIVIDE, true, { _, delivery ->
        val message = String(delivery.body, Charset.forName("UTF-8"))
        println(" [x] Received '$message'")
    }, { _ -> {}})
}
