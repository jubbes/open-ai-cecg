package br.com.open.ai.cecg.OpenAI.sevice;

import br.com.open.ai.cecg.OpenAI.http.data.request.ScienceFictionRequestDTO;

public interface CallOpenAiService {

    String generateScienceFiction(ScienceFictionRequestDTO requestDTO);
}
