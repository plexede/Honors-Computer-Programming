public class Buddy {
    String response = "";
    public void wave() {
        response = "hello";
        System.out.println(response);
    }
    public void kick() {
        response = "ow";
        System.out.println(response);
    }
    public void ignore() {
        response = "are you there";
        System.out.println(response);
    }
}