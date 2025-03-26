package com.appoinmentManger;

import com.appoinmentManger.entity.Agent;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Util {
    public Map<String, List<Agent>> groupAgentsByName(List<Agent> agents) {
        Map<String, List<Agent>> groupedAgents = new HashMap<>();

        for (Agent agent : agents) {
            // If the name is not already in the map, create a new list for it
            groupedAgents.computeIfAbsent(agent.getName(), k -> new ArrayList<>()).add(agent);
        }

        return groupedAgents;
    }
}
