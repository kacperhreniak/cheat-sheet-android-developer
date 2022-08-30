# System design

## Basic knowledge
- CDN: Content delivery network

## Protocols

## Calculations
1 kB = 1000 B = 10^3 B \
1 MB = 1000 kB = 10^6 B \
1 GB = 1000 MB = 10^9 B \
1 TB = 1000 GB = 10^12 B \
1 PB = 1000 TB = 10^15 B \
1 EB = 1000 PB = 10^18 B 

#### **Basic sizes**
1 char = 2B \
1 average photo = 200 kB \
1 good quality photo = 2 MB \
1 minute of average quality movie = 3 MB \
1 hour of average quality movie = 200 MB \
1 minute of streaming = 50 MB

#### Server capability
- 150GB Max cache per instance
- 


#### Movie store data
720p -> X MB \
480p -> 1/2 of X MB \
360p -> 1/4 of X MB \
240p -> 1/8 of X MB \
144p -> 1/16 of X MB \
, so summary of all resolution could be estimated as 2X MB

#### Some important assumptionts
- Seconds in a day: 60 sec x 60 min x 24 hours = 86 400 sec ~= 100 000 sec/day
- 

### **Example of calculations**
```
1. Twitter:

Storage:
Twitter daily active user: 500 mln with single tweet per user
Single tweet size: 140 chars x 2B per char = 280B per tweet ~= 300B per tweet
Daily storage: 300B x 500 mln users = 150 GB per day

Required bandwidth:
150 GB per day = 150 GB / 100 000 (per sec) = 1.5MB per sec

Potential cache requiremenets:
Cache 20 post per user
20 x 300B x 500 mln = 20 x 150 GB = 3000 GB = 3 TB per day
Capability of sinlge instace of cache: 150 GB
3TB / 150GB = 20 instances

2. Instagram


3. Netflix
```

# Links
- Example of estimations: https://itsallbinary.com/system-design-back-of-envelop-calculations-for-storage-size-bandwidth-traffic-etc-estimates/
- Estimation - youtube: https://www.youtube.com/watch?v=0myM0k1mjZw&ab_channel=GauravSen
- Design Instagram: https://www.educative.io/courses/grokking-the-system-design-interview/m2yDVZnQ8lG
- Desing bit.ly: https://www.educative.io/courses/grokking-the-system-design-interview/m2ygV4E81AR

- Knowledge: https://igotanoffer.com/blogs/tech/latency-throughput-availability-system-design-interview

# Task

## Design bit.ly

## Design LiveStreaming platform

## Design elevator

## Design Parking 
