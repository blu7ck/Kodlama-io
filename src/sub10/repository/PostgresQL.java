package sub10.repository;

import sub10.model.KIO;

import java.util.ArrayList;
import java.util.List;

public class PostgresQL implements KIO_Database {
    private List<KIO> data = new ArrayList<>();

    public void addData(KIO kio) {
        if (kio == null) {
            throw new IllegalArgumentException("KIO nesnesi null olamaz.");
        }else  System.out.println("Postgres Added");
        data.add(kio);
    }
    @Override
    public boolean isCourseExists(String courseName) {
        return data.stream().anyMatch(kio -> kio.getCourse().equalsIgnoreCase(courseName));
    }
    @Override
    public boolean isCategoryExists(String categoryName) {
        return data.stream().anyMatch(kio -> kio.getCategory().equalsIgnoreCase(categoryName));
    }
}
