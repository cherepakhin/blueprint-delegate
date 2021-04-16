package ru.perm.v.camunda;

import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.delegate.DelegateExecution;

@Slf4j
public class DelegateServiceImpl implements DelegateService {

    @Override
    public String request(String id) {
        log.info("class={} id={}", this, id);
        return id;
    }

    @Override
    public void callOnExecution(DelegateExecution delegateExecution) {
        log.info("========== callOnExecution");
    }
}
