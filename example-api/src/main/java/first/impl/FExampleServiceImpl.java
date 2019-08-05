package first.impl;

import first.FExampleService;
import org.springframework.stereotype.Component;

/**
 * 测试example
 */
@Component
public class FExampleServiceImpl implements FExampleService {
    @Override
    public Object querySystemInitData() {
        return "出错了";
    }
}
