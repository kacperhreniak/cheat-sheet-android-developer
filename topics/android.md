# Android platform
- #### Describe a common `Tech Stack` used to implement `App`? 
- #### `Activity` Lifecycle
    onCreate() - onstart() - on resume() - onPause() - onStop() - onDestroy() 
    
    Lifecycle defines state of activity. Methods are used as collbacks invoke by the system

    More information: https://developer.android.com/guide/components/activities/activity-lifecycle#alc

- #### `Fragment` Lifecycle
    onAttach(), onCreateView(), onViewCreated(), onDetach()

    More information: https://developer.android.com/guide/fragments/lifecycle#states

- #### Lifecycle: `Activity is visible`
    onStart()

    More information: https://developer.android.com/guide/components/activities/activity-lifecycle#alc

- #### Lifecycle: `Activity has focus`
    onResume()
    
    More information: https://developer.android.com/guide/components/activities/activity-lifecycle#alc 
    
- #### Lifecycle: `orientation changed`
    Acitivty is destroyed and creaetd again. All callbacks till onDestroy() are invoked, and then onCreate() is called.   

    More information: https://developer.android.com/guide/components/activities/activity-lifecycle#alc 

- #### What's a `Module` in Android app?
- #### How Modularization could improve build time?
- #### Gradle: `api` and `implementation`?
- #### Android - `Memory leak`


## Buil project
- #### `Proguard rules`
    Proguard rules are defined in files with `.pro` extension to prevent classes, methods or properties to being obfuscated. For example API models shoudln't be obfuscated. 

- #### `R8`
    Tool to optimaze application, by removeing unused methods, classes, resources or unreachable code.

- #### `mapping.txt`
    The file is generated when building the project to map the obfuscated names. It can be used to debug an obfuscated application or read stack trace errors on the production.  

- #### `Obfuscation`
    Obfuscation is a process to renamed all classes, functions or variables to simple, unreadable name to improve prevetion to reverse engeineer

- #### `Lint`
    TODO

- #### `Detekt`
    TODO

- #### `Suppress`
    Annotation with a name of compiler diagnostices to being ommited. For example: @Suppress("DEPRECATION")

- #### How to handle `Process` and `Thread` in Android app?

## UI
- #### Describe an `imperative way` to define UI?
- #### Describe a `declarative way` to define UI?
- #### `Jetpack compose`?
- #### Describes libraries in Jetpack

## Store data
- #### `DataStore`
- #### `Shared preferences`
- #### `Room`
- #### `SQLite`

## Jetpack
- #### `WorkManager`

