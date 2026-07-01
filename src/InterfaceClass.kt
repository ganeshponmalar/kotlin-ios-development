fun main() {

    val email = EmailService()
    val sms = SmsService()
    val csc = computerService()
    val addcall = ApiServiceCall()
    val info = CallMe()

    email.send("Welcome!")
    sms.send("OTP: 1234")
    csc.send(" service not yet done")
    addcall.send("api call send by client from web server to app server to database")
    info.send("sending information")
}

interface NotificationService {
    fun send(message: String)
}

interface CombinationService{
    fun send(message: String)
}

interface SoGoodAboutOop{
    fun send(messsage: String)
}


class EmailService : NotificationService,SoGoodAboutOop {

    override fun send(message: String) {
        println("Sending Email: $message")
    }
}

class SmsService : NotificationService {

    override fun send(message: String) {
        println("Sending SMS: $message")
    }
}


class ApiServiceCall: CombinationService{
    override fun send(message: String) {
        println("Sending SMS: $message")
    }
}

class CallMe : SoGoodAboutOop{
    override fun send(message: String) {
        println("Sending CallMe: $message")
    }
}


class computerService: NotificationService{
    override fun send(message: String){
        println("computer  $message")
    }
}