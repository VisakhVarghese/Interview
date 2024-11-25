package jdk_;

public class JavaMemoryManagement {
}
/**
 * Java memory management is primarily managed by the Java Virtual Machine (JVM) through a process known as garbage collection.
 * he JVM automatically handles the allocation and deallocation of memory,
 * which helps prevent memory leaks and other memory-related issues
 */

/**
 * Java Memory Areas
 * Java memory is divided into several different areas:
 * Heap: This is the runtime data area from which memory for all class instances and arrays is allocated.
 * The heap is shared among all threads.
 *
 * Stack: Each thread has its own stack, which stores frames.
 *
 * A frame contains the state (local variables, operand stack, and frame data) of a single method invocation.
 *
 * Method Area (or MetaSpace in Java 8 and later): This area stores class structure,
 * including the runtime constant pool, field and method data, and the code for methods and constructors.
 *
 * PC Registers: Each thread has its own PC (program counter) register,
 * which keeps track of the JVM instruction currently being executed.
 *
 * Native Method Stack: This stack stores information about native (non-Java) methods used in the application.
 */

/**
 * Memory Allocation
 * in Java is handled primarily in two areas: the stack and the heap.
 *
 * Stack Allocation: Primitive types and references to objects are stored on the stack.
 * Each method call creates a new frame on the stack.
 *
 * Heap Allocation: Objects are allocated on the heap. When an object is created using the new keyword,
 * it is stored in the heap, and a reference to it is placed on the stack.
 *
 */

//Garbage Collection
/**
 * Garbage collection is the process of automatically freeing memory by deleting objects that are no longer reachable in the program.
 * The JVM includes several garbage collection algorithms:
 *
 * Mark-and-Sweep: The garbage collector marks all reachable objects and
 * then sweeps through the heap to collect and discard unmarked objects.
 *
 *Generational Garbage Collection: The heap is divided into different generations:
 * Young Generation: This is where all new objects are allocated.
 * It consists of an Eden space and two survivor spaces. The majority of objects are expected to die here.
 * Old Generation (Tenured): Objects that survive multiple garbage collection cycles in
 * the young generation are promoted to the old generation.
 * Permanent Generation (PermGen) / MetaSpace: This space contains metadata required by the JVM to describe
 * the classes and methods used in the application. From Java 8 onwards, PermGen was replaced by MetaSpace.
 */

/**
 Finalization: Java provides a finalize() method that is called by the garbage collector before an object is removed.
 However, relying on finalize() is discouraged due to unpredictability and performance overhead.
 */

/**
 * Java's memory management is designed to be automatic and efficient, reducing the burden on developers.
 * Understanding how memory management works and how to tune
 * the garbage collector can help optimize the performance of Java applications.
 */