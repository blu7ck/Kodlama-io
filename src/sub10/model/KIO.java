package sub10.model;

import sub10.repository.KIO_Database;
import sub10.service.SLog;

public class KIO  {
    private String course;
    private String category;
    private String instructor;
    private int value;
    private SLog logService;
    private KIO_Database kioDatabase;

    public KIO(String course, String category, String instructor, int value, KIO_Database kioDatabase, SLog logService) {
        setCourse(course);
        setCategory(category);
        setInstructor(instructor);
        setValue(value);
        this.kioDatabase = kioDatabase;
        this.logService = logService;
    }

    public void add() {
        try {
            validate();
            kioDatabase.addData(this);
            logService.log("Kurs başarıyla eklendi: " + course);
        } catch (IllegalArgumentException e) {
            logService.log("Hata: " + e.getMessage());
        }
    }

    private void validate() {
        if (course == null || course.isEmpty()) {
            throw new IllegalArgumentException("Kurs ismi boş olamaz.");
        }
        if (kioDatabase.isCourseExists(course)) {
            throw new IllegalArgumentException("Kurs ismi zaten mevcut.");
        }
        if (kioDatabase.isCategoryExists(category)) {
            logService.log("Kategori zaten mevcut: " + category);
        }
            if (category == null || category.isEmpty()) {
                throw new IllegalArgumentException("Kategori ismi boş olamaz.");
            }
            if (value < 0) {
                throw new IllegalArgumentException("Kurs fiyatı 0'dan küçük olamaz.");
            }
        }


        public String getCourse () {
            return course;
        }

        public void setCourse (String course){
            this.course = course;
        }

        public String getCategory () {
            return category;
        }

        public void setCategory (String category){
            this.category = category;
        }

        public String getInstructor () {
            return instructor;
        }

        public void setInstructor (String instructor){
            this.instructor = instructor;
        }

        public int getValue () {
            return value;
        }

        public void setValue ( int value){
            this.value = value;
        }

    }

