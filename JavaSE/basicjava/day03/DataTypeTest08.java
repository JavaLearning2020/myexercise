/*
  关于基本数据类型之间的互相转换；
   1、八种基本数据类型当中除布尔类型之外剩下的7种类型之间都可以互相转换

   2、小容量向大容量转换，称为自动类型转换，容量从小到大排序；
       byte<short<int<long<float<double<char
	   注意：任何浮点类型不管占用多少个字节，都比整数型容量大。char和short可表示的数量相同，但是char可以取
	   更大的正整数。 char c=97;

   3、大容量转换成小容量，叫做强制类型转换符，需要加强制类型转换符，程序才能编译通过。

   4、当整数字面值没有超出byte，short,char的取值范围，可以直接赋值给byte,short,char类型的变量。

   5、byte,short,char混合运算的时候，各自先转换成int类型再做运算。

   6、多种数据类型混合运算，先转换成容量最大的那种类型再做运算。

*/
  int f=10/3;// 3
  double dd=10/3; //3.0
  dd= 10.0/3; //3.3333333....