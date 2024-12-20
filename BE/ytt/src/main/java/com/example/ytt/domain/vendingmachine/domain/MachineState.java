package com.example.ytt.domain.vendingmachine.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum MachineState {
    OPERATING("operating"), // 운영중
    OUT_OF_STOCK("out_of_stock"), // 품절
    ERROR("error"), // 오류
    WARNING("waring"), // 경고
    MAINTENANCE("maintenance"), // 점검
    UNKNOWN("unknown"); // 알수없음

    private final String state;

    public static MachineState from(String state) {
        for (MachineState machineState : MachineState.values()) {
            if (machineState.state.equalsIgnoreCase(state)) {
                return machineState;
            }
        }

        return UNKNOWN;
    }
}
