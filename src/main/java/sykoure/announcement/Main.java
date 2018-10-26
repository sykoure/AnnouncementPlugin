package sykoure.announcement;
import com.google.inject.Inject;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.scheduler.Task;

// Thanks Faustcore For you help :)

import sykoure.announcement.config.AnnouncementConfig;

@Plugin(
        id = "announcement",
        name = "Announcement",
        description = "This is announcement plugin, it's supposed to welcome a new player by telling him to do /rules and /rtp",
        authors = {
                "Sykoure"
        }
)
public class Main {

    private Task announcementTask;
    @Inject
    private java.util.logging.Logger logger;
    private int counter = 0;

    public void setupTasks(int nbMessage) {

        int wait = AnnouncementConfig.Announcements.announcementTimer * nbMessage;

        if (announcementTask != null)
            announcementTask.cancel();

        if (AnnouncementConfig.Announcements.announcementEnabled) {
            announcementTask = Task.builder()
                    .execute(task -> Utils.sendToAll(AnnouncementConfig.Announcements.announcementMessage, true))
                    .intervalTicks(wait)
                    .submit(this);

            announcementTask = Task.builder()
                    .execute(task -> Utils.sendToAll(AnnouncementConfig.Announcements.announcementDiscordMessage, true))
                    .intervalTicks(wait)
                    .delayTicks((wait/nbMessage)*1)
                    .submit(this);

            announcementTask = Task.builder()
                    .execute(task -> Utils.sendToAll(AnnouncementConfig.Announcements.announcementApplyMessage, true))
                    .intervalTicks(wait)
                    .delayTicks((wait/nbMessage)*2)
                    .submit(this);

            announcementTask = Task.builder()
                    .execute(task -> Utils.sendToAll(AnnouncementConfig.Announcements.announcementTournamentMessage, true))
                    .intervalTicks(wait)
                    .delayTicks((wait/nbMessage)*3)
                    .submit(this);

            announcementTask = Task.builder()
                    .execute(task -> Utils.sendToAll(AnnouncementConfig.Announcements.announcementGymMessage, true))
                    .intervalTicks(wait)
                    .delayTicks((wait/nbMessage)*4)
                    .submit(this);

            announcementTask = Task.builder()
                    .execute(task -> Utils.sendToAll(AnnouncementConfig.Announcements.announcementRulesMessage, true))
                    .intervalTicks(wait)
                    .delayTicks((wait/nbMessage)*5)
                    .submit(this);

            announcementTask = Task.builder()
                    .execute(task -> Utils.sendToAll(AnnouncementConfig.Announcements.announcementEventMessage, true))
                    .intervalTicks(wait)
                    .delayTicks((wait/nbMessage)*6)
                    .submit(this);

            announcementTask = Task.builder()
                    .execute(task -> Utils.sendToAll(AnnouncementConfig.Announcements.announcementGymDiscordMessage, true))
                    .intervalTicks(wait)
                    .delayTicks((wait/nbMessage)*7)
                    .submit(this);

            announcementTask = Task.builder()
                    .execute(task -> Utils.sendToAll(AnnouncementConfig.Announcements.getAnnouncementVoteMessage, true))
                    .intervalTicks(wait)
                    .delayTicks((wait/nbMessage)*8)
                    .submit(this);
        }
    }

    @Listener
    public void onServerStart(GameStartedServerEvent event) {
        setupTasks(9);


    }

}
