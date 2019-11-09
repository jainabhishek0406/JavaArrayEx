What is Array in Java, & its imitations?

Why Java Team introduces Array?

Can we work without Array also?

Is Array improving code performance?


Array is a collection of same data types.
Means array can collect group of elements of Int or Float or String or any other data types.
We cannot mix data types.
Memory allocation for array is dynamic (means allotted memory at runtime by JVM)

We all know, when we want to store any value in variable we define variable and assign value to it.
For Example, in case of students roll no.
int studenRollNo1 = 101

above case is fine if we have to store student roll number only for one student.
what if, we need to store roll number for 5 students?

int studenRollNo1 = 101
int studenRollNo2 = 102
int studenRollNo3 = 103
int studenRollNo4 = 104
int studenRollNo5 = 105

In some extend, above case is also fine, but what if we need to store roll number for 500 students?

Then we need to write 50 lines for same, and which is not good for performance and as well as not at all good coding practice also.

Ok...

Then what to do now, how we can avoid above issue?

Ok, don't worry, Java team is with us, and they introduce solution for above problem. And solution is ARRAY.

That’s great, but how we need to use Array, because Array is totally new to me and I don't know how to use it, can you please help?

Ok...

I am here to help you, please read my below lines carefully and if it’s not clear, read it again.

Sounds great? Ok...

As I already mentioned above, "Array represents a group of elements of same data type, and index start from 0 till N-1".

In our case, Student roll number is integer, so we will write below code to solve our issue.

int studenRollNoArr[] = {101, 102, 103, 104, 105};

in case of 500, please mention roll number for 500 students.

int studenRollNoArr[] = {101, 102, 103, 104, 105, 106, 107.........500};

Note- for initialization we can use loop also, but for now, I am not covering loop in this article, we will discuss same in other post.

Nice, we write only single statement to store 500 students roll numbers instead of 500 lines of statement.

All is well, but how we need to use it? I mean, how we need to access student roll numbers from Array?

Ok...

I already mentioned Array index, its start from 0 and ends with N-1.

In our case its 0 to 499, so to access roll number we need to write below code.

To access roll number of student 1.

studenRollNoArr(0)

To access roll number of student 2.

studenRollNoArr(1)

To access roll number of student 3.

studenRollNoArr(2)

To access roll number of student 2.

studenRollNoArr(1)

To access roll number of student 50.

studenRollNoArr(49)

To access roll number of student 201.

studenRollNoArr(200)

To access roll number of student 500.

studenRollNoArr(499)

Check my below program for same, in this I created Array to store roll number of 10 students and mentioned how we need to access it using normal code and with loop also.
Git hub link- https://github.com/jainabhishek0406/JavaArrayEx


