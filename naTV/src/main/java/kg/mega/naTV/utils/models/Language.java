package kg.mega.naTV.utils.models;

public enum Language {
    KG,
    RU;

    public static Language getLanguage(int languageId) {

        switch (languageId) {
            case 1: return KG;
            case 2: return RU;
            default: return RU;
        }
    }
}
