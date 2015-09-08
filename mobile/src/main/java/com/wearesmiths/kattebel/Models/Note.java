package com.wearesmiths.kattebel.Models;

import com.google.gson.annotations.Expose;

public class Note {

    @Expose
    private String uuid;
    @Expose
    private String content;

    /**
     * Get the Unique Universal Identifier of the note
     * @return The Unique Universal Identifier of the note
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Set the Unique Universal Identifier of the note
     * @param uuid The uuid of the note
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * Get the text from the note
     * @return The text from the note
     */
    public String getContent() {
        return content;
    }

    /**
     * Set the content of the note (update the whole content)
     * @param content The new content for the note
     */
    public void setContent(String content) {
        this.content = content;
    }
}