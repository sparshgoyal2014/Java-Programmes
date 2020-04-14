public class Hello {
    public static void main(String[] args) {   // This 'main' method is the entry point for the programme to be excecuted
        System.out.println("Hello World!");    // it should be typed exactly
        add();
        System.out.println(2);
        System.out.println(true);

        if(true){
            System.out.println("we are in the if block");
        }

        if(!false){
            System.out.println("Again! we are in the if block");
        }

        System.out.println("hello " + "World" + 2 ) ;
        System.out.println("Hello " + true);
//        System.out.println(true + 2);

        String name = Integer.toString(1);
    }
    public static int add(){
        System.out.println("This is add method");
        return 0;
    }
}
