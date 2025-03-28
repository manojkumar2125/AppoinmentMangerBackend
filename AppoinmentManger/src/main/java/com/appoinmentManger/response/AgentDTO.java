package com.appoinmentManger.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AgentDTO {
    private String name;
    private String date;
   private  String time;
   private  boolean isActive;
}
