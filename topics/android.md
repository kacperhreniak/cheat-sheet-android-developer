# Android platform

### **Tech Stack of Android App** `basic`
- Architecture: MVVM,
- Asynchronous: Kotlin Coroutines,
- Networking: Retrofit, OkHttp,
- UI: Jetpack Compose,
- unit tests: mockk, mockito, JUnit, Robolectric
- UI tests: espresso, Page Object,

### **Activity Lifecycle** `basic` - [more](https://developer.android.com/guide/components/activities/activity-lifecycle#alc) 

Lifecycle defines state of activity. Methods are used as collbacks invoke by the system.
 
Callbacks:
- onCreate() 
- onstart() 
- onResume() 
- onPause() 
- onStop() 
- onDestroy()

### **Fragment Lifecycle** `basic` - [more](https://developer.android.com/guide/fragments/lifecycle#states)
Callbacks:
- onAttach(), 
- onCreateView(), 
- onViewCreated(),
- onDetach()

### **Lifecycle: when Activity is visible** - [more](https://developer.android.com/guide/components/activities/activity-lifecycle#alc)
onStart() 

### **Lifecycle aware**
Lifecycle aware means that object is aware of the activity or fragment lifecycler, and we can assume that all events are happend only when LifecyclerOwner is able to rander, handel it.

### **Lifecycle: When Activity has focus** - [more](https://developer.android.com/guide/components/activities/activity-lifecycle#alc)
onResume()

### **Lifecycle: orientation changed** - [more](https://developer.android.com/guide/components/activities/activity-lifecycle#alc)
Acitivty is destroyed and creaetd again. All callbacks till onDestroy() are invoked, and then onCreate() is called again.   

### **What's a Module**
Module is a set of files compiled together, for example, Module created via Intelij IDE. Dividing code into small modules could optimize build time.

### **Enumarate activity launch modes** `basic` - [more]()
Standarad, SingleTop, Single Task, SingleInstance

### **Activity launch mode: SingeTask** `basic`
### **Activity launch mode: SingleTask** `basic`
### **Activity launch mode: SingleInstance** `basic`

### **Pros of Modularization**
TODO

### **Gradle: `api` and `implementation`**
- **api** is used when dependency is used as input of outpuf for interfaces, classes visibile from ohers modules.
- **implementation** is used for adding dependecies requried only for in-module purpose 
 
### **Memory leaks in Android**
TODO

## Buil project

### **Proguard rules**
Proguard rules are defined in files with `.pro` extension to prevent classes, methods or properties to being obfuscated. For example API models shoudln't be obfuscated. 

### **R8**
Tool to optimaze application, by removeing unused methods, classes, resources or unreachable code.

### File: **mapping.txt**
The file is generated when building the project to map the obfuscated names. It can be used to debug an obfuscated application or read stack trace errors on the production.  

### **Obfuscation**
Obfuscation is a process to renamed all classes, functions or variables to simple, unreadable name to improve prevetion to reverse engeineer

### **Lint**
TODO

### **Detekt**
TODO

### **Suppress**
Annotation with a name of compiler diagnostices to being ommited. For example: @Suppress("DEPRECATION")

### How to handle `Process` and `Thread` in Android app?
TODO

## **User Interface**

### **RecyclerView concept** `basic`
RecyclerView is a UI component to present list of items using concept of recyclering views. RecycelerView creates small number of ViewHolders, and reuse it to bind incoming items. The number isn't specific. It depends how many items could be present on the screen, and additional one or two view to prepare data.

### RecyclerView: **DiffUtil** 
DiffUtil is a tool to optimize binding data using extra methods to define if view is the same as before, and has the same content as previouse.

Methods: `areItemsTheSame` and `areContentsTheSame`

### **Jetpack compose**
TODO

### Enumerate Jetpack's libraries
TODO

## **Store data**

### **DataStore**
TODO

### **Shared preferences**
TODO

## **Jetpack**

### **WorkManager**
TODO

### **JobScheduler**
TODO

### **Jetpack compose**
TODO

### **Room**
TODO