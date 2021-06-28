package me.christallinqq.penisqueue.bungee.hooks;

import net.pistonmaster.pistonmotd.api.PlaceholderParser;
import net.pistonmaster.pistonmotd.api.PlaceholderUtil;
import me.christallinqq.penisqueue.bungee.QueueAPI;

public final class PenisMOTDPlaceholder implements PlaceholderParser {
    public PenisMOTDPlaceholder() {
        PlaceholderUtil.registerParser(this);
    }

    @Override
    public String parseString(String s) {
        return s.replace("%penisqueue_regular%", String.valueOf(QueueAPI.getRegularSize()))
                .replace("%penisqueue_priority%", String.valueOf(QueueAPI.getPrioritySize()))
                .replace("%penisqueue_veteran%", String.valueOf(QueueAPI.getVeteranSize()));
    }
}
