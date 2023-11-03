package com.trinm.project1.configure;

import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : HCM23_FRF_FJB_04_TriNM
 * @since : 11/3/2023, Fri
 **/


@Configuration
@EnableCaching
public class CacheClearingApp {

    @Bean
    public CacheManager cacheManager() {
        return new ConcurrentMapCacheManager("exampleCache");
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CacheClearingApp.class);
        CacheManager cacheManager = context.getBean(CacheManager.class);

        // Clear the cache
        String cacheName = "exampleCache";
        Cache cache = cacheManager.getCache(cacheName);
        if (cache != null) {
            cache.clear();
            System.out.println("Cache '" + cacheName + "' cleared.");
        } else {
            System.out.println("Cache '" + cacheName + "' not found.");
        }

        context.close();
    }
}