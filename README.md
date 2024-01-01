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


- In compose an Activity is the entry point of an App(MainActivity).
- SetContent - Used to define the Layout
- Surface - Choose best color to child components
- Modifier tells the UI elements how to lay out, display or behave within its parents layout


## State in Compose

```kt
@Composable
fun Greeting(name: String) {
    var expanded = false // Don't do this!

    Surface(
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Row(modifier = Modifier.padding(24.dp)) {
            Column(modifier = Modifier.weight(1f)) {
                Text(text = "Hello, ")
                Text(text = name)
            }
            ElevatedButton(
                onClick = { expanded = !expanded }
            ) {
                Text(if (expanded) "Show less" else "Show more")
            }
        }
    }
}
```

- This won't work because every time Greeting is run, the default value is set to false because it is not tracked by Compose
- Instead, do this

```kt
@Composable
fun Greeting(name: String) {
    var expanded by rememeber{mutableStateOf(false)} // do this!
    //by saves us from writing .value everytime

    Surface(
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Row(modifier = Modifier.padding(24.dp)) {
            Column(modifier = Modifier.weight(1f)) {
                Text(text = "Hello, ")
                Text(text = name)
            }
            ElevatedButton(
                onClick = { expanded = !expanded }
            ) {
                Text(if (expanded) "Show less" else "Show more")
            }
        }
    }
}
```

- state that is read or modified by multiple functions should live in a common ancestor—this process is called state hoisting
