public class Hello{
    public static void main(String[] args) {
        Samplethread st = new Samplethread();
        Thread t= new Thread(st);
        t.start();

        Samplethread s2 = new Samplethread();
        Thread t1= new Thread(s2);
        t1.start();
        
        Samplethread s3 = new Samplethread();
        Thread t2= new Thread(s3);
        t2.start();
        
        Samplethread s4 = new Samplethread();
        Thread t3= new Thread(s4);
        t3.start();
        
    }
    
}