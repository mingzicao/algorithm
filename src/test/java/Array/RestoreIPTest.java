package Array;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class RestoreIPTest {
    RestoreIP rip = new RestoreIP();
    @Test
    void restore() {
        String ip  = "2552551111";
        List<String> list =  rip.Restore(ip);
        for (String i : list) {
            System.out.println(i);
        }
    }
    //"10809010"

    @Test
    void restore1() {
        String ip  = "10809010";
        List<String> list =  rip.Restore(ip);
        for (String i : list) {
            System.out.println(i);
        }
    }
}