package com.chatlogparser;

import java.util.List;

public class IdleChatFilter implements MessageFilter<String> {

    private final List<String> idleKeywords =
            List.of("lol", "brb", "haha", "ok", "cool");

    @Override
    public boolean allow(String message) {
        String lower = message.toLowerCase();
        return idleKeywords.stream()
                .noneMatch(lower::contains);
    }
}
