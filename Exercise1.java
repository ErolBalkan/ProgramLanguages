public class Exercise1
{

    public Exercise1()
    {
    }

    public static void main(String a[])
    {
        String word;
        if(a.length < 1)
            word = "Computer";
        else
            word = a[0];
        System.out.println((new StringBuilder()).append("Original:\t").append(word).toString());
        System.out.println((new StringBuilder()).append("In small letters: ").append(word.toLowerCase()).toString());
        System.out.println((new StringBuilder()).append("In capital letters: ").append(word.toUpperCase()).toString());
        System.out.println((new StringBuilder()).append("Length: ").append(word.length()).toString());
        System.out.println((new StringBuilder()).append("First letter: ").append(word.charAt(0)).toString());
        System.out.println((new StringBuilder()).append("Last letter: ").append(word.charAt(word.length() - 1)).toString());
        System.out.println((new StringBuilder()).append("Middle letter: ").append(word.charAt(word.length() / 2)).toString());
        System.out.println((new StringBuilder()).append("The word starts with \"Com\": ").append(word.startsWith("Com")).toString());
        System.out.println((new StringBuilder()).append("The word ends with \"ion\": ").append(word.endsWith("ion")).toString());
        String beginning = word.substring(0, 2);
        System.out.println((new StringBuilder()).append("The first two letters are: ").append(beginning).toString());
        word = word.replace('e', 'o');
        System.out.println((new StringBuilder()).append("Swapping 'e' with 'o':\t").append(word).toString());
        word = word.replaceFirst("Comp", "Calcula");
        System.out.println((new StringBuilder()).append("Swapping \"Comp\" with \"Calcula\":\t").append(word).toString());
    }
}
