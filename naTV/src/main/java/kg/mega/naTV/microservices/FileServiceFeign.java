package kg.mega.naTV.microservices;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "${micro.fileService.name}", url = "${micro.fileService.url}")
public interface FileServiceFeign {


}
