/*
 * Copyright (C) 2009-2016 Typesafe Inc. <http://www.typesafe.com>
 */
package detailedtopics.configuration.headers;

//#filters
import play.mvc.EssentialFilter;
import play.filters.headers.SecurityHeadersFilter;
import play.http.HttpFilters;

import javax.inject.Inject;

public class Filters implements HttpFilters {

    @Inject
    SecurityHeadersFilter securityHeadersFilter;

    public EssentialFilter[] filters() {
        return new EssentialFilter[] { securityHeadersFilter.asJava() };
    }
}
//#filters