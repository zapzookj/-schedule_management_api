package com.zapzookj.schedulemanageapp.dto;

import com.zapzookj.schedulemanageapp.entity.Schedule;
import lombok.Getter;

@Getter
public class ScheduleResponseDto {
    private Long id;
    private String title;
    private String contents;
    private String manager;
//    private String password;

    public ScheduleResponseDto(Schedule schedule){
        this.id = schedule.getId();
//        this.password = schedule.getPassword();
        this.title = schedule.getTitle();
        this.contents = schedule.getContents();
        this.manager = schedule.getManager();
    }
}
