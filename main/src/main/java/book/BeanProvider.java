package book;

import org.springframework.context.annotation.Bean;

/**
 * Created by yhan on 3/8/15.
 */
public class BeanProvider {
    @Bean
    MessageService mockMessageService() {
        return new MessageService() {
            public String getMessage() {
                return "Buenos!!!!";
            }
        };
    }
}