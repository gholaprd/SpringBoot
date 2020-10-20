String is derived data type.

In String Constant Pool, there will be no two string objects having the same content.

Whenever you create a string object using string literal, JVM first checks the content of the object to be created. If there exist an object in the string constant pool with the same content, then it returns the reference of that object. It doesn’t create a new object. If the content is different from the existing objects then only it creates new object.

What do you mean by mutable and immutable objects?

Immutable objects are like constants. You can’t modify them once they are created. They are final in nature. Where as mutable objects are concerned, you can perform modifications to them.

Thread Safety :
Any immutable object in java is thread safety. Because they are unchangeable once they are created. Any type of thread can’t change the content of immutable object. This applies to objects of String class also. Of the StringBuffer and StringBuilder objects, only StringBuffer objects are thread safety. All necessary methods in StringBuffer class are synchronized so that only one thread can enter into it’s object at any point of time. Where as StringBuilder objects are not thread safety.

do you have any idea why strings have been made immutable in java?

a) Immutable strings increase security. As they can’t be modified once they are created, so we can use them to store sensitive data like username, password etc.

b) Immutable strings are thread safe. So, we can use them in a multi threaded code without synchronization.

c) String objects are used in class loading. If strings are mutable, it is possible that wrong class is being loaded as mutable objects are modifiable.



String str = "MyJava";
 
char[] strArray = str.toCharArray();
 
for (int i = strArray.length - 1; i >= 0; i--)
{
    System.out.print(strArray[i]);     //Output : avaJyM
}



is new String() also immutable?
String s1 = new String("JAVA");
 
        System.out.println(s1);         //Output : JAVA
 
        s1.concat("J2EE");
 
        System.out.println(s1);         //Output : JAVA

Why Char array is preferred over String for storing password?
String is immutable in Java and stored in String pool. Once it’s created it stays in the pool until unless garbage collected, so even though we are done with password it’s available in memory for longer duration and there is no way to avoid it. It’s a security risk because anyone having access to memory dump can find the password as clear text.


Why String is popular HashMap key in Java?
Since String is immutable, its hashcode is cached at the time of creation and it doesn’t need to be calculated again. This makes it a great candidate for the key in a Map and it’s processing is fast than other HashMap key objects. 


What Does String’s intern() Method Do?
The method intern() creates an exact copy of a String object in the heap and stores it in the String constant pool, which the JVM maintains.

Why String is mostly used as a key in HashMap class?

String is mostly  used as a key in HashMap class because it implements equals() and hashCode() methods which is required for an Object to be used as key in HashMap

Keyword ‘intern’ usage
This is best described by java docs:

When the intern() method is invoked, if the pool already contains a string equal to this String object as determined by the equals(Object) method, then the string from the pool is returned. Otherwise, this String object is added to the pool and a reference to this String object is returned.

String str = new String("abc");
 
str.intern();
It follows that for any two strings s and t, s.intern() == t.intern() is true if and only if s.equals(t) is true. Means if s and t both are different string objects and have same character sequence, then calling intern() on both will result in single string pool literal referred by both variables.