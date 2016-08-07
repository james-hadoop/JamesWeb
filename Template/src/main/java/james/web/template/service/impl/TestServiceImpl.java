package james.web.template.service.impl;

import james.web.template.service.ITestService;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements ITestService {
    @Override
    public void test() {
        System.out.println("TestServiceImpl/test() called");
    }

}
