public class Main {

    public static void main(String[] args) {
        Phonebook b=new Phonebook();
        b.add("vit","8-800");
        b.add("ser","+7-500");
        b.add("ser","+6-15000");
        b.add("alex","-4-15000");
        b.add("ser","+6-777");
        b.add("vit","3-25-25");
        System.out.println(b.get("ser"));
    }
}
