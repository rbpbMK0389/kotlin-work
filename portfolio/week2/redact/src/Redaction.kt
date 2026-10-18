// COMP2850 Portfolio: Week 2
// work by Majeedah Khan
// 09/10/26

// Function to redact sensitive information in a string

fun redact(inputDoc: String, textToRedact: String, redactChar: Char='X'): String {
    // uses replace to replace parts in a string
    // convert X from char to string
    // repeat for the length of redacted text
    // works but idk if this is the inded way to solve this
    val redactedDoc = inputDoc.replace(textToRedact, redactChar.toString().repeat(textToRedact.length))
    return redactedDoc


}

