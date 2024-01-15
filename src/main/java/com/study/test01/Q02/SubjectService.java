package com.study.test01.Q02;

import java.util.List;

public class SubjectService {
    private List<String> subjects;

    public SubjectService(List<String> subjects) {
        this.subjects = subjects;
    }

    public void showSubjects() {
        int lenth = 3;
        for(int i = 0; i < lenth; i++) {
            System.out.println(subjects.get(i));
        }
    }
}
