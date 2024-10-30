package utils;

import fr.diginamic.utils.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class StringUtilsTest {

    @Test
    void testLevenshteinDistance0() {
        int distance = StringUtils.levenshteinDistance("Chien", "Chien");
        assertEquals(0, distance);
    }

    @Test
    void testLevenshteinDistance1() {
        int distance = StringUtils.levenshteinDistance("Vienne", "Sienne");
        assertEquals(1, distance);
    }

    @Test
    void testLevenshteinDistance2() {
        int distance = StringUtils.levenshteinDistance("Chine","Chien");
        assertEquals(2, distance);
    }
}
