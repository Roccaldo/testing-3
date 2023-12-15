import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private Main test = new Main();

    @org.junit.jupiter.api.Test
    void main() {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String dataFull = data.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
        assertEquals("01 marzo 2023", dataFull);
    }
}