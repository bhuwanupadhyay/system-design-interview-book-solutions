package io.github.bhuwanupadhyay.lbs.openapi.api;

import java.math.BigDecimal;
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
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-30T11:25:59.555712678-05:00[America/Chicago]")
public interface V1ApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /v1/search/nearby
     * Returns businesses based on certain search criteria. In real-life application, search result are usually paginated. 
     *
     * @param latitude Latitude of a given location (required)
     * @param longitude Longitude of a given location (required)
     * @param radius Search radius [Optional. Default is 500 meters (about 3 miles)] (optional)
     * @return List of business objects (status code 200)
     * @see V1Api#v1SearchNearbyGet
     */
    default ResponseEntity<Void> v1SearchNearbyGet(BigDecimal latitude,
        BigDecimal longitude,
        Integer radius) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
