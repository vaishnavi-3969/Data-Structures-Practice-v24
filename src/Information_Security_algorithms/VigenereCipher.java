package Information_Security_algorithms;

//Polyalphabetic cipher
public class VigenereCipher {
    public static void main(String[] args) {
        String key = "deceptivedeceptivedeceptive";
        String plainText = "wearediscoveredsaveyourself";
        String cipherText = encryption(plainText,key);
        System.out.println(cipherText);
        System.out.println(decryption(cipherText, key).toLowerCase());
    }
    public static String decryption(String cipherText, String key){
        key = key.toUpperCase();
        StringBuilder plainText = new StringBuilder();
        for(int i=0; i<cipherText.length(); i++){
            int sub = (cipherText.charAt(i)-'A') - (key.charAt(i)-'A');
            if (sub < 0) {
                sub += 26;
            }
            plainText.append((char)((sub % 26) +'A'));
        }
        return plainText.toString();
    }
    public static String encryption(String plaintext, String key){
        plaintext = plaintext.toUpperCase();
        key = key.toUpperCase();
        StringBuilder cipherText = new StringBuilder();
        for(int i=0; i<plaintext.length(); i++){
            int sum = (plaintext.charAt(i)-'A') + (key.charAt(i)-'A');
            cipherText.append((char)(sum%26 +'A'));
        }
        return cipherText.toString();
    }
}
