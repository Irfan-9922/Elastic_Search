package service.api;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.bonprix.global.businesspartner.dto.Parameters;
import de.bonprix.global.businesspartner.dto.ValidityType;
import de.bonprix.global.businesspartner.operations.enums.ValidityTypeFilterEnum;
import de.bonprix.model.Paged;

/**
 * The Interface ValidityTypeService.
 *
 * @author p.maurya
 */
@Path("/validityTypes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface ValidityTypeService {

    /**
     * Find all.
     *
     * @param pagable the pagable
     * @return the list
     */
    @GET
    @Path("/")
    List<ValidityType> findAll(@BeanParam @Valid Paged pagable);

    /**
     * Find by id.
     *
     * @param validityTypeId the validity type id
     * @return the validity type
     */
    @GET
    @Path("/{validityTypeId : \\d+}")
    ValidityType findById(@NotNull @PathParam("validityTypeId") Long validityTypeId);

    /**
     * Creates the.
     *
     * @param validityType the validity type
     * @return the long
     */
    @POST
    @Path("/")
    Long create(ValidityType validityType);

    /**
     * Update.
     *
     * @param validityTypeId the validity type id
     * @param validityType the validity type
     */
    @PUT
    @Path("/{validityTypeId : \\d+}")
    void update(@NotNull @PathParam("validityTypeId") Long validityTypeId, ValidityType validityType);

    /**
     * Activate.
     *
     * @param validityTypeId the validity type id
     */
    @POST
    @Path("/{validityTypeId : \\d+}/activate")
    void activate(@NotNull @PathParam("validityTypeId") Long validityTypeId);

    /**
     * Deactivate.
     *
     * @param validityTypeId the validity type id
     */
    @POST
    @Path("/{validityTypeId : \\d+}/deactivate")
    void deactivate(@NotNull @PathParam("validityTypeId") Long validityTypeId);

    /**
     * Find all.
     *
     * @param params the params
     * @return the list
     */
    @POST
    @Path("/search")
    List<ValidityType> findAll(Parameters<ValidityTypeFilterEnum> params);

    /**
     * Count.
     *
     * @return the long
     */
    @GET
    @Path("/count")
    Long count();

}
