package dev.carlospavanetti.perfectplaylist.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Track {
    private String name;
    private String externalUrl;
    private String artist;
}
