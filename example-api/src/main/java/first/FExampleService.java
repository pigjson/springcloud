package first;

import first.impl.FExampleServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(name = "example-service", path = "", fallback = FExampleServiceImpl.class)
public interface FExampleService {

        @RequestMapping(value = "/exampleController/testPost", method = RequestMethod.POST)
        Object querySystemInitData();


}
