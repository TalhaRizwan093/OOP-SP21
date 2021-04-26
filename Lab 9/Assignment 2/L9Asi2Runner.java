
package l9asi2;


public class L9Asi2Runner {

    
    public static void main(String[] args) {
        CustomStringTokenizer st = new CustomStringTokenizer("abc 1c2 qw abd 11 abcdef aqw2 aaawqd");
        System.out.println("Number of tokens without digits are:" + st.countTokens());
    }
    
}
