package education;

public class Sara {
    public void sayHi(String...names) {
        for(String name: names){
        System.out.println("Добрый вечер, " + name + ", как ваши дела?");
        }
    }

public static void main(String[] args) {
        Sara sara = new Sara();
        sara.sayHi("Степан", "Даша");
        
    }
}   