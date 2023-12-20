package LOTR;

public class ChoosingCharacterClass {
    private String characterClass;
    private String classDescription;

    public ChoosingCharacterClass(String characterClass, String classDescription) {
        this.characterClass = characterClass;
        this.classDescription = classDescription;
    }

    public static class ClassFactory {

        public static ChoosingCharacterClass warrior(){
            return new ChoosingCharacterClass("Warrior","Silny");
        }
    }


}
