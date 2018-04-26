package com.example.vazquez.credits;

/**
 * Created by vazquez on 18/04/2018.
 */

public class CreditsActivity {
    private String name;
    private String canal;
    private String link;

    public CreditsActivity( String name, String canal, String link) {
        this.name = name;
        this.canal = canal;
        this.link = link;
    }

    public CreditsActivity(){
        this( "un" +
                "name", "uncanal", "unlink");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
