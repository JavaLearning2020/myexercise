package CourseReview.MethodAndRecursion;

/*
对于一个java程序来说，如果没有“方法”，会存在什么问题？
	代码无法得到复用。（怎么提高复用性，可以定义方法，然后需要
	使用该功能的时候，直接调用一下方法即可。这样代码就得到复用了。）
*/
public class MethodTest01{
// 入口主方法。
public static void main(String[] args){

	// 需求1：请编写程序，计算100和200的求和。
	int x = 100;
	int y = 200;
	int z = x + y;
	System.out.println(x + "+" + y + "=" + z);

	// 需求2：请编写程序，计算666和888的求和。
	// 这个需求2实际上和需求1是完全相同的，只不过具体求和时的“数据不同”
	int a = 666;
	int b = 888;
	int c = a + b;
	System.out.println(a + "+" + b + "=" + c);

	// 需求3：请编写程序，计算111和222的和
	int m = 111;
	int n = 222;
	int k = m + n;
	System.out.println(m + "+" + n + "=" + k);

	/*
		需求1和需求2本质上相同，只不过参与运算的数值不同，
		代码编写了两份，显然代码没有得到重复利用，专业术语
		叫做“复用性”差。

		功能/业务逻辑既然相同，为什么要重复编写代码，代码能不能
		写一次，以后要是需要再次使用该“业务/需求”的时候，直接调用
		就可以了。

		如果想达到代码复用，那么需要学习java语言中的方法机制。
	*/

	}

}