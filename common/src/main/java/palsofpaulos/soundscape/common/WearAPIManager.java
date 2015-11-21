package palsofpaulos.soundscape.common;

/* WearAPIManager holds common string constants for using the
 * Google Wear API Layer.
 */

import android.location.Location;

public class WearAPIManager {

    public static final String RECORD_ACTIVITY = "/record_activity";

    public static final String SPEECH_RECOGNITION_RESULT = "/speech_recog_res";
    public static final String RECORDING_READY = "/recording_ready";
    public static final String RECORD_CHANNEL = "/record_channel";

    // broadcast intents
    public static final String AUDIO_INTENT = "/audio_intent";

    // recording intent extras
    public static final String REC_FILEPATH = "filepath";
    public static final String REC_LAT = "lat";
    public static final String REC_LNG = "lng";
    public static final String REC_NAME = "name";
    public static final String REC_PLACE = "place";
    public static final String REC_DATE = "date";

    public static final int LOCATION_UPDATE_INTERVAL = 300000;
    public static final int LOCATION_UPDATE_FASTEST = 60000;

    public static Location currentLocation = new Location("");

    private WearAPIManager() {

    }
}
