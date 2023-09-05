package br.com.open.ai.cecg.OpenAI.http.impl;

import br.com.open.ai.cecg.OpenAI.http.data.request.ScienceFictionRequestDTO;
import br.com.open.ai.cecg.OpenAI.sevice.CallOpenAiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/openai-cecg")
public record OpenAIControllerImpl (CallOpenAiService service) implements OpenAIController {

    @Autowired
    @Override
    @PostMapping(value = "/science-fiction")
    @ResponseStatus(HttpStatus.OK)
    public String generateScienceFiciton(@RequestBody ScienceFictionRequestDTO requestDTO) {
        return service.generateScienceFiction(requestDTO);
    }
}
