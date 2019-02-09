package hello;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Greeting {

    //i'm jast add some comments
    private final long id;
    private final String content;

    @JsonProperty("noMeaningTest")
    public final String subName;

    @JsonProperty("anotherNoMeaningTest")
    public final String strangeInfo;


    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
        subName = "trololo";
        strangeInfo = "safdadfa";
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
