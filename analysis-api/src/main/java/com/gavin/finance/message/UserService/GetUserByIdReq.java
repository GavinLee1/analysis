package com.gavin.finance.message.UserService;

import com.gavin.finance.message.BaseReq;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by ligaozhao on 23/03/17.
 */
@Data
public class GetUserByIdReq extends BaseReq {
    private static final long serialVersionUID = -6659517968675958801L;
    private Integer id;

    public GetUserByIdReq() {
    }

    public GetUserByIdReq(Integer id) {
        this.id = id;
    }
}
