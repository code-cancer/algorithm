## 数组
交换
```java
public static void swap(int[] src, int index1, int index2) {
    int temp = src[index1];
    src[index1] = src[index2];
    src[index2] = temp;
}
```

排序
```java
Arrays.sort(arr)
```
### 队列 Queue
实现类
```java
Queue<Object> queue = new LinkedList<>();
LinkedList<Object> queue = new LinkedList<>();
```

常用方法
```java
//出队
poll()
//入队
add()
//size
size()
//获取对头元素，但不出队
peek()
```