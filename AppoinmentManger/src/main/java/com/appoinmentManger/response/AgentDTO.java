package com.appoinmentManger.response;

import java.sql.Date;
import java.sql.Time;

public record AgentDTO(String name, String date, String time, boolean isActive) {
}
