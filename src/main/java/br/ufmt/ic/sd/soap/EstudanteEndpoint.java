package br.ufmt.ic.sd.soap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import soap.sd.ic.ufmt.br.estudantes.GetEstudanteRequest;
import soap.sd.ic.ufmt.br.estudantes.GetEstudanteResponse;

@Endpoint
public class EstudanteEndpoint {
	public static final String NAMESPACE_URI = "br.ufmt.ic.sd.soap/estudantes";
	
	private EstudanteRepository estudanteRepository;
	
	@Autowired
	public EstudanteEndpoint(EstudanteRepository estudanteRepository) {
		this.estudanteRepository = estudanteRepository;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getEstudanteRequest")
	@ResponsePayload
	public GetEstudanteResponse getEstudante(@RequestPayload GetEstudanteRequest request) {
		GetEstudanteResponse response = new GetEstudanteResponse();
		response.setEstudante(estudanteRepository.findEstudante(request.getRga()));
		
		return response;
	}
}
