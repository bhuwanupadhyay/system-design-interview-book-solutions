package io.github.bhuwanupadhyay.business.openapi.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * A delegate to be called by the {@link V1ApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-30T11:25:58.512623925-05:00[America/Chicago]")
public interface V1ApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /v1/businesses/:id
     * Delete a business 
     *
     * @param id Business id (required)
     * @return Ok (status code 200)
     * @see V1Api#v1BusinessesIdDelete
     */
    default ResponseEntity<Object> v1BusinessesIdDelete(Integer id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /v1/businesses/:id
     * Return detailed information about a business 
     *
     * @param id Business id (required)
     * @return Ok (status code 200)
     * @see V1Api#v1BusinessesIdGet
     */
    default ResponseEntity<Object> v1BusinessesIdGet(Integer id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /v1/businesses/:id
     * Update details of a business 
     *
     * @param id Business id (required)
     * @param body updated on business object (required)
     * @return Ok (status code 200)
     * @see V1Api#v1BusinessesIdPut
     */
    default ResponseEntity<Object> v1BusinessesIdPut(Integer id,
        Object body) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /v1/businesses
     * Add a business 
     *
     * @param body new business object (required)
     * @return Ok (status code 200)
     * @see V1Api#v1BusinessesPost
     */
    default ResponseEntity<Object> v1BusinessesPost(Object body) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
