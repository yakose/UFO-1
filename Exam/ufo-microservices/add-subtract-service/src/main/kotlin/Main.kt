
import com.rabbitmq.client.ConnectionFactory
import com.rabbitmq.client.DeliverCallback
import java.nio.charset.Charset


val QUEUE_ADD = "ADD"
val QUEUE_SUBTRACT = "SUBTRACT"

fun main() {
    val factory = ConnectionFactory()
    factory.host = "mom"
    val connection = factory.newConnection()
    val addChannel = connection.createChannel()

    val subtractChannel = connection.createChannel()

    addChannel.queueDeclare(QUEUE_ADD, false, false, false, null)

    addChannel.basicConsume(QUEUE_ADD, true, { _, delivery ->
        val message = String(delivery.body, Charset.forName("UTF-8"))
        println(" [x] Received '$message'")
    }, { _ -> {}})

    subtractChannel.queueDeclare(QUEUE_ADD, false, false, false, null)

    subtractChannel.basicConsume(QUEUE_ADD, true, { _, delivery ->
        val message = String(delivery.body, Charset.forName("UTF-8"))
        println(" [x] Received '$message'")
    }, { _ -> {}})
}