package ArraysStrings.three;

public class URLify_Array {
    public static void main(String args[]) {
        String input = "Mr John Smith     ";

        urlify(input, 13);
    }

    public static void urlify(String input, int length) {
        char[] output = new char[input.length()];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (input.charAt(i) != ' ') {
                output[index] = input.charAt(i);
                index++;
            } else {
                output[index] = '%';
                output[index+1] = '2';
                output[index+2] = '0';
                index += 3;
            }
        }

        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i]);
        }
    }
}