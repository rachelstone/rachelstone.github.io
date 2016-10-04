class ClassA {

    private GreeterInterface greeter;

    public void setGreeter(GreeterInterface greeter) {

        this.greeter = greeter;
    }

    public void invokeGreeter() {

        this.greeter.sayHello();
    }

    public static void main(String [] args) {

        ClassA a = new ClassA();

        a.setGreeter(new ClassB() {
            @Override
            public void sayHello() {
                System.out.println("Hello world!");
            }
        });

        a.invokeGreeter();

    }
}



// If you use a variable once, you don’t need to create it
// Anonymous inner class is not declared (no = new …)
// Sticking method declaration inside the code
// Overriding the method of the inner class, so you don’t screw up spelling
