//测试类 创建人类的对象
public class TextRen {

	public static void main(String[] args) {
		//创建对象 ： 类名   对象名 =new 类名();
//		Ren ran1=new Ren();
//		//使用对象的属性和方法 ：对象名 属性 对象名.方法（）；
//		ran1.name="张三";
//		ran1.age=18;
//		ran1.sex='男';
//		//调用返回的info字符串
//		String s=ran1.showInfo();
//		System.out.println(s);
		//创建第二个人
		Ren ren2=new Ren();
		ren2.age=20;
		ren2.name="李四";
		ren2.sex='女';
		ren2.showInfo();
		
	}

}
