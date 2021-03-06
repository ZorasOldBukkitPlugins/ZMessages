package com.lagopusempire.zmessages;

import java.util.HashMap;
import java.util.Map;
import org.bukkit.configuration.file.FileConfiguration;

/**
 *
 * @author MrZoraman
 */
public class Messages
{
    private final Map<String, String> messages = new HashMap<>();
    
    public Messages(FileConfiguration config)
    {
        reload(config);
    }
    
    public final void reload(FileConfiguration config)
    {
        addMessage(config, "format.sender");
        addMessage(config, "format.receiver");
        addMessage(config, "format.socialspy");
        addMessage(config, "notFound.reply");
        addMessage(config, "notFound.general");
        addMessage(config, "error.noTarget");
        addMessage(config, "error.noMessage");
        addMessage(config, "error.sentToSelf");
        addMessage(config, "socialspy.activated");
        addMessage(config, "socialspy.deactivated");
        addMessage(config, "socialspy.prefix");
        addMessage(config, "reload");
    }
    
    private void addMessage(FileConfiguration config, String messagePath)
    {
        messages.put(messagePath, config.getString("messages." + messagePath));
    }
    
    public String get(String key)
    {
        return messages.get(key);
    }
}
