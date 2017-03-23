package com.gavin.finance.message.UserService;

import com.gavin.finance.message.BaseResp;
import com.gavin.finance.pojo.User;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by ligaozhao on 23/03/17.
 */
@Data
public class GetUserByIdResp extends BaseResp {

    private static final long serialVersionUID = -4163930134402185980L;

    private User user;

    public GetUserByIdResp(User user) {
        this.user = user;
    }

    public GetUserByIdResp(boolean success, String msg) {
        super(success, msg);
    }
}
