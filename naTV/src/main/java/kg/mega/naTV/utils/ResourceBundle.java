package kg.mega.naTV.utils;

import kg.mega.NaTV.utils.models.Language;

import java.util.Locale;

public class ResourceBundle {

    private ResourceBundle() {
    }

    private static final java.util.ResourceBundle RU = java.util.ResourceBundle.getBundle("ru", Locale.forLanguageTag("ru"));
    private static final java.util.ResourceBundle KG = java.util.ResourceBundle.getBundle("kg", Locale.forLanguageTag("kg"));


    public static String periodMessage(Language language, String key){

        switch (language) {
            case KG:
                return KG.getString(key);
            case RU:
                return RU.getString(key);
            default:
                return RU.getString(key);
        }
    }
}
