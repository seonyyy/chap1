
public class variabletest {
	int number;

	
	 
		public static void main(String[] args){
			int i;
			boolean isHoliday=false;
			int j=10;
			System.out.println(j);
			char c='f';
			char d='A';
			System.out.println(isHoliday);
			System.out.println(c);
			System.out.println(d);
			//상수
			final int MAX_SPEED=20;
			//max_speed=200;//에러:final이 붙은 변수는 이후에 값대입을 할수없다.
			
			String s=new String("Hello");
			System.out.println(s);
			//String 리터럴로 사용하기
			String str1="Hello";
			System.out.println(str1);
				
			
			
		}

}
