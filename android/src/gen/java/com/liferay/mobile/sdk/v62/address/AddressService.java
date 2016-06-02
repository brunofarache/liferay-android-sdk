package com.liferay.mobile.sdk.v62.address;

import com.liferay.mobile.sdk.Call;
import com.liferay.mobile.sdk.annotation.Param;
import com.liferay.mobile.sdk.annotation.ParamObject;
import com.liferay.mobile.sdk.annotation.Path;
import com.liferay.mobile.sdk.http.Response;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("/address")
public interface AddressService {
  @Path("/add-address")
  Call<JSONObject> addAddress(@Param(name = "className") String className, @Param(name = "classPK") long classPK, @Param(name = "street1") String street1, @Param(name = "street2") String street2, @Param(name = "street3") String street3, @Param(name = "city") String city, @Param(name = "zip") String zip, @Param(name = "regionId") long regionId, @Param(name = "countryId") long countryId, @Param(name = "typeId") int typeId, @Param(name = "mailing") boolean mailing, @Param(name = "primary") boolean primary);

  @Path("/add-address")
  Call<JSONObject> addAddress(@Param(name = "className") String className, @Param(name = "classPK") long classPK, @Param(name = "street1") String street1, @Param(name = "street2") String street2, @Param(name = "street3") String street3, @Param(name = "city") String city, @Param(name = "zip") String zip, @Param(name = "regionId") long regionId, @Param(name = "countryId") long countryId, @Param(name = "typeId") int typeId, @Param(name = "mailing") boolean mailing, @Param(name = "primary") boolean primary, @ParamObject(name = "serviceContext", className = "com.liferay.portal.service.ServiceContext") JSONObject serviceContext);

  @Path("/delete-address")
  Call<Response> deleteAddress(@Param(name = "addressId") long addressId);

  @Path("/get-address")
  Call<JSONObject> getAddress(@Param(name = "addressId") long addressId);

  @Path("/get-addresses")
  Call<JSONArray> getAddresses(@Param(name = "className") String className, @Param(name = "classPK") long classPK);

  @Path("/update-address")
  Call<JSONObject> updateAddress(@Param(name = "addressId") long addressId, @Param(name = "street1") String street1, @Param(name = "street2") String street2, @Param(name = "street3") String street3, @Param(name = "city") String city, @Param(name = "zip") String zip, @Param(name = "regionId") long regionId, @Param(name = "countryId") long countryId, @Param(name = "typeId") int typeId, @Param(name = "mailing") boolean mailing, @Param(name = "primary") boolean primary);
}
