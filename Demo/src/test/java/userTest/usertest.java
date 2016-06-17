
package userTest;

import com.zzyo.service.UserService;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created by zzyo on 2016/6/16.
 */
public class usertest {

    @Resource
    private UserService userService;

    @Test
    public void getuser() throws Exception {
        userService.findUsers();
    }
}
