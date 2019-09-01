# tutorial-copy-on-write

This tutorial shows why we need the copy on write technique and how to use it.

Run the test with maven using:
```
mvn install
```

The test uses a not thread safe implementation, the class `com.vmlens.tutorialCopyOnWrite.MutableAddress`. To change to a thread safe implementation change the address variable in the test
`com.vmlens.tutorialCopyOnWrite.ConcurrencyTestReadWrite` to `AddressUsingCopyOnWrite`. 

The tutorial is described in greater detail in [this blog post](https://vmlens.com/articles/cp/copy_on_write/)
