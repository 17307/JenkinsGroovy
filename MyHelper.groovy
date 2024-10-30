class MyHelper {
    String name
    
    MyHelper(String name) {
        this.name = name
    }

    void greet() {
        println "Hello, ${name}!"
    }
}
