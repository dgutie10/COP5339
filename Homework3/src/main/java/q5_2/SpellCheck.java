package q5_2;

import java.util.HashMap;

public interface SpellCheck {
    void addWord(String word);
    void ignoreWord(String word);
    void checkWord(String word);
    HashMap<String, String> getDictionary(String language);

}
