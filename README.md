# Week01-02
## Hash Table Applications – Java Implementation

This project demonstrates **real-world applications of Hash Tables and related data structures** using Java.

Each problem simulates a real industry scenario such as social media systems, e-commerce platforms, DNS caching, analytics dashboards, and distributed systems.

## Technologies

* Java
* HashMap
* HashSet
* LinkedHashMap
* PriorityQueue
* Deque
* Multithreading concepts

## Problems Implemented

### Problem 1 – Social Media Username Availability Checker

Checks username availability in **O(1)** time using HashMap and suggests alternatives.

Concepts:

* HashMap lookup
* Frequency tracking
* Username suggestions

---

### Problem 2 – E-commerce Flash Sale Inventory Manager

Handles **high concurrency purchase requests** while preventing overselling.

Concepts:

* HashMap inventory tracking
* Atomic stock updates
* Waiting list management

---

### Problem 3 – DNS Cache with TTL

Implements a **DNS caching system** with TTL expiration and LRU eviction.

Concepts:

* HashMap caching
* Time based expiration
* Cache hit/miss statistics

---

### Problem 4 – Plagiarism Detection System

Detects document similarity using **n-gram hashing**.

Concepts:

* String hashing
* HashMap frequency tracking
* Similarity detection

---

### Problem 5 – Real-Time Website Analytics

Processes millions of events and shows **top visited pages and traffic sources**.

Concepts:

* HashMap counters
* HashSet unique users
* PriorityQueue ranking

---

### Problem 6 – Distributed Rate Limiter

Implements a **token bucket algorithm** for API rate limiting.

Concepts:

* HashMap client tracking
* Time based token refill
* API throttling

---

### Problem 7 – Search Engine Autocomplete

Suggests top queries using prefix search and popularity tracking.

Concepts:

* Trie + HashMap hybrid
* Frequency counting
* Min Heap ranking

---

### Problem 8 – Parking Lot Management

Implements **open addressing hashing** with linear probing.

Concepts:

* Custom hash function
* Collision handling
* Load factor tracking

---

### Problem 9 – Two Sum Transaction Detection

Detects fraudulent financial transaction pairs.

Concepts:

* Complement lookup using HashMap
* Duplicate detection
* K-Sum extension

---

### Problem 10 – Multi-Level Cache System

Simulates Netflix-style caching with **L1, L2, and L3 levels**.

Concepts:

* LinkedHashMap LRU cache
* Cache promotion
* Hit ratio monitoring

---

## Running the Programs

Compile:

```
javac Problem1_UsernameAvailability.java
```

Run:

```
java Problem1_UsernameAvailability
```

Each problem file contains its own `main()` method with sample test data.

---

## Learning Outcomes

This project demonstrates:

* Practical hash table usage
* System design thinking
* Performance optimization
* Real world software engineering scenarios
