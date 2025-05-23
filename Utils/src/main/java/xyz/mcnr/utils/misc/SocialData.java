package xyz.mcnr.utils.misc;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class SocialData {
    private final List<String> afkMessages = new ArrayList<>();
    private final List<String> ignoreList = new ArrayList<>();
    private final Player player;

    private long lastIgnoreUpdate;
    private String lastRecipient;
    private String lastSender;
    private boolean afk;

    private long lastAnonChatUpdate;
    private boolean anonChat = true;

    public SocialData(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public String getLastRecipient() {
        return lastRecipient;
    }

    public void setLastRecipient(String lastRecipient) {
        this.lastRecipient = lastRecipient;
    }

    public String getLastSender() {
        return lastSender;
    }

    public void setLastSender(String lastSender) {
        this.lastSender = lastSender;
    }

    public List<String> getIgnoreList() {
        return ignoreList;
    }

    public boolean isIgnoring(CommandSender player) {
        return ignoreList.contains(player.getName().toLowerCase(Locale.ROOT));
    }

    public long getLastIgnoreUpdate() {
        return lastIgnoreUpdate;
    }

    public void setLastIgnoreUpdate(long lastIgnoreUpdate) {
        this.lastIgnoreUpdate = lastIgnoreUpdate;
    }

    public long getLastAnonChatUpdate() {
        return lastAnonChatUpdate;
    }

    public void setLastAnonChatUpdate(long lastAnonChatUpdate) {
        this.lastAnonChatUpdate = lastAnonChatUpdate;
    }

    public boolean isAfk() {
        return afk;
    }

    public void setAfk(boolean afk) {
        this.afk = afk;
    }

    public List<String> getAfkMessages() {
        return afkMessages;
    }

    public void setAnonChat(boolean anonChat) {
        this.anonChat = anonChat;
    }

    public boolean isAnonChat() {
        return anonChat;
    }
}
