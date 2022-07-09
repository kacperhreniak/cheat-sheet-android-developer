# Kotlin

- #### `object`
- #### `companion object`
- #### Kotlin: `Inheritence`:

  All class in Kotlin inherit from common super class `Any`. By default class is final, and use `open` kewyword to make it inheritable.  

- #### Methods in `Any`:

  equals(), hashCode(), toString()

- #### Overriding methods

  Override methods is only allowed for `open` methods in `open class`, or implementing interface. Same for overriding properties. 

- #### Overriding properties

  Override properties is only allowed for `open` properties in `open class`, or implementing interface. Same for overriding methods.

- #### `data class`

    A type of class in Kotlin designed to store data. Must have at least one property in a constructor, by default it generates the following method based on the properties defined in the constructor: equals(), hashCode(), copy(), componentN(), toString(). 

    More information: https://kotlinlang.org/docs/data-classes.html

- #### `sealed class`
  Example of answers

- #### `sealed class` and `enum`
  Example of answers

- #### `backing field`

- #### `refied` modifier

  Example

- #### `inline function`?



- #### Could `lambad` use return expression?

  Only when lambada is inlined

- ### `High-order` function

  is a function which takes function as parameter, or returns a function as result

  More information: https://kotlinlang.org/docs/lambdas.html#higher-order-functions
 
- ### `Lambda` expression

  is a function which is not decalred, but passed to function as expression.

  More information: https://kotlinlang.org/docs/lambdas.html#lambda-expressions-and-anonymous-functions
 
- #### `extension function`?

    Features build in Kotlin to add new functionality to class without inherit from the class or using extra design patterns. Extensions are resolved statically. 

    More information: https://kotlinlang.org/docs/extensions.html

- #### `scope function`?
  Example of answers

- #### Enumerate: `scope functions`

  run, let, apply, with, also

  More information: https://kotlinlang.org/docs/scope-functions.html

- #### What's a `delegate` in Kotlin?



- #### Default `visbility modifier`

  By default all class, methods and properties are `public`

- #### `internal` visibility modifier?

- #### Flow

- #### StateFlow

- #### SharedFlow
  
- #### StateFlow vs Flow

- #### SharedFlow vs Flow

- #### FLow or StateFlow or SharedFlow to inform about Snackbar

  Answer: `SharedFlow` - Sanckbar should be shown only once, even after configuration change, so when activity is recreated Snackbar shouldn't be visible again. ShareFlow holds information that event has been consumed, so it's the best option for this task.

- #### FLow or StateFlow or SharedFlow to pass data received from the server

  Answer: `StateFlow` - Activity should be able to received loaded data even after orientation changed. StateFlow hold data and emits last state for each consumer. 

- #### `suspend` function

  

- #### `coroutine scope`
- #### `launch` scope
- #### `async` scope 
- #### `coroutine`
- #### Enumerate: Coroutines Dispatchers
- #### Dispatcher (what's it)

- #### How to change dispatcher
