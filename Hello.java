public class Hello{
    public static void main(String[] args) {
        Samplethread st = new Samplethread();
        st.start();
        Samplethread s2 = new Samplethread();
        s2.start();
        Samplethread s3 = new Samplethread();
        s3.start();
        Samplethread s4 = new Samplethread();
        s4.start();
    }
    
}