## **Computer Science**

### **GIT**
TODO

### **Process**
TODO

### **Thread**
TODO

### **Model TCP/IP**
- `Application` layer
- `Transport` layer
- `Network/Internet` layer
- `Network Access` layer

### **Model OSI**
- `Application` layer
- `Presentation` layer
- `Session` layer
- `Transport` layer
- `Network` layer
- `Data Link` layer
- `Physical` layer

### **Protocols in TCP layers**
- Application layer: `HTTP`, `FTP`, `TELNET`, `SMTP`, `DNS`
- Transport layer: `TCP`, `UDP`
- Network layer: `IP`, `ARP`, `ICMP`, `IGMP`,
- Network interface layer: `Ethernet`, `Token Ring`

## **OOP questions**

### **Pure function** `easy`
**Pure Function** provides a result based only on arguments. There is no side effects, no state changes, so it could be run thousands, millions times with same result each time.

**Kotlin language** has no extra support for pure functions. 

### **Overriding methods** `easy`
**Overriding methods** is an OOP concept allowing to provide custom implementation of specific method by subclass or child class. A keyword override is also used for implementations of an interfaces.

**Kotlin language** allows to provide default implementation strictly 

### **Overloading methods** `easy`
OOP features allows to provide muliple methods with same name, and different signature. Methods have to containst difference number, or types of paramteres.

### **Operator overloading** `medium`
Operator overloading allows to provide custom implementation for operators, for example, get(), set(), +, -, in, as, invoke. Operator is defined by `operator` keyword, but it could be omit overriding operator.

### **Composition approach** `easy`
Fundamental concept of OOP describes class wirh the references to other objects. Sometimes compositions is the only way to extend final class from external library. Compositions allows to add new features or expand class.

### **Inheritence approach** `easy`
Fundamental concept of OOP, it allows to inherit class to provide extended features or override methods from base class. To use inheritance class has to be open or abstract.


### **Abstraction concept** `easy`
Additional layer is a concept of hidding specific implementations and allows to impelment code based only on general interfaces. Abstraction focuses on is a great concept to design features and focus on what should be done. Mostly implement by interfaces.

### **Encapsulation concept** `easy`
Encapsulation is a concept to hide data, by control an access to the properties by visible modifiers. Property aren't easily achievable insted of it are hidden by the getter and setters. Encapsulation is more focused on: how should be done.

### Method: **equals()** `easy`
One of the basic methods from class Any in złotlin. Used to compare two objectes. equals() methods should be compatible with hashCode() method. data class generates implementation of equals method basing on parameters in a constructor.

### Method: **hashCode()** `easy`
```
TODO
```

## **Backend JVM questions**

### **How `JVM` works**
TODO

### **Garbage collector**
TODO

### **Memory leak** `easy`
Memory leak occures when allocated memory cannot be removed by Garbage collector in case when resource is not used. It could apppear when object holds reference to the object which should be deleted.

### **LRU cache** `easy`
LRU (Least Recently Used) is a concept of cache, where the oldest item is removed to create space to store new item. 

## Concepts and Design Paterns

### **Dependecy Injection**
TODO

### **Service Locator**
TODO

### `Continous Integration`
TODO

### `Continous Delivery`
```
TODO
```

### `Mocking` / `Mock`
```
TODO
```

### `concurency`
```
TODO
```

### `Rest`
```
TODO
```

### `Microservices architecture`
```
TODO
```

### `Load Balacing`
```
TODO
```

### **DNS** `easy`
Domain Name System is a hierarchical and decentralized system to translate human readble names of websites to machine readable IP addresses.

### **Bandwidth**
Bandwidth is a maximum number of data able to transfer over the internet, or a system in a given amount of time - calculated in megabits per second (Mbps).

### **Latency** `easy` - [more](https://www.google.com/travel/flights/s/cvgnXB1S7HrUwqVi6)
Latency is time needed to perform an action, or produce a result.

### **Throughput** - [more](https://www.google.com/travel/flights/s/cvgnXB1S7HrUwqVi6)
Throughput is a number of perfomred actions or produced results per unit of time.

### **Distributed computer system problems** - [more](https://www.google.com/travel/flights/s/cvgnXB1S7HrUwqVi6)
Distributed computer system is only available to support 2 of 3 guarantees: availablity, consisency or portition tolerance. Internet connection isn't realible, soo partion tolerance is must have and availablity or consistency.

### **DCS: `Availability`**
Availablity means that every client making a request for data receives a response, even if some nodes are down. There is no guarantee that response consist of last know version of information.

