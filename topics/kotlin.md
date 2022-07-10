# Kotlin

## Basic
- #### `object`
  Object declaration is way to handle singleon in Kotlin. Object is available globally - there is no local value and object cannot be used as right assigment statement. Inialization of object is done on firs access.
- #### `companion object`
  companion object is used to object declaration inside class. Name of the companion object can be omitted and outer class is used as qulifier.

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
  Sealead class allows for more conrol of inheritance. Subclasses could be only created in same module. All subclasses are known druing compilation and opposite to the enum class can have more instances with its own state.

  More information: https://kotlinlang.org/docs/sealed-classes.html

- #### `enum class`
  TODO

- #### `sealed class` and `enum`
  Example of answers

- #### mutable or immutable property
  val to provide immutable property and var to provide mutable property. val should be handle as default as always as possible.

- #### `Field`
  Field is only used as a part of a property to hold its value in memory. Fields cannot be decalred directly. Keyword `field` is only available in the accessor methods. 

  Link: https://kotlinlang.org/docs/properties.html#backing-fields


- #### `refied` modifier
  Refied type is available only in inline functions, to pass type of an expected object. It prevents developer agains using a reflection to find out type of the object. using refied types you can use opertaors: `as` and `is` 

- #### `inline function`?
  Inline functions is a function with keyword `inline`. It means that block of code from the function will be injected into another function. Inline function increases size of bytecode, by duplicate code, but it con optmize time especially for lambdas call in a loop a thousands of time.

- #### Avoiding inline functions:
  Inline function shouldn't be an option for a big functions, because of huge increase bytecode.

- #### Inline function for Lambda
  Firs, using lambda as inline function optimize createing and reducing object of lambda. The optimization could be noticed for lambda call in loop thousands of time. Second, when lambda use a property from the scope of lambda expression, under the hood it create new class with this proeprty as argument, so it isn't optimal solution when lambda is called in a loop. Inline function allows to prevent against cases like this. 

- #### `inline class`
  Inline class is used to create wrapping class with benefits of primitive values. To create inline class use `value` keyword with a single property. Using: wrapper for string to create self explanation class for example: `value class Name(val title: String)`. In compile time this class will be represented by String type.

  More information: https://kotlinlang.org/docs/inline-classes.html

- #### Could `lambad` use return expression?
  Return expression is only possible for lambda expression defined as inline function.

- ### `High-order` function
  High-order function function which takes function as parameter, or returns a function as result

  More information: https://kotlinlang.org/docs/lambdas.html#higher-order-functions
 
- ### `Lambda` expression
  Lambda is a function which is not decalred, but passed as expression. Under the hood lambdas is handle as class with single method. It could have an negative impact for optimalization for lambdas call in a loop thousands of times.

  More information: https://kotlinlang.org/docs/lambdas.html#lambda-expressions-and-anonymous-functions
 
- #### `extension function`
  Features build in Kotlin to add new functionality to class without inherit from the class or using extra design patterns. Extensions are resolved statically. 

  More information: https://kotlinlang.org/docs/extensions.html

- #### Extension are resolved statically
  Extension is not adding new memeber into a class, so it's strongly connected to the specific type. Extensions are not inherited FIXME!!!! 

- #### `scope function`
  Example of answers

- #### Enumerate: `scope functions`
  run, let, apply, with, also

  More information: https://kotlinlang.org/docs/scope-functions.html

- #### `Type alias`
  Feature to provide alternative name for existing names. Type alias could be used to shorten long generic types, alternative way in case of two objects with same name of class add different package, specific name for function types, or even specific name for inner class.

- #### `Delegation` in Kotlin?
  Alternative way to provide inheritancem, by providing an interface to a class by composition and than use delegation to provide specific public memebres of this interface. Overriding works as you expect, so you can easily adjust your needs by override delegated member.

  Example and more informaton: https://kotlinlang.org/docs/delegation.html


- #### backing field:
  Backing Fields is generated for property when one of the default accessr implementaiton is defined, or when custom impelemtation with reference to `field` is created. 

  More information: https://kotlinlang.org/docs/properties.html#backing-fields

- #### backing property:
  Backing property is used to create custom accessor without reference to the `field`. For example: custom `get` accessor implementation for `isEmpty` property `this.size == 0` 


- #### standard delegates properties
  Gropu of dalagates avaiabale by default in Kotlin langauge: lazy(), observable(), delegate to other property

- #### Delegated property: lazy
  Funtion with lambda as argument and Lazy<T> as result of the function. It call lamda expression only once and further calls return stored result.

- #### Delegated property: observable { }
  TODO

- #### Default `visbility modifier`
  Defualt visibili modifier for all class, methods and properties is `public`

- #### `internal` visibility modifier?
  TODO

## Flow
- #### Flow
  Flow is used to handle stream of multiple value in asynchronous way - it's similar to a sequence. Flows are cold, so it means that code insied flow isn't handled until it is collected.

  More infomrmation: https://kotlinlang.org/docs/flow.html#flows

- #### StateFlow
  StateFlow stores last emitted value and returns it to all collectors. It could be use to store current state of a system. StateFlow is similar to LiveData with small diferences. StateFlow requires initial state, and by defualt is not a lifecycle aware.

  More information: https://developer.android.com/kotlin/flow/stateflow-and-sharedflow

- #### SharedFlow
  SharedFlow emits value to all its collectors, and it is hot flow. It could be used to tick collectors to handle an event.

  More information: https://developer.android.com/kotlin/flow/stateflow-and-sharedflow
  
- #### Flow: `shareIn`
  Method shareIn convert StateFlow into SharedFlow and it coule be use to tick all collector, when new state will be available. It convert cold flow into hot flow.

- #### FLow or StateFlow or SharedFlow to inform about Snackbar

  Answer: `SharedFlow` - Sanckbar should be shown only once, even after configuration change, so when activity is recreated Snackbar shouldn't be visible again. ShareFlow holds information that event has been consumed, so it's the best option for this task.

- #### FLow or StateFlow or SharedFlow to pass data received from the server

  Answer: `StateFlow` - Activity should be able to received loaded data even after orientation changed. StateFlow hold data and emits last state for each consumer. 


## Coroutines

- #### `coroutine`
- #### `coroutine` vs `thread`

- #### `suspend` function
  Suspend function is a funcion with special `suspend` modifier and it means asynchronous functions. That function could be stop in any time, and resume later. Suspend function could be call from another suspend funcion, or insied coruoutine


- ### Enumarate corouine dispatchers:
  `Main` and  `IO` and `Default`

- #### `coroutine scope`
  Coroutine scope defines a scope of execution of coroutine, and it is strongly connected to a lifecycle of element, where coroutine scope has been created (e.g., ViewModel from jetpack compose contains `viewModelScope` and all coroutines in ViewModel should be handled by it). 

- #### `launch`
  `launch` is a coroutine builder that start new coroutine and returns jobs instead of any specific data. Think about `launch` coroutine builder as `fire and forget`.

- #### `async`
  Prompt: What's a async coroutine builder? How to use .await() method?

  `asyc` is a coroutine builder that start a new coroutine and retrun expected result as `Deffered<T>`. Deffered type provides `.await()` to stop an execution of the code in current line, and resume it when result will be available.

- #### Dispatcher
  Prompt: What's a dispatcher? How to change it?

  Dispatcher defines thread to call corouine on. Dispatcher coulde be defined by coroutine builder, or inside suspend function by usint method `withContext(...)`
