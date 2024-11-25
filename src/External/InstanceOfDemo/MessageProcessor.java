package External.InstanceOfDemo;

class Message {}

class TextMessage extends Message {
    private final String text;

    public TextMessage(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}

class ImageMessage extends Message {
    private final String imageUrl;

    public ImageMessage(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}

class VideoMessage extends Message {
    private final String videoUrl;

    public VideoMessage(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }
}

public class MessageProcessor {

    public static void main(String[] args) {
        Message textMessage =
                new TextMessage("Hello, world!");
        Message imageMessage =
                new ImageMessage
                        ("https://example.com/image.jpg");
        Message videoMessage =
                new VideoMessage
                        ("https://example.com/video.mp4");

        processMessage1(textMessage);
        processMessage1(imageMessage);
        processMessage1(videoMessage);
    }
    static void processMessage(Message message) {
        switch (message) {
            case TextMessage textMessage ->
                // Process text message
                    System.out.println
                            ("Processing text message: "
                                    + textMessage.getText());
            case ImageMessage imageMessage ->
                // Process image message
                    System.out.println
                            ("Processing image message: "
                                    + imageMessage.getImageUrl());
            case VideoMessage videoMessage ->
                // Process video message
                    System.out.println
                            ("Processing video message: "
                                    + videoMessage.getVideoUrl());
            case null, default ->
                // Unknown message type
                    System.out.println("Unknown message type");
        }
    }

    static void processMessage1(Message message) {
        switch (message) {
            case TextMessage textMessage -> System.out.println(
                    "Processing text message: "
                            + textMessage.getText());
            case ImageMessage imageMessage -> System.out.println
                    ("Processing image message: " +
                            imageMessage.getImageUrl());
            case VideoMessage videoMessage -> System.out.println
                    ("Processing video message: " +
                            videoMessage.getVideoUrl());
            case null, default -> System.out.println("Unknown message type");
        }
    }
}
