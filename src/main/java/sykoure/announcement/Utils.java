package sykoure.announcement;

import org.spongepowered.api.Sponge;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.serializer.TextSerializers;
import sykoure.announcement.config.AnnouncementConfig;

public class Utils {

    /**
     * Broadcasts a message to all players
     *
     * @param message The message you wish to be broadcasted.
     * @param prefix  Whether Miner.GG uses its prefix in the announcement. True: Yes False: No.
     */
    public static void sendToAll(String message, boolean prefix) {
        Sponge.getServer().getBroadcastChannel().send(Utils.toText(message, prefix));
    }

    /**
     * Converts a string of text into a {@link Text}. Supports Minecraft color code formats.
     * @param msg The message you would like to be converted to {@link Text}.
     * @param prefix Whether or not to apply the Miner.GG prefix
     * @return A {@link Text} instance of msg.
     */
    public static Text toText(String msg, boolean prefix) {
        if (prefix) {
            msg = AnnouncementConfig.General.prefix + msg;
        }

        return TextSerializers.FORMATTING_CODE.deserializeUnchecked(msg);
    }
}
