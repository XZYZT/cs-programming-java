package cs.lib.box.pattern;

public class AdapterPattern {
    public static void main(String[] args) {
        Adapter ada = new Adapter(new EnglishSpeaker());
        System.out.println(ada.translate());
    }
}

class EnglishSpeaker implements Speaker{
    @Override
    public String speak() {
        return "Hello";
    }
}

interface Translater {
    String translate();
}
interface Speaker {
    String speak();
}
interface LanguageInfo {
    String language(String from, String to);
}

class Language implements LanguageInfo {
    @Override
    public String language(String from, String to) {
        return to;
    }
}

class Adapter implements Translater {
    private Speaker speaker;
    public Adapter(Speaker speaker) {
        this.speaker = speaker;
    }
    @Override
    public String translate() {
        String result = speaker.speak();
        result = result.replaceAll("Hello", "你好");
        return result;
    }
}