package com.github.marcoscouto.pocenum.clients;

import com.github.marcoscouto.pocenum.dtos.AddressDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Address", url = "${host.address.url}")
public interface AddressClient {

    @GetMapping("/ws/{cep}/json")
    AddressDTO findAddress(@PathVariable String cep);
}
