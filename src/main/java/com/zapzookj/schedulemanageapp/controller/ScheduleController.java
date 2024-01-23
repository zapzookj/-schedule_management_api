package com.zapzookj.schedulemanageapp.controller;

import com.zapzookj.schedulemanageapp.dto.ScheduleRequestDto;
import com.zapzookj.schedulemanageapp.dto.ScheduleResponseDto;
import com.zapzookj.schedulemanageapp.service.ScheduleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ScheduleController {

    private final ScheduleService scheduleService;

    public ScheduleController(ScheduleService scheduleService){
        this.scheduleService = scheduleService;
    }
    @PostMapping("/schedules")
    public ScheduleResponseDto createSchedule(@RequestBody ScheduleRequestDto requestDto){
        return scheduleService.createSchedule(requestDto);
    }

    @GetMapping("/schedules")
    public List<ScheduleResponseDto> getSchedules(){
        return scheduleService.getSchedules();
    }

    @PutMapping("/schedules/{id}")
    public ScheduleResponseDto updateSchedule(@PathVariable Long id, @RequestBody ScheduleRequestDto requestDto){
        return scheduleService.updateSchedule(id, requestDto);
    }

    @DeleteMapping("/schedules/{id}")
    public ScheduleResponseDto deleteSchedule(@PathVariable Long id, @RequestBody String password){
        password = password.trim();
        return scheduleService.deleteSchedule(id,password);
    }
}
