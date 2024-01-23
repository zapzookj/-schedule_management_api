package com.zapzookj.schedulemanageapp.dto;

import com.zapzookj.schedulemanageapp.entity.Schedule;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ScheduleResponseDto {
    private Long id;
    private String title;
    private String contents;
    private String manager;
    private LocalDateTime createAt;
    private LocalDateTime modifiedAt;

    public ScheduleResponseDto(Schedule schedule){
        this.id = schedule.getId();
        this.title = schedule.getTitle();
        this.contents = schedule.getContents();
        this.manager = schedule.getManager();
        this.createAt = schedule.getCreatedAt();
        this.modifiedAt = schedule.getModifiedAt();
    }
}
