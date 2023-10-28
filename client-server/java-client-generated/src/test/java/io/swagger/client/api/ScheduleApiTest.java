/*
 * Robot service 3.0
 * API сервис управления роботом - пылесосом.
 *
 * OpenAPI spec version: 1.0.11
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.model.Schedule;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ScheduleApi
 */
@Ignore
public class ScheduleApiTest {

    private final ScheduleApi api = new ScheduleApi();

    /**
     * Добавить расписание
     *
     * Добавить расписание в базу
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void addScheduleTest() throws Exception {
        Schedule body = null;
        Schedule response = api.addSchedule(body);

        // TODO: test validations
    }
    /**
     * Удалить расписание по ID
     *
     * Удаляет расписание
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteScheduleByIdTest() throws Exception {
        Long scheduleId = null;
        String scheduleId = null;
        Schedule response = api.deleteScheduleById(scheduleId, scheduleId);

        // TODO: test validations
    }
    /**
     * Найти расписание по ID
     *
     * вернуть одно расписание
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getScheduleByIdTest() throws Exception {
        Long scheduleId = null;
        Schedule response = api.getScheduleById(scheduleId);

        // TODO: test validations
    }
    /**
     * Обновить расписание
     *
     * Обновить расписание
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateScheduleTest() throws Exception {
        Schedule body = null;
        Schedule response = api.updateSchedule(body);

        // TODO: test validations
    }
}