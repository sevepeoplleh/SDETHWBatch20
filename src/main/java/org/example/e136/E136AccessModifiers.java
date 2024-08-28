package org.example.e136;

public class E136AccessModifiers {

    private void privateM(){
        System.out.println("This is Private Method");
    }
     void def(){
        System.out.println("This is Default Method");
    }
    protected void protec(){
        System.out.println("This is Protected Method");
    }
    public void pub(){
        System.out.println("This is Public Method");
    }


    public static void main(String[] args) {
        E136AccessModifiers s1=new E136AccessModifiers();
        s1.privateM();
        s1.def();
        s1.protec();
        s1.pub();

    }
}


