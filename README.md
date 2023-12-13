# Kotlin 001

## Basics 001
- [x] **Common Data Types**
    - val - Read Only
    - var - Mutable

- [x] **Working with Functions**
    - **Lambda functions**
        - The code below means that we make a variable which is a function
        that can be called on the main function as a variable and can be reasigned. Instead of using `$it` we can just rename it to `greeting` to
        make the code become more clearer
    ```kt
    var greetingFunction:(String) -> String = {greeting ->
        "Hello $greeting"
    }
    ```
