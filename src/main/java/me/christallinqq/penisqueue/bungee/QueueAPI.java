package me.christallinqq.penisqueue.bungee;

import me.christallinqq.penisqueue.bungee.utils.QueueType;

@SuppressWarnings({"unused"})
public final class QueueAPI {
    private QueueAPI() {
    }

    public static int getVeteranSize() {
        return QueueType.VETERAN.getQueueMap().size();
    }

    public static int getPrioritySize() {
        return QueueType.PRIORITY.getQueueMap().size();
    }

    public static int getRegularSize() {
        return QueueType.REGULAR.getQueueMap().size();
    }
}
