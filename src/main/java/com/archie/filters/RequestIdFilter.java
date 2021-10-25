package com.archie.filters;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

@Component
@Slf4j
@Order(Ordered.HIGHEST_PRECEDENCE)
public class RequestIdFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
                                    FilterChain filterChain) throws IOException, ServletException {
        MDC.clear();
        long startTime = System.currentTimeMillis();
        String requestId = UUID.randomUUID().toString();
        String requestIdHeader = "REQ_ID";
        MDC.put(requestIdHeader, requestId);
        response.setHeader(requestIdHeader, requestId);

        log.info("Started request: Url:{}::{}", request.getMethod(), request.getRequestURI());
        filterChain.doFilter(request, response);
        log.info("Completed request: Url:{}::{}; time taken:{}ms; statusCode:{} ", request.getMethod(),
                request.getRequestURI(), (System.currentTimeMillis() - startTime), response.getStatus());
    }
}