### **DCS: `Consistency`**
Consistency means that every client recevies last version of information or an error.

### **DCS: `Partition Tolerance`**
TODO

### **Horizontal scalling**
Scalling by adding more servers to a poll of resources.

### **Vertical scalling**
Scalling by increasing capability of servers. 

### **Percentile** `easy`
Percentil is an indicator defines thet specific percentage of values is under or equal to specific score. For exmaple, 95th percentil means that 95 percentage of values are below specific value. 

### **Status code: 2XX** `easy`
- Response code 2XX means **Succesful repsonse**. 
- For example: 200 OK, 201 Created, 204 No Content. 

### **Status code: 3XX** `easy`
- Repsonse code 3XX means **Redirection messages**. 
- For example, 301 Moved Permanently, 302 Found, 304 Not Modified

### **Status code: 4XX** `easy`
- Repsonse code 4XX means **Client error responses**. 
- For example, 400 Bad Request, 401 Unauthorized, 403 Forbidden, 404 Not Found, 409 Business error.

### **Status code: 5XX** `easy`
- Response code 500+ means Server error response. 
- For example, 500 Internal Server error, 503 Service Unavailable.

## **Security**

### **integral** `easy`
TODO

### **Authentication**
Authentication is a process of giving acces to the resource based on verifing a user's identity. For exmaple, Users can only get information about themselves, and after authentication we can verify that user is authenticated to get this data.

### **Authorization**
Authorization is a process to determinate user's access to specific resource. For example, ADMIN is authorized to all resources on the server, and USER is authorized only to data connected to specific User.

### **SSL**
Secure Socket Layer

### **TLS**
Transport Layer Security

### **SSL pining**
TODO

### **JWT Token**
TODO

### **OAuth**
TODO

### **Refresh token**
Refresh token is a token used to regenerate new acces token without extra login process. It allows to create access tokens with short expiration time.

### **Access token**
Access token is a token used to authenticate user on the server. Acces token is generated by server, and send to a client after succesful login. Acces token stores some data, for example, userId, expiration time, etc.

### **Short expiration time in access token**
Short expiration time is so important for privacy. It helps reducing consequences when access token will be taken, and used by unathorized applications, hackers, etc. After the expiration time token is getting useless. 

## **Architecture**

### **`Model` in architectures** `easy`
Model layer provides data to the system. This layer consists of repositories, use cases. It isn't just a model as an object, but all classes provide this object. 


### **`View` in architectures** `easy`
View is a presentation layer. This layer consists of all classes connected to UI, View. For example on Android platform, the View part could be activity, fragment, xml file, method annotated as composable.

### **`ViewModel` in MVVM architecture** `easy`
ViewModel is a bridge between View and Model layer. To comunicat

### **`Presenter` in architecture** `easy`
TODO

### **`MVVM` architecture** `easy`
Model, View, ViewModel

### **`MVP` architecture** `easy`
Model, View, Presenter

### **`MVI` architecture**
Model, View, Intent

### **`Redux` architecture**
TODO

### **Enumarate `SOLID` principles** `easy`
Single responsobility, Open/Close, Liskov substitution principle, Interface segregation, Dependency inversion

### **SOLID: Single responsibility principle** `easy`
There should never be more than one reason for a class to change. In other words, every class should have only one responsibility.

### **SOLID: open/close principle** `easy`
Class is open for extension, and closed for modification.

### **SOLID: Liskov substitution principle**
TODO

### **SOLID: Interface segregation** `easy`
Many specific interafces are better than single interafce with many responsibilites.

### **SOLID: Dependency inversion** `easy`
High level class shouldn't depends on low level implementation instead of it the class should based on abstraction layers.

## **Protocols**

### **Protocol: HTTP**
TODO

### **Protocol: TCP** `easy` - [more](https://subspace.com/resources/tune-tcp-udp-performance)
TCP (*Transmission Control Protocol*) - is a connection-oriented protocol over an IP network. Connection is established and terminated using a handshake. All packets sent are guaranteed to reach the destination in the original order.

### **Protocol: UDP** `easy` - [more](https://subspace.com/resources/tune-tcp-udp-performance)
UDP (User Datagram Protocol) is connectionless. Datagrams (analogous to packets) are guaranteed only at the datagram level. Datagrams might reach their destination out of order or not at all. UDP does not support congestion control. Without the guarantees that TCP support, UDP is generally more efficient.

### **Protocol: SSH**
TODO

### **Protocol: RTMP** `advanced`
- Real-Time Messaging Protocol
- Example of use: LiveStreaming

## **Code example**
