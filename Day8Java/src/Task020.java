public class Task020 {
    public static void main(String[] args) {
        char[] Name = {'M', 'o', 'h', 'a', 'm', 'm','e','d','Z','a','i','n'};
        System.out.println(Name);
        int n = Name.length;
        System.out.println("There are " + n + " letters in my name.");
        for (int i = 0; i < n; i++) {
            System.out.print(Name[i] + " ");
        }
    }
}

