package com.gavin.finance.message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by ligaozhao on 23/03/17.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseResp implements Serializable {

    private static final long serialVersionUID = 4783415515422978582L;

    private boolean success;

    private String message;
}
