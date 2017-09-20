package com.corpa.parsing;

import java.net.MalformedURLException;
import java.net.URL;

public class Team {
    private String identifier;
    private String flag;
    private String notes;
    private String team_website;
    private String name;
    private String team_slug;
    private String team_foundation;

    public String getIdentifier() {
        return identifier;
    }

    public String getFlag() {
        return flag;
    }

    public String getNotes() {
        return notes;
    }

    public String getTeamWebsite() {
        return team_website;
    }

    public URL getTeamWebsiteURL() {
        URL url = null;

        try {
            url = new URL(team_website);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return url;
    }

    public String getName() {
        return name;
    }

    public String getTeamSlug() {
        return team_slug;
    }

    public String getTeamFoundation() {
        return team_foundation;
    }

    public int getTeamFoundationInt() {
        return Integer.parseInt(team_foundation);
    }
}