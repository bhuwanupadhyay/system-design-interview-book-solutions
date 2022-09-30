/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package io.github.bhuwanupadhyay.business.openapi.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-30T11:30:07.106510931-05:00[America/Chicago]")
@Validated
@Tag(name = "v1", description = "the v1 API")
@RequestMapping("${openapi.proximityServiceBusiness.base-path:}")
public interface V1Api {

    default V1ApiDelegate getDelegate() {
        return new V1ApiDelegate() {};
    }

    /**
     * DELETE /v1/businesses/:id
     * Delete a business 
     *
     * @param id Business id (required)
     * @return Ok (status code 200)
     */
    @Operation(
        operationId = "v1BusinessesIdDelete",
        responses = {
            @ApiResponse(responseCode = "200", description = "Ok", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/v1/businesses/:id",
        produces = { "application/json" }
    )
    default ResponseEntity<Object> v1BusinessesIdDelete(
        @Parameter(name = "id", description = "Business id", required = true) @PathVariable("id") Integer id
    ) {
        return getDelegate().v1BusinessesIdDelete(id);
    }


    /**
     * GET /v1/businesses/:id
     * Return detailed information about a business 
     *
     * @param id Business id (required)
     * @return Ok (status code 200)
     */
    @Operation(
        operationId = "v1BusinessesIdGet",
        responses = {
            @ApiResponse(responseCode = "200", description = "Ok", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/v1/businesses/:id",
        produces = { "application/json" }
    )
    default ResponseEntity<Object> v1BusinessesIdGet(
        @Parameter(name = "id", description = "Business id", required = true) @PathVariable("id") Integer id
    ) {
        return getDelegate().v1BusinessesIdGet(id);
    }


    /**
     * PUT /v1/businesses/:id
     * Update details of a business 
     *
     * @param id Business id (required)
     * @param body updated on business object (required)
     * @return Ok (status code 200)
     */
    @Operation(
        operationId = "v1BusinessesIdPut",
        responses = {
            @ApiResponse(responseCode = "200", description = "Ok", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/v1/businesses/:id",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Object> v1BusinessesIdPut(
        @Parameter(name = "id", description = "Business id", required = true) @PathVariable("id") Integer id,
        @Parameter(name = "body", description = "updated on business object", required = true) @Valid @RequestBody Object body
    ) {
        return getDelegate().v1BusinessesIdPut(id, body);
    }


    /**
     * POST /v1/businesses
     * Add a business 
     *
     * @param body new business object (required)
     * @return Ok (status code 200)
     */
    @Operation(
        operationId = "v1BusinessesPost",
        responses = {
            @ApiResponse(responseCode = "200", description = "Ok", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/v1/businesses",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Object> v1BusinessesPost(
        @Parameter(name = "body", description = "new business object", required = true) @Valid @RequestBody Object body
    ) {
        return getDelegate().v1BusinessesPost(body);
    }

}
