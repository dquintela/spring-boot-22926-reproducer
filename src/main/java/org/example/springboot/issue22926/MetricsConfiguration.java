package org.example.springboot.issue22926;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.binder.jvm.JvmCompilationMetrics;
import io.micrometer.core.instrument.binder.jvm.JvmHeapPressureMetrics;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class MetricsConfiguration {
    private final MeterRegistry meterRegistry;

    public MetricsConfiguration(@Lazy MeterRegistry meterRegistry) {
        this.meterRegistry = meterRegistry;
    }

    @Bean
    public DummyMetricsAdvisor metricsAdvisor() {
        DummyMetricsAdvisor advisor = new DummyMetricsAdvisor();
        advisor.setMeterRegistry(meterRegistry);
        return advisor;
    }

    @Bean
    // Not include automatically at JvmMetricsAutoConfiguration
    public JvmCompilationMetrics jvmCompilationMetrics() {
        return new JvmCompilationMetrics();
    }

    @Bean
    // Not include automatically at JvmMetricsAutoConfiguration
    public JvmHeapPressureMetrics jvmHeapPressureMetrics() {
        return new JvmHeapPressureMetrics();
    }
}
