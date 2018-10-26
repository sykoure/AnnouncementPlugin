package sykoure.announcement.config;

import ninja.leaping.configurate.objectmapping.Setting;
import ninja.leaping.configurate.objectmapping.serialize.ConfigSerializable;


@ConfigSerializable
public class AnnouncementConfig {

    @Setting
    Announcements announcements = new Announcements();

    @ConfigSerializable
    public static class Announcements {
        // Whether or not the Announcement message is enabled
        public static boolean announcementEnabled = true;

        // The time in ticks between each announcement message (12000 ticks = 10 mins)
        public static int announcementTimer = 12000;

        // The annoucement msg for new player
        public static String announcementMessage = "&6Remember to do &b/rules&6 and &b/kits&6 to get yourself started. When you're ready, do &b/wild&6 and click a direction.";

        // The annoucement msg about Discord
        public static String announcementDiscordMessage = "&6Want to post complaints, get the latest updates, or just share very good memes? Type out &b/discord &6and click the link!";

        // The annoucement msg about the gyms
        public static String announcementGymMessage = "&6Think you got what it takes to be the very best? Try battling our &b/gyms&6! Gym rules are at each gym &b/warps&6.";

        // The annoucement msg about the gyms When a gym leader isnt here
        public static String announcementGymDiscordMessage = "&6Wanna challenge a gym but there is not gym leader currently online? Join our &b/discord&6 and send them a message.";

        // The annoucement msg about the application
        public static String announcementApplyMessage = "&6If you want to become staff, gym leader or builder, check the Rules and Information channel on our &b/discord &6to find the proper application form.";

        // The annoucement msg about the tournaments
        public static String announcementTournamentMessage = "&6Miner offers a new tournament every month! To find out the rules of the current on going tournament, check the Events channel on &b/discord.";

        // The annoucement msg about the rules
        public static String announcementRulesMessage = "&6Remember to read the &b/rules&6! Not having read them &lwill not be an excuse.";

        // The announcement msg about the events
        public static String announcementEventMessage = "&6Wondering what 'Next Event' means? Every 30 minutes, win one of our MinerEvents to get Event Points! EP can be used with &b/custom &6to make a Pokemon bigger, smaller, or even shiny!";
        //"&e[&bMiner.GG&e] - &6&lWa&l&a&ln&bn&c&la &d&o&nc&e&o&nh&f&o&na&1l&2l&2e&3n&4g&5e &6a &7g&8y&9m &ab&bu&ct &dt&eh&fe&1r&2e &3i&4s &5n&6o&7t &8g&9y&am &bleader currently online? Join our &b/discord&6 and send them a message."

        public static String getAnnouncementVoteMessage = "&6Remember that you can vote everyday by using &b/vote&6! Then, use &b/warp crates &6in order to collect your gains.";
    }

    @ConfigSerializable
    public static class General {

        // Text before every announcement
        public static String prefix = "&e[&bMiner.GG&e] - ";

    }
}
