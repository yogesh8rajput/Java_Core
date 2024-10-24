class superDemoClass {

    final void func() {

        int a = 20;

        System.out.println("value of a = " + a);

    }

}

 

class subDemoClass extends superDemoClass {

    void func() {

        int b = 60;

        System.out.println("value of b = " + b);

    }

}

 

class demoo {

    public static void main(String[] args) {

        subDemoClass subc = new subDemoClass();

        subc.func();

    }

}