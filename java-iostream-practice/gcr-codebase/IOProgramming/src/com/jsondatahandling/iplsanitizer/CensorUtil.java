package com.jsondatahandling.iplsanitizer;

public class CensorUtil {
 
    public static String maskTeamName(String team) {
	String[] parts = team.split(" ");

	if (parts.length > 1) {
	    return parts[0] + " ***";
	}

	return team;
    }

    public static String redactPlayer() {
	return "REDACTED";
    }
}