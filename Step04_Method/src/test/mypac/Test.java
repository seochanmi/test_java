package test.mypac;
/*
 *  [ 메소드를 만들때 고려 해야 하는것 ]
 *  
 *  1. 접근지정자(모르면 public)
 *  2. static or non static (모르면 non static)
 *  3. 리턴 type (모르면 void)
 *  4. 메소드명
 *  5. 메소드에 전달하는 인자의 갯수와 데이터 type
 */
public class Test {
	/*
	 *  public => 페키지가 달라도 호출가능
	 *  void => 이 메소드는 어떤 값도 리턴하지 않는다
	 *  walk => 메소드명은 walk
	 *  () => 이 메소드는 어떤값도 인자로 전달받지 않는 메소드 이다. (매개 변수가 선언되지 않고 비어 있음)
	 */
	public void walk() {
		System.out.println("걸어요!");
	}
	/*
	 * int => 이 메소드를 호출한 그 위치로 int type 값을 되돌려주는 메소드
	 * */
	public int getNumber() {
		int num=10;
		return num;
	}
	//인사말을 리턴하는 메소드를 완성해보세요.   스트링 타입을 리턴한다고 해놨는데 리턴값을 안 적어놔서 에러가 난다
	public String getGreeting() {
		String greet="안녕하세요!";
		return greet;
	}
	//동일한 패키지 안에 있는 AirPlane type을 리턴해 주는 메소드
	public AirPlane getPlane() {
		//AirPlane 객체를 생성해서 참조값을 p1에 담고
		AirPlane p1 =new AirPlane();
		return p1; //변수에 담긴 값을 리턴해 준다.
	}
	// int type 을 메소드의 인자로 전달 받는 메소드
	public void setNum(int num) {
		
	}
	//string type 을 메소드의 인자로 전달 받는 메소드
	public void setName(String name) {
		
	}
	//AirPlane type 을 메소드의 인자로 전달 받는 메소드
	public void setPlane(AirPlane plane) {
		
	}
	// int type,string type ,Airplane type 세개를 전달 받는 메소드
	public void doSomething(int num,String name,AirPlane plane) {
	
	}
	/*
	 *  동일한 메소드명으로 여러개의 메소드가 정의되어 있음
	 *  -메소드가 다중정의 되어 있다
	 *  -메소드가 오버로딩(overloading) 되어 있다.
	  */
	public void send() {
		System.out.println("무언가를 전송해요");
	}
	public void send(int num) {
		System.out.println(num+" 을 전송해요");
	}
	public void send(String name) {
		System.out.println(name+" 을 전송해요");
	}
	public void send(AirPlane plane) {
		System.out.println("비행기를 전송해요");
	}
	
}
