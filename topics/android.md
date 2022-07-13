# Android platform

### **Typical `Tech Stack` of `Android App`**
Architecture: MVVM, \
Asynchronous: Kotlin Coroutines,\
Networking: Retrofit, OkHttp,\
UI: Jetpack Compose,\
unit tests: mockk, mockito, JUnit, Robolectric\
UI tests: espresso, Page Object,

### **Activity Lifecycle** - [more](https://developer.android.com/guide/components/activities/activity-lifecycle#alc)
onCreate() - onstart() - on resume() - onPause() - onStop() - onDestroy()\

Lifecycle defines state of activity. Methods are used as collbacks invoke by the system 

### **Fragment Lifecycle** - [more](https://developer.android.com/guide/fragments/lifecycle#states)
onAttach(), onCreateView(), onViewCreated(), onDetach()

### Lifecycle: when Activity is visible - [more](https://developer.android.com/guide/components/activities/activity-lifecycle#alc)
onStart() 

### **Lifecycle aware**
```
TODO
```

### **Lifecycle: When Activity has focus** - [more](https://developer.android.com/guide/components/activities/activity-lifecycle#alc)
```
onResume()
```

### **Lifecycle: orientation changed** - [more](https://developer.android.com/guide/components/activities/activity-lifecycle#alc)
```
Acitivty is destroyed and creaetd again. All callbacks till onDestroy() are invoked, and then onCreate() is called.   
```

### **What's a Module**
```
TODO
```

### **Pros of Modularization**
```
TODO
```

### **Gradle: `api` and `implementation`**
```
TODO
```

### **Memory leaks in Android**
```
TODO
```

## Buil project

### **Proguard rules**
```
Proguard rules are defined in files with `.pro` extension to prevent classes, methods or properties to being obfuscated. For example API models shoudln't be obfuscated. 
```

### **R8**
```
Tool to optimaze application, by removeing unused methods, classes, resources or unreachable code.
```

### **mapping.txt**
```
The file is generated when building the project to map the obfuscated names. It can be used to debug an obfuscated application or read stack trace errors on the production.  
```

### **Obfuscation**
```
Obfuscation is a process to renamed all classes, functions or variables to simple, unreadable name to improve prevetion to reverse engeineer
```

### **Lint**
```
TODO
```

### **Detekt**
```
TODO
```

### **Suppress**
```
Annotation with a name of compiler diagnostices to being ommited. For example: @Suppress("DEPRECATION")
```

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
