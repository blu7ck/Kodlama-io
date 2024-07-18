package sub10.repository;

import sub10.model.KIO;

public interface KIO_Database {

  void addData(KIO kio);

  boolean isCategoryExists(String category);

  boolean isCourseExists(String course);

}
