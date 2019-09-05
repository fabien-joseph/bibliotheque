/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.7).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.bibliotheque.api.service.api;
import com.bibliotheque.api.service.model.Livre;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-05T15:23:29.207Z")

@Api(value = "livres", description = "the livres API")
public interface LivresApi {

    @ApiOperation(value = "Ajouter un nouveau livre", nickname = "addLivre", notes = "", authorizations = {
            @Authorization(value = "basicAuth")
    }, tags = {"livre",})
    @ApiResponses(value = {
            @ApiResponse(code = 405, message = "Invalid input")})
    @RequestMapping(value = "/livres",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.POST)
    ResponseEntity<Void> addLivre(@ApiParam(value = "Un objet Livre doit être envoyé pour être ajouté", required = true) @Valid @RequestBody Livre body);


    @ApiOperation(value = "Supprimer un livre", nickname = "deleteLivre", notes = "", authorizations = {
            @Authorization(value = "basicAuth")
    }, tags = {"livre",})
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied"),
            @ApiResponse(code = 404, message = "livre not found")})
    @RequestMapping(value = "/livres/{livreId}",
            produces = {"application/json"},
            method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteLivre(@ApiParam(value = "ID du livre à supprimer", required = true) @PathVariable("livreId") Long livreId, @ApiParam(value = "") @RequestHeader(value = "api_key", required = false) String apiKey);


    @ApiOperation(value = "Lister des livres par critères", nickname = "findLivres", notes = "Plusieurs valeurs peuvent être séparées par une virgule", response = Livre.class, responseContainer = "List", authorizations = {
            @Authorization(value = "basicAuth")
    }, tags = {"livre",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful operation", response = Livre.class, responseContainer = "List"),
            @ApiResponse(code = 400, message = "Invalid status value")})
    @RequestMapping(value = "/livres",
            produces = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<List<Livre>> findLivres(@ApiParam(value = "Auteur ou nom du livre à trouver") @Valid @RequestParam(value = "search", required = false) String search);


    @ApiOperation(value = "Trouve un livre par son ID", nickname = "getLivreById", notes = "Trouve un livre par son ID", response = Livre.class, authorizations = {
            @Authorization(value = "basicAuth")
    }, tags = {"livre",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful operation", response = Livre.class),
            @ApiResponse(code = 400, message = "Invalid ID supplied"),
            @ApiResponse(code = 404, message = "livre not found")})
    @RequestMapping(value = "/livres/{livreId}",
            produces = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<Livre> getLivreById(@ApiParam(value = "ID of livre to return", required = true) @PathVariable("livreId") Long livreId);


    @ApiOperation(value = "Mettre à jour un livre avec un form data", nickname = "updateLivre", notes = "", authorizations = {
            @Authorization(value = "basicAuth")
    }, tags = {"livre",})
    @ApiResponses(value = {
            @ApiResponse(code = 405, message = "Invalid input")})
    @RequestMapping(value = "/livres/{livreId}",
            produces = {"application/json"},
            consumes = {"application/x-www-form-urlencoded"},
            method = RequestMethod.PUT)
    ResponseEntity<Void> updateLivre(@ApiParam(value = "ID du livre qui doit être mis à jour", required = true) @PathVariable("livreId") Long livreId, @ApiParam(value = "Mettre à jour le nom du livre") @RequestParam(value = "name", required = false) String name, @ApiParam(value = "Mettre à jour l'auteur d'un livre") @RequestParam(value = "auteur", required = false) String auteur, @ApiParam(value = "Mettre à jour la quantité d'un livre") @RequestParam(value = "quantite", required = false) Integer quantite);
}