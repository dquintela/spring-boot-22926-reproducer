package org.example.springboot.issue22926;

import io.micrometer.core.instrument.MeterRegistry;
import org.aopalliance.aop.Advice;
import org.springframework.aop.Pointcut;
import org.springframework.aop.interceptor.CustomizableTraceInterceptor;
import org.springframework.aop.support.AbstractPointcutAdvisor;
import org.springframework.aop.support.ComposablePointcut;
import org.springframework.beans.factory.InitializingBean;

import static org.springframework.aop.support.annotation.AnnotationMatchingPointcut.forClassAnnotation;
import static org.springframework.aop.support.annotation.AnnotationMatchingPointcut.forMethodAnnotation;

public class DummyMetricsAdvisor extends AbstractPointcutAdvisor implements InitializingBean {
    private CustomizableTraceInterceptor metricsInterceptor = new CustomizableTraceInterceptor(); // Switch to CustomizableTraceInterceptor has an example
    private Pointcut metricsPointcut = new ComposablePointcut(forMethodAnnotation(DummyMetricsAnnotation.class))
            .union(forClassAnnotation(DummyMetricsAnnotation.class));

    public void setMetricsInterceptor(CustomizableTraceInterceptor metricsInterceptor) {
        this.metricsInterceptor = metricsInterceptor;
    }

    public void setMeterRegistry(MeterRegistry meterRegistry) {
        // metricsInterceptor.setMeterRegistry(meterRegistry);
    }

    public void setPropagateMetricsException(boolean propagateMetricsException) {
        // metricsInterceptor.setPropagateMetricsException(propagateMetricsException);
    }

    public void afterPropertiesSet() {
        // metricsInterceptor.afterPropertiesSet();
    }

    @Override
    public Pointcut getPointcut() {
        return metricsPointcut;
    }

    @Override
    public Advice getAdvice() {
        return metricsInterceptor;
    }
}
