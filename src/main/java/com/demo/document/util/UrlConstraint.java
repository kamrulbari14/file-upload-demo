package com.demo.document.util;

public final class UrlConstraint {
    private UrlConstraint() {
    }

    private static final String VERSION = "/v1";
    private static final String API = "/api";

    public static class MasterEntityViewManagement {
        public static final String ROOT = VERSION + API + "/masterentityview";
        public static final String GET = "/{masterEntityViewId}";
        public static final String GET_BY_PROVIDERID = "/getByProviderId/{providerId}";
        public static final String GET_BY_HRMID = "/getByHrmId/{hrmId}";
        public static final String GET_BY_PROVIDER_DESIGNATION = "/getByProvider/Designation/{providerDesignation}";
        public static final String GET_BY_COURSE_BATCH = "/getByCourse/getByBatch";
        public static final String GET_BY_HRMID_COURSEID_FISCALYEARID = "/getByHRM/getByCourse/getByFiscalYear";
    }

}