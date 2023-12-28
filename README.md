# Kotlin 001

## Basics 001
- [x] **Common Data Types**

    - val - Read Only
    - var - Mutable

- [x] **Working with Functions**

    - **Lambda Functions**
        - The code below means that we make a variable which is a function
        that can be called on the main function as a variable and can be reasigned. Instead of using `$it` we can just rename it to `greeting` to
        make the code become more clearer

    ```kt
    var greetingFunction:(String) -> String = {greeting ->
        "Hello $greeting"
    }
    ```

   - **Higher Level Functions**

    ```kt
    fun calculateValue(value1: Int, value2: Int, calculator: (Int, Int) -> Int) {
        println("The value is ${calculator(value1, value2)}")
    }

    fun main(args: Array<String>) {
        calculateValue(2, 2) { value1, value2 ->
            value1 + value2
        }
    }
    ```

# JetPack Compose 

- Android Activity
- Theme
- Composable
- Modifier 
- Composition
- Mutable states & Remember
