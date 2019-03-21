package com.dhammananda.animesm.models;

import java.time.OffsetDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Member {

    private String fansId;
    private User user;
    private OffsetDateTime joinDate;

}
