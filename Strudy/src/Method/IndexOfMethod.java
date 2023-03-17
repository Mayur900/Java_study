package Method;

public class IndexOfMethod {

    public int IndexOFMethod(String total, char c) {
        char ch[] = total.toCharArray();
        int index = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == c) {
                index = i + 1;
                break;
            } else {
                index = -1;
            }
        }
        return index;
    }

    public static void main(String args[]) {

        IndexOfMethod im = new IndexOfMethod();
        int f = im.IndexOFMethod("mayur", 'm');
        System.out.println(f);
        
    }
}
