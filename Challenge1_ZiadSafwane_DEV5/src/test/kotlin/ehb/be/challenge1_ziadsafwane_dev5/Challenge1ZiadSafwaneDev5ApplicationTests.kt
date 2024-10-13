package ehb.be.challenge1_ziadsafwane_dev5

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

class ApplicationTests {
    @Test
    fun testPlayVideo() {
        val player = VideoPlayer()
        player.playVideo("sample")
        // You would check if the video plays correctly, for now, print statements will show
    }

    @Test
    fun testDnDMapDesigner() {
        val mapDesigner = DnDMapDesigner()
        mapDesigner.placeAsset("tree", 10, 15, 2, "north")
        // Check asset placement logic, again using print statements or actual logic
    }
}

