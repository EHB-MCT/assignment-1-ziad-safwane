package ehb.be.challenge1_ziadsafwane_dev5
import java.io.File
class VideoPlayer {
    fun playVideo(input: String) {
        val videoFile = File("videos/$input.mp4")
        if (videoFile.exists()) {
            // Logic to play video, e.g., using a media player library
            println("Playing video: $input")
        } else {
            println("Video not found")
        }
    }
    fun stopVideo() {
        // Logic to stop video playback
        println("Stopping video")
    }
}
