package sub10.service;
import java.util.ArrayList;
import java.util.List;

public class SLog {


        private List<String> logs = new ArrayList<>();

        public void log(String message) {
            logs.add(message);
            System.out.println(message);
        }


        public List<String> getLogs() {
            return logs;
        }
}
