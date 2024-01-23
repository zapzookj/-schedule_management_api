package com.zapzookj.schedulemanageapp;

import com.zapzookj.schedulemanageapp.entity.Schedule;
import com.zapzookj.schedulemanageapp.repository.ScheduleRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.DisplayName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
@SpringBootTest
public class Test {
    @PersistenceContext
    EntityManager em;

    @Autowired
    ScheduleRepository scheduleRepository;

    @org.junit.jupiter.api.Test
    @Transactional
    @Rollback(value = false) // 테스트 코드에서 @Transactional 를 사용하면 테스트가 완료된 후 롤백하기 때문에 false 옵션 추가
    @DisplayName("일정 생성 성공")
    void test1() {
        Schedule schedule = new Schedule();
        schedule.setTitle("첫 일정");
        schedule.setContents("실험 중");
        schedule.setManager("이종원");
        schedule.setPassword("wkqwnr123");

        em.persist(schedule);
    }
}
