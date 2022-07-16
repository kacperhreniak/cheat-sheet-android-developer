# Android platform

### **Tech Stack of Android App** `easy`
- Architecture: MVVM,
- Asynchronous: Kotlin Coroutines,
- Networking: Retrofit, OkHttp,
- UI: Jetpack Compose,
- unit tests: mockk, mockito, JUnit, Robolectric
- UI tests: espresso, Page Object,

### **Activity Lifecycle** - [more](https://developer.android.com/guide/components/activities/activity-lifecycle#alc)

Lifecycle defines state of activity. Methods are used as collbacks invoke by the system.
 
Callbacks:
- onCreate() 
- onstart() 
- onResume() 
- onPause() 
- onStop() 
- onDestroy()

### **Fragment Lifecycle** - [more](https://developer.android.com/guide/fragments/lifecycle#states)
Callbacks:
- onAttach(), 
- onCreateView(), 
- onViewCreated(),
- onDetach()

### Lifecycle: when Activity is visible - [more](https://developer.android.com/guide/components/activities/activity-lifecycle#alc)
onStart() 

### **Lifecycle aware**
Lifecycle aware means that object is aware of the activity or fragment lifecycler, and we can assume that all events are happend only when LifecyclerOwner is able to rander, handel it.


### **Lifecycle: When Activity has focus** - [more](https://developer.android.com/guide/components/activities/activity-lifecycle#alc)
onResume()

### **Lifecycle: orientation changed** - [more](https://developer.android.com/guide/components/activities/activity-lifecycle#alc)
Acitivty is destroyed and creaetd again. All callbacks till onDestroy() are invoked, and then onCreate() is called again.   

### **What's a Module**
Module is a set of files compiled together, for example, Module created via Intelij IDE. Dividing code into small modules could optimize build time.

### **Enumarate activity launch modes** `easy` - [more]()
Standarad, SingleTop, Single Task, SingleInstance

### **Activity launch mode: SingeTask** `easy`
### **Activity launch mode: SingleTask** `easy`
### **Activity launch mode: SingleInstance** `easy`

### **Pros of Modularization**
```
TODO
```

### **Gradle: `api` and `implementation`**
- **api** is used when dependency is used as input of outpuf for interfaces, classes visibile from ohers modules.
- **implementation** is used for adding dependecies requried only for in-module purpose 
 
### **Memory leaks in Android**
```
TODO
```

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
```
TODO
```

### **Detekt**
```
TODO
```

### **Suppress**
Annotation with a name of compiler diagnostices to being ommited. For example: @Suppress("DEPRECATION")

### How to handle `Process` and `Thread` in Android app?
```
TODO
```

## **User Interface**

### Describe an `imperative way` to define UI
```
TODO
```

### Describe a `declarative way` to define UI
```
TODO
```

### `Jetpack compose`
```
TODO
```

### Describes libraries in Jetpack
```
TODO
```

## **Store data**

### **DataStore**
```
TODO
```

### **Shared preferences**
```
TODO
```

### **Room**
```
TODO
```

### **SQLite**
```
TODO
```

## **Jetpack**

### **WorkManager**
```
TODO
```

### **JobScheduler**
```
TODO
```

### **Jetpack compose**
```
TODO
```
