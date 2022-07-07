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
- #### `Proguard`
- #### `R8`
- #### `Lint`
- #### `Detekt`
- #### `Suppres`

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

