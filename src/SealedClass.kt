fun main(){

    val success = Result.Success("SUCCESS")
    val progress = Result.Success("PROGRESS")

    getData(progress)
}



fun getData(result: Result){
    when(result){
        is Result.Progress -> result.showMessage()
        is Result.Success -> result.showMessage()
        is Result.Error.NonRecoverableError -> result.showMessage()
        is Result.Error.RecoverableError ->result.showMessage()
    }
}

sealed class Result(val message: String){
    fun showMessage(){
        println("Result is: $message")
    }

    class Success(message: String) : Result(message)
    sealed class Error(message: String): Result(message){
        class RecoverableError(exception: Exception, message: String): Error(message)
        class NonRecoverableError(exception: Exception, message: String): Error(message)
    }
    class Progress(message: String): Result(message)

}
