package me.chachy;

import java.util.regex.Pattern;

public class HypixelDetector {

    private static final Pattern hypixel_pattern =
            Pattern.compile("^(?:(?:(?:.+\\.)?hypixel\\.net)|(?:209\\.222\\.115\\.\\d{1,3})|(?:99\\.198\\.123\\.[123]?\\d?))\\.?(?::\\d{1,5}\\.?)?$", Pattern.CASE_INSENSITIVE);

    private static HypixelDetector instance;
    private boolean hypixel = false;

    public HypixelDetector() {
        instance = this;
    }

    public static HypixelDetector getInstance() {
        return instance;
    }

}