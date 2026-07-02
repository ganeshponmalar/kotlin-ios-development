fun main() {

    val loginButton = MyButton(text = "Login", id = 1232, onClickListener = object : OnClickListener {
            override fun onClick() {
                println("Login button clicked")
            }
        }
    )

    val signUpButton = MyButton(text = "Sign Up", id = 23423, onClickListener = object : OnClickListener {
            override fun onClick() {
                println("Sign Up button clicked")
            }
        }
    )

    println(loginButton.text)
    println(signUpButton.text)

    // Simulate button clicks
    loginButton.click()
    signUpButton.click()
}

class MyButton(val text: String, val id: Int, val onClickListener: OnClickListener) {
    fun click() {
        onClickListener.onClick()
    }
}


interface OnClickListener {
    fun onClick()
}


