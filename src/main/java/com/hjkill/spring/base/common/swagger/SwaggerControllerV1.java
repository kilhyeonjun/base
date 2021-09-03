package com.hjkill.spring.base.common.swagger;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@Api(value = "SwaggerControllerV1")
@RequestMapping("/v1/api")
public class SwaggerControllerV1 {

        @ApiOperation(value = "sample", notes = "테스트")
        @ApiResponses({
                @ApiResponse(code = 200, message = "ok"),
                @ApiResponse(code = 500, message = "server error"),
                @ApiResponse(code = 404, message = "not found"),
        })
    @GetMapping(value = "/test")
    public Map<String, String> SwaggerTest(
            @ApiParam(value = "번호", required = true, example = "1") @RequestParam String no) {
        Map<String, String> result = new HashMap<>();
        result.put("name", "otrogevym");
        return result;
    }
}
