package com.example.api.Configure;

/**
 * @author : HCM23_FRF_FJB_04_TriNM
 * @since : 11/2/2023, Thu
 **/


public interface API {

    String API = "/api/v1";

    String PING = API + "/ping";

    String GET_USER = API + "/get/user-info";
    String insertUser = API + "/insert/user";
    String updateUser = API + "/update/user";
    String deleteUser = API + "/delete/user";

}
