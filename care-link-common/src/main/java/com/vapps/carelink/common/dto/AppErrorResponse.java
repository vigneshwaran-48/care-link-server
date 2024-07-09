package com.vapps.carelink.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppErrorResponse {

    private int status;
    private String error;
    private LocalDateTime time;
    private String path = "/";

}
