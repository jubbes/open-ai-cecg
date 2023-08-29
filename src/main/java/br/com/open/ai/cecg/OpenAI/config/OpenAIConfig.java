package br.com.open.ai.cecg.OpenAI.config;

import com.theokanning.openai.service.OpenAiService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAIConfig {

    @Value("${}openai.secret")
    private String openAiSecret;

    @Bean
    public OpenAiService getOpenBean() {
        return new OpenAiService(openAiSecret);
    }
}
