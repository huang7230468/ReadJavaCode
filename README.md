# ReadJavaCode
20180516
- HashMap：线程不安全的
- Hashtable :线程安全的，put,get,remove等方法都是被synchronized修饰 ;value不可以为null
- ConcurrentHashMap : 线程安全的，主要是基于不同的桶进行分段锁，可见putVal方法中spread方法;key和value都不可以为null；
其数据结构应该和HashMap一致，都是由数组 、链表、红黑树组成。